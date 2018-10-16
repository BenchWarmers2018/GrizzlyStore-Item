package com.benchwarmers.grads.grizzlystoreitem.controllers;

import com.benchwarmers.grads.grizzlystoreitem.Data;
import com.benchwarmers.grads.grizzlystoreitem.JsonResponse;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.data.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Resource;

import java.util.*;
import java.util.function.Function;

@RestController
@RequestMapping(path = "/items")
@CrossOrigin
public class ItemsController
{
    @Autowired
    ItemRepository itemRepository;

    //This function returns all items and details
    @RequestMapping("/all")
    public ResponseEntity getAllItems()
    {
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
    public ResponseEntity getItemWithId(@RequestParam String itemId)
    {
        Item item;
        item = itemRepository.findItemByIdItem(Integer.parseInt(itemId));
        //This checks if the id exists in the database it will return the item else it return a bad request.
        if(!itemRepository.existsByIdItem(Integer.parseInt(itemId)))
        {
            JsonResponse response = new JsonResponse();
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.addErrorMessage("Id does not exist");
            return response.createResponse();
        }
        else
        {
            JsonResponse response = new JsonResponse();
            response.setStatus(HttpStatus.OK);
            response.addEntity(item);
            return response.createResponse();
        }
    }



    /* localhost:8080/items/page?page=0&size=5 */

    public Page<Item> getPagedItems (@RequestParam Integer size, @RequestParam Integer page) {
        Page<Item> p = itemRepository.findAll(PageRequest.of(page, size));
        return p;
    }

    @RequestMapping(path = "/page/filtered")
    public Page<Item> searchPagedItemFromFilters(@RequestParam String name,
                                                @RequestParam String text,
                                                @RequestParam String sortBy,
                                                @RequestParam double minPrice,
                                                @RequestParam double maxPrice,
                                                @RequestParam Integer size,
                                                @RequestParam Integer page)
    {



        List<List<Item>> combined = new ArrayList<>();
        List<Item> fullList = itemRepository.findAll();
        combined.add(fullList);


        //Empty arrays
        List<Item> catList = new ArrayList<>();
        List<Item> searchList = new ArrayList<>();
        List<Item> priceList = new ArrayList<>();


        System.out.println("Values are " + name + " " + text + " " + sortBy + " " + minPrice + " " + maxPrice+ " ");
        if(name.length()>0)
        {
            System.out.println("Name length is " + name.length());
            catList = itemRepository.findAllByCategory_CategoryName(name);
            combined.add(catList);
        }
        if(text.length()>0)
        {
            System.out.println("Search is " + text.length());
            searchList = itemRepository.findAllByItemNameContainsOrItemDescriptionContains(text, text);
            combined.add(searchList);
        }

        System.out.println("Prices are " + minPrice + " " + maxPrice);
        if(minPrice >= 0 && maxPrice >0 && minPrice < maxPrice){
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

        if(finalList.size()>0)
        {
           Item minItem = finalList
                    .stream()
                    .min(Comparator.comparing(Item::getItemPrice))
                    .orElseThrow(NoSuchElementException::new);
           Item maxItem = finalList
                    .stream()
                    .max(Comparator.comparing(Item::getItemPrice))
                    .orElseThrow(NoSuchElementException::new);


            //Sorting final list
            if(sortBy.equalsIgnoreCase("lowtohigh"))
            {
                System.out.println("It was " + sortBy);
                finalList.sort(Comparator.comparing(Item::getItemPrice));
            }
            else if(sortBy.equalsIgnoreCase("hightolow"))
            {
                finalList.sort(Comparator.comparing(Item::getItemPrice).reversed());
            }
            else{
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
                    return (int)minItem.getItemPrice();
                }

                @Override
                public int getNumberOfElements() {
                    //Sending out maximum price
                    return (int)maxItem.getItemPrice();
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





}
