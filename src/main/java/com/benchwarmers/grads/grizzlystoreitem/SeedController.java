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
        Item i1 = new Item(c1, "Teddy", "Cutest teddy bear in the world", "<INSERT URL HERE>",
                10, 0);



        categoryRepository.save(c1);
        categoryRepository.save(c2);
        categoryRepository.save(c3);
        categoryRepository.save(c4);
        categoryRepository.save(c5);
        categoryRepository.save(c6);
        itemRepository.save(i1);

        return c1.toString();
    }




}
