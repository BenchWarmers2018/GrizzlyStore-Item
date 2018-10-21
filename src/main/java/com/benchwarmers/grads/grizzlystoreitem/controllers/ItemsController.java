package com.benchwarmers.grads.grizzlystoreitem.controllers;

import com.benchwarmers.grads.grizzlystoreitem.Data;
import com.benchwarmers.grads.grizzlystoreitem.JsonResponse;
import com.benchwarmers.grads.grizzlystoreitem.entities.Category;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import com.benchwarmers.grads.grizzlystoreitem.repositories.CategoryRepository;
import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.json.JSONObject;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;
import java.util.function.Function;

@RestController
@RequestMapping(path = "/items")
@CrossOrigin
public class ItemsController {
    @Autowired
    ItemRepository itemRepository;

    @Autowired
    CategoryRepository categoryRepository;

    //This function returns all items and details
    @RequestMapping("/all")
    public ResponseEntity getAllItems() {
        JsonResponse response = new JsonResponse();

        List<Data> items2 = new ArrayList<>();
        List<Item> items = itemRepository.findAll();

        items2.addAll(items);

        response.setStatus(HttpStatus.OK);
        response.addAllEntities(items2);

        return response.createResponse();
    }


    //This function returns an item and all details
    @RequestMapping("/id")
    public ResponseEntity getItemWithId(@RequestParam String itemId) {
        Item item;
        item = itemRepository.findItemByIdItem(Integer.parseInt(itemId));
        //This checks if the id exists in the database it will return the item else it return a bad request.
        if (!itemRepository.existsByIdItem(Integer.parseInt(itemId))) {
            JsonResponse response = new JsonResponse();
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.addErrorMessage("Id does not exist");
            return response.createResponse();
        } else {
            JsonResponse response = new JsonResponse();
            response.setStatus(HttpStatus.OK);
            response.addEntity(item);
            return response.createResponse();
        }
    }

