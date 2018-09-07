package com.benchwarmers.grads.grizzlystoreitem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.benchwarmers.grads.grizzlystoreitem.Category;
import com.benchwarmers.grads.grizzlystoreitem.CategoryRepository;
import com.benchwarmers.grads.grizzlystoreitem.Item;
import com.benchwarmers.grads.grizzlystoreitem.ItemRepository;

@Controller
@RequestMapping(path = "/test")
public class SeedController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping(path="/seed") // Map ONLY GET Requests
    public @ResponseBody String addNewCategory () {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Category c1 = new Category(1, "Jewellery", "Show someone that you " +
                "can't bear to be without them with one of our lovely bear themed jewellery pieces!");
        Category c2 = new Category(2, "Art", "Fur all those with bearly any " +
                "artistic talent, we have your back!");
        Category c3 = new Category(3, "Clothing", "Never get caught bearly " +
                " dressed with one of our adorable bear pieces!");
        Category c4 = new Category(4, "Home and Living", "Have a bearly decorated " +
                "house? Never fear! We are here!");
        Category c5 = new Category(5, "Toys", "Come and bear witness to the most" +
                " adorable collection of bear themed toys!");
        Category c6 = new Category(6, "Technology", "If you can't bear to live " +
                "a life without technology or electronics, fill your void here!");
        Item i1 = new Item(c1, "Teddy1", "Cutest teddy bear in the world", "<INSERT URL HERE>",
                10, 0);
        Item i2 = new Item(c2, "Teddy2", "Cutest teddy bear in Asia", "<INSERT URL HERE>",
                10, 0);
        Item i3 = new Item(c3, "Teddy3", "Cutest teddy bear in Europe", "<INSERT URL HERE>",
                10, 0);
        Item i4 = new Item(c4, "Teddy4", "Cutest teddy bear in Australia", "<INSERT URL HERE>",
                10, 0);
        Item i5 = new Item(c5, "Teddy5", "Cutest teddy bear in America", "<INSERT URL HERE>",
                10, 0);
        Item i6 = new Item(c6, "Teddy6", "Cutest teddy bear in Antartica", "<INSERT URL HERE>",
                10, 0);
        Item i7 = new Item(c1, "Teddy7", "Cutest teddy bear in the Artic", "<INSERT URL HERE>",
                10, 0);
        Item i8 = new Item(c2, "Teddy8", "Cutest teddy bear in Pluto", "<INSERT URL HERE>",
                10, 0);
        Item i9 = new Item(c3, "Teddy9", "Cutest teddy bear in Saturn", "<INSERT URL HERE>",
                10, 0);
        Item i10 = new Item(c4, "Teddy10", "Cutest teddy bear in Venus", "<INSERT URL HERE>",
                10, 0);
        Item i11 = new Item(c5, "Teddy11", "Cutest teddy bear in Mars", "<INSERT URL HERE>",
                10, 0);
        Item i12 = new Item(c6, "Teddy12", "Cutest teddy bear in Mercury", "<INSERT URL HERE>",
                10, 0);



        categoryRepository.save(c1);
        categoryRepository.save(c2);
        categoryRepository.save(c3);
        categoryRepository.save(c4);
        categoryRepository.save(c5);
        categoryRepository.save(c6);
        itemRepository.save(i1);
        itemRepository.save(i2);
        itemRepository.save(i3);
        itemRepository.save(i4);
        itemRepository.save(i5);
        itemRepository.save(i6);
        itemRepository.save(i7);
        itemRepository.save(i8);
        itemRepository.save(i9);
        itemRepository.save(i10);
        itemRepository.save(i11);
        itemRepository.save(i12);


        return "Successfully saved seed data of items and categories to database";
    }




}