    @RequestMapping(value = "/multiple/ids", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
    public ResponseEntity getMultipleItemswithIds(@RequestBody String json)
    {
        JsonResponse response = new JsonResponse();
        JSONObject jsonObject = new JSONObject(json);
        JSONArray idArray = jsonObject.getJSONArray("itemIdList");
        List<Integer> idList = new ArrayList<>();
        if (idArray != null) {
            for (int i=0;i<idArray.length();i++){
                idList.add(idArray.getInt(i));
            }
        }
        for(Integer i : idList)
        {
            if(itemRepository.existsByIdItem(i))
            {
                response.addEntity(itemRepository.findItemByIdItem(i));
            }
        }
        response.setStatus(HttpStatus.OK);
        return response.createResponse();
    }


    /* localhost:8080/items/page?page=0&size=5 */
    @RequestMapping(path = "/page")
    public Page<Item> getPagedItems (@RequestParam Integer size, @RequestParam Integer page) {

        Page<Item> p = itemRepository.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.ASC,"itemName")));

        return p;
    }

    @RequestMapping(path = "/page/filtered")
    public Page<Item> searchPagedItemFromFilters(@RequestParam String name,
                                                 @RequestParam String text,
                                                 @RequestParam String sortBy,
                                                 @RequestParam double minPrice,
                                                 @RequestParam double maxPrice,
                                                 @RequestParam Integer size,
                                                 @RequestParam Integer page) {


        List<List<Item>> combined = new ArrayList<>();
        List<Item> fullList = itemRepository.findAll();
        combined.add(fullList);


        //Empty arrays
        List<Item> catList = new ArrayList<>();
        List<Item> searchList = new ArrayList<>();
        List<Item> priceList = new ArrayList<>();


        System.out.println("Values are " + name + " " + text + " " + sortBy + " " + minPrice + " " + maxPrice + " ");
        if (name.length() > 0) {
            System.out.println("Name length is " + name.length());
            catList = itemRepository.findAllByCategory_CategoryName(name);
            combined.add(catList);
        }
        if (text.length() > 0) {
            System.out.println("Search is " + text.length());
            searchList = itemRepository.findAllByItemNameContainsOrItemDescriptionContains(text, text);
            combined.add(searchList);
        }

        System.out.println("Prices are " + minPrice + " " + maxPrice);
        if (minPrice >= 0 && maxPrice > 0 && minPrice < maxPrice) {
            priceList = itemRepository.findAllByItemPriceBetween(minPrice, maxPrice);
            combined.add(priceList);
        }


        System.out.println("Full List size is" + fullList.size());
        System.out.println("catList List size is" + catList.size());
        System.out.println("searchList List size is" + searchList.size());
        System.out.println("priceList List size is" + priceList.size());
        Set<Item> finalSet = getCommonElements(combined);

        //Initialise final list to be used
        List<Item> finalList = new ArrayList<>(finalSet);
        //Converting set to list for pagination.
//        for(Item item : finalSet)
////        {
////            finalList.add(item);
////        }
        //Calculate min and max for the returned items

        if (finalList.size() > 0) {
            Item minItem = finalList
                    .stream()
                    .min(Comparator.comparing(Item::getItemPrice))
                    .orElseThrow(NoSuchElementException::new);
            Item maxItem = finalList
                    .stream()
                    .max(Comparator.comparing(Item::getItemPrice))
                    .orElseThrow(NoSuchElementException::new);


            //Sorting final list
            if (sortBy.equalsIgnoreCase("lowtohigh")) {
                System.out.println("It was " + sortBy);
                finalList.sort(Comparator.comparing(Item::getItemPrice));
            } else if (sortBy.equalsIgnoreCase("hightolow")) {
                finalList.sort(Comparator.comparing(Item::getItemPrice).reversed());
            } else {
                System.out.println("It was fianlly " + sortBy);
                finalList.sort(Comparator.comparing(Item::getItemName));
            }


            PagedListHolder tempPage = new PagedListHolder(finalList);
            tempPage.setPageSize(size); // number of items per page
            tempPage.setPage(page);

            Page p = new Page() {

                @Override
                public int getTotalPages() {
                    return tempPage.getPageCount();
                }

                @Override
                public long getTotalElements() {
                    return tempPage.getNrOfElements();
                }

                @Override
                public Page map(Function function) {
                    return null;
                }

                @Override
                public int getNumber() {
                    return tempPage.getPage();
                }

                @Override
                public int getSize() {
                    //Sending out minimum price
                    return (int) minItem.getItemPrice();
                }

                @Override
                public int getNumberOfElements() {
                    //Sending out maximum price
                    return (int) maxItem.getItemPrice();
                }

                @Override
                public List getContent() {
                    return tempPage.getPageList();
                }

                @Override
                public boolean hasContent() {
                    return tempPage.getPageList().size() > 0;
                }

                @Override
                public Sort getSort() {
                    return null;
                }

                @Override
                public boolean isFirst() {
                    return tempPage.isFirstPage();
                }

                @Override
                public boolean isLast() {
                    return tempPage.isLastPage();
                }

                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public boolean hasPrevious() {
                    return false;
                }

                @Override
                public Pageable nextPageable() {
                    return null;
                }

                @Override
                public Pageable previousPageable() {
                    return null;
                }

                @Override
                public Iterator iterator() {
                    return null;
                }
            };
            return p;
        }

        Page emptyPage = new PageImpl(finalList);

        // number of pages
        // a List which represents the current page

        //Page<Item> tempPage = new PageImpl<Item>(finalList, PageRequest.of(page,size), finalList.size());
        System.out.println("finalList List size is" + finalList.size());
        return emptyPage;
    }


    public static <T> Set<T> getCommonElements(Collection<? extends Collection<T>> collections) {

        Set<T> common = new LinkedHashSet<T>();
        if (!collections.isEmpty()) {
            Iterator<? extends Collection<T>> iterator = collections.iterator();
            common.addAll(iterator.next());
            while (iterator.hasNext()) {
                common.retainAll(iterator.next());
            }
        }
        return common;
    }

    @RequestMapping(path = "/addItem", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity addNewItem(@RequestParam("file") MultipartFile file,
                                     @RequestParam("item") String itemString,
                                     @RequestParam("category") String itemCategory) {
        Category category = categoryRepository.findCategoryByCategoryName(itemCategory);
        JsonResponse response = new JsonResponse();
        Gson g = new Gson();
        Item item = g.fromJson(itemString, Item.class);
        //item.setCategory(category);
        if (!file.isEmpty()) {
            try {
                System.out.println("POST REQUEST ACCEPTED");
                String uploadDir = "/opt/images/grizzlystore/";
                String filename = file.getOriginalFilename();
                String filePath = uploadDir + filename;
                if (!new File(uploadDir).exists()) {
                    System.out.println("Directory does not exist");
                    new File(uploadDir).mkdirs();
                }
                File dest = new File(filePath);
                file.transferTo(dest);
                item.setItemImage("http://bw.ausgrads.academy/images/grizzlystore/" + filename);
            } catch (Exception e) {
                System.out.println(e.toString());
                createErrorMessage(response, "Unable add item. " + e.toString());
                return response.createResponse();
            }
        } else {
            createErrorMessage(response, "Please specify a non-empty item image.");
            return response.createResponse();
        }
        category.addItemToList(item);
        categoryRepository.save(category);
        System.out.println(itemCategory + ' ' + item.getItemName() + ' ' + item.getItemDescription() + ' '
                + item.getItemPrice() + ' ' + item.getItemStockLevel() + ' ' + item.getItemSalePercentage());
        response.setStatus(HttpStatus.OK);
        response.addEntity(item);
        return response.createResponse();
    }

    @RequestMapping(path = "/remove", method = RequestMethod.POST)
    public ResponseEntity removeItem(@RequestBody Item item) {
        JsonResponse response = new JsonResponse();
        Item itemToDelete = itemRepository.findItemByIdItem(item.getIdItem());
        if (itemToDelete != null) {
            itemToDelete.getCategory().getItems().remove(itemToDelete);
            itemRepository.deleteById(item.getIdItem());
            response.setStatus(HttpStatus.OK);
            response.addEntity(itemToDelete);
        }
        else {
            response.addErrorMessage("Item does not exist!");
            response.setStatus(HttpStatus.NOT_ACCEPTABLE);
        }
        return response.createResponse();
    }

    // Allows edits to be made to existing items
    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public ResponseEntity updateItem(@RequestParam("item") String itemJson, @RequestParam("file") Optional<MultipartFile> uploadedFile) {
        JsonResponse response = new JsonResponse();
        Gson g = new Gson();
        Item item = g.fromJson(itemJson, Item.class);

        String enteredItemName = item.getItemName();
        String enteredItemDescription = item.getItemDescription();
        Double enteredItemPrice = item.getItemPrice();
        Integer enteredItemSalePercentage= item.getItemSalePercentage();
        Integer enteredItemStockLevel = item.getItemStockLevel();

        Boolean isDifferentImage = false;
        MultipartFile file = null;

        // Check if a file was uploaded and check if the image is different (based on filename)
        if (uploadedFile.isPresent())
        {
            file = uploadedFile.get();
            isDifferentImage = !item.getItemImage().equals("/Users/723303/Desktop/images/grizzlystore/" + file.getOriginalFilename());
            System.out.println("This is a different image: " + isDifferentImage);
        }

        // Check whether there's a different image uploaded or whether all input fills have entries
        if(isDifferentImage || (!isNullOrEmpty(enteredItemName) && !isNullOrEmpty(enteredItemDescription)
            && !enteredItemPrice.isNaN() && !isNullOrEmpty(enteredItemSalePercentage.toString())
            && !isNullOrEmpty(enteredItemStockLevel.toString())) )
        {
            Item existingItem = itemRepository.findItemByIdItem(item.getIdItem());


            if (equals(item, existingItem) && !isDifferentImage)
            {
                createErrorMessage(response, "No changes detected.");
            }
            else
            {
                // Update the existing item with the new details
                existingItem.setItemName(enteredItemName);
                existingItem.setItemDescription(enteredItemDescription);
                existingItem.setItemPrice(enteredItemPrice);
                existingItem.setItemSalePercentage(enteredItemSalePercentage);
                existingItem.setItemStockLevel(enteredItemStockLevel);

                // Upload the new image if it's different
                if (isDifferentImage)
                {
                    try
                    {
                        String uploadDir = "/opt/images/grizzlystore/";
                        String filename = file.getOriginalFilename();
                        String filePath = uploadDir + filename;
                        if (!new File(uploadDir).exists())
                        {
                            new File(uploadDir).mkdirs();
                        }
                        File dest = new File(filePath);
                        file.transferTo(dest);
                        existingItem.setItemImage("http://bw.ausgrads.academy/images/grizzlystore/" + filename);
                    }
                    catch (Exception e)
                    {
                        System.out.println(e.toString());
                        createErrorMessage(response, "Unable to upload the image. " + e.toString());
                        return response.createResponse();
                    }
                }

                itemRepository.save(existingItem);
                response.setStatus(HttpStatus.OK);
                response.addEntity(existingItem);
            }
        }
        else
        {
            createErrorMessage(response,"Please resolve all input errors then try again!");
        }

        return response.createResponse();
    }


    // Checks whether input is null and if it is empty
    private Boolean isNullOrEmpty(String input) { return (input.isEmpty() || input.equals(null)); }

    // Adds an error message to a JsonResponse using the string that is specified
    private void createErrorMessage(JsonResponse response, String string) {
        response.setStatus(HttpStatus.NOT_ACCEPTABLE);
        response.addErrorMessage(string);
    }


    // Checks whether the new and existing item are equal
    private Boolean equals(Item newItem, Item existingItem) {
        return newItem.getItemDescription().equals(existingItem.getItemDescription())
                && newItem.getItemName().equals(existingItem.getItemName())
                && newItem.getItemPrice() == existingItem.getItemPrice()
                && newItem.getItemSalePercentage() == existingItem.getItemSalePercentage()
                && newItem.getItemStockLevel() == existingItem.getItemStockLevel();
    }
}
