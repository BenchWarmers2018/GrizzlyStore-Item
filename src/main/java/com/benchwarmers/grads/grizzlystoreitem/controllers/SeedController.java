package com.benchwarmers.grads.grizzlystoreitem.controllers;

import com.benchwarmers.grads.grizzlystoreitem.entities.Category;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.benchwarmers.grads.grizzlystoreitem.repositories.CategoryRepository;

import java.util.ArrayList;

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

        categoryRepository.save(c1);
        categoryRepository.save(c2);
        categoryRepository.save(c3);
        categoryRepository.save(c4);
        categoryRepository.save(c5);
        categoryRepository.save(c6);

        Item i1 = new Item("Weddy", "Cutest teddy bear in the world", "<INSERT URL HERE>",
                12, 0, 5, c1);
        Item i2 = new Item( "Reddy2", "Cutest teddy bear in Asia", "<INSERT URL HERE>",
                14, 25, 10, c1);
        Item i3 = new Item( "Teddy3", "Cutest teddy bear in Europe", "<INSERT URL HERE>",
                16, 0, 12, c2);
        Item i4 = new Item( "Ueddy4", "Cutest teddy bear in Australia", "<INSERT URL HERE>",
                18, 0, 15, c2);
        Item i5 = new Item( "Oeddy5", "Cutest teddy bear in America", "<INSERT URL HERE>",
                11, 30, 12, c3);
        Item i6 = new Item( "Peddy6", "Cutest teddy bear in Antartica", "<INSERT URL HERE>",
                13, 0, 16, c3);
        Item i7 = new Item( "Veddy7", "Cutest teddy bear in the Artic", "<INSERT URL HERE>",
                19, 20, 3, c4);
        Item i8 = new Item( "Beddy8", "Cutest teddy bear in Pluto", "<INSERT URL HERE>",
                10, 0, 4, c4);
        Item i9 = new Item( "Meddy9", "Cutest teddy bear in Saturn", "<INSERT URL HERE>",
                12, 0, 8, c5);
        Item i10 = new Item( "Ceddy10", "Cutest teddy bear in Venus", "<INSERT URL HERE>",
                18, 0, 35, c5);
        Item i11 = new Item("Meddy11", "Cutest teddy bear in Mars", "<INSERT URL HERE>",
                17,5, 23, c6);
        Item i12 = new Item("Qeddy12", "Cutest teddy bear in Mercury", "<INSERT URL HERE>",
                15, 10, 24, c6);


        Item i13 = new Item( "Teddy13", "Cutest teddy bear in Europe", "<INSERT URL HERE>",
                26, 0, 1, c3);
        Item i14 = new Item( "Ueddy14", "Cutest teddy bear in Australia", "<INSERT URL HERE>",
                38, 0, 0, c3);
        Item i15 = new Item( "Oeddy15", "Cutest teddy bear in America", "<INSERT URL HERE>",
                31, 30, 3, c5);
        Item i16 = new Item( "Peddy16", "Cutest teddy bear in Antartica", "<INSERT URL HERE>",
                23, 0, 6, c5);
        Item i17 = new Item( "Veddy17", "Cutest teddy bear in the Artic", "<INSERT URL HERE>",
                29, 20,5, c6);
        Item i18 = new Item( "Beddy18", "Cutest teddy bear in Pluto", "<INSERT URL HERE>",
                30, 0, 8, c6);
        Item i19 = new Item( "Meddy19", "Cutest teddy bear in Saturn", "<INSERT URL HERE>",
                52, 0, 2, c2);
        Item i20 = new Item( "Ceddy20", "Cutest teddy bear in Venus", "<INSERT URL HERE>",
                78, 0, 1, c2);
        Item i21 = new Item("Meddy21", "Cutest teddy bear in Mars", "<INSERT URL HERE>",
                87,5, 3, c1);
        Item i22 = new Item("Qeddy22", "Cutest teddy bear in Mercury", "<INSERT URL HERE>",
                95, 10, 7, c1);


        Item i23 = new Item( "Teddy23", "Cutest teddy bear in Europe", "<INSERT URL HERE>",
                96, 0, 11, c4);
        Item i24 = new Item( "Ueddy24", "Cutest teddy bear in Australia", "<INSERT URL HERE>",
                68, 0, 12, c4);
        Item i25 = new Item( "Oeddy25", "Cutest teddy bear in America", "<INSERT URL HERE>",
                31, 30, 13, c2);
        Item i26 = new Item( "Peddy26", "Cutest teddy bear in Antartica", "<INSERT URL HERE>",
                23, 0, 14, c2);
        Item i27 = new Item( "Veddy27", "Cutest teddy bear in the Artic", "<INSERT URL HERE>",
                99, 20, 15, c5);
        Item i28 = new Item( "Beddy28", "Cutest teddy bear in Pluto", "<INSERT URL HERE>",
                30, 0, 16, c5);
        Item i29 = new Item( "Meddy29", "Cutest teddy bear in Saturn", "<INSERT URL HERE>",
                42, 0, 18, c4);
        Item i30 = new Item( "Ceddy30", "Cutest teddy bear in Venus", "<INSERT URL HERE>",
                78, 0, 12, c4);
        Item i31 = new Item("Meddy31", "Cutest teddy bear in Mars", "<INSERT URL HERE>",
                17,5, 19, c1);
        Item i32 = new Item("Qeddy32", "Cutest teddy bear in Mercury", "<INSERT URL HERE>",
                65, 10, 15, c1);


        Item i33 = new Item( "Teddy33", "Cutest teddy bear in Europe", "<INSERT URL HERE>",
                76, 0, 23, c1);
        Item i34 = new Item( "Ueddy34", "Cutest teddy bear in Australia", "<INSERT URL HERE>",
                38, 0, 24, c1);
        Item i35 = new Item( "Oeddy35", "Cutest teddy bear in America", "<INSERT URL HERE>",
                91, 30, 26, c5);
        Item i36 = new Item( "Peddy36", "Cutest teddy bear in Antartica", "<INSERT URL HERE>",
                13, 0, 27, c5);
        Item i37 = new Item( "Veddy37", "Cutest teddy bear in the Artic", "<INSERT URL HERE>",
                59, 20, 29, c6);
        Item i38 = new Item( "Beddy38", "Cutest teddy bear in Pluto", "<INSERT URL HERE>",
                90, 0, 20, c6);
        Item i39 = new Item( "Meddy39", "Cutest teddy bear in Saturn", "<INSERT URL HERE>",
                82, 0, 29, c2);
        Item i40 = new Item( "Ceddy40", "Cutest teddy bear in Venus", "<INSERT URL HERE>",
                78, 0, 28, c2);
        Item i41 = new Item("Meddy41", "Cutest teddy bear in Mars", "<INSERT URL HERE>",
                47,5, 23, c3);
        Item i42 = new Item("Qeddy42", "Cutest teddy bear in Mercury", "<INSERT URL HERE>",
                25, 10, 28, c3);

        Item i43 = new Item( "Teddy43", "Cutest teddy bear in Europe", "<INSERT URL HERE>",
                36, 0, 0, c6);
        Item i44 = new Item( "Ueddy44", "Cutest teddy bear in Australia", "<INSERT URL HERE>",
                18, 0, 0, c6);
        Item i45 = new Item( "Oeddy45", "Cutest teddy bear in America", "<INSERT URL HERE>",
                61, 30, 0, c1);
        Item i46 = new Item( "Peddy46", "Cutest teddy bear in Antartica", "<INSERT URL HERE>",
                53, 0, 0, c1);
        Item i47 = new Item( "Veddy47", "Cutest teddy bear in the Artic", "<INSERT URL HERE>",
                39, 20, 0, c5);
        Item i48 = new Item( "Beddy48", "Cutest teddy bear in Pluto", "<INSERT URL HERE>",
                100, 0, 0, c5);
        Item i49 = new Item( "Meddy49", "Cutest teddy bear in Saturn", "<INSERT URL HERE>",
                112, 0, 0, c3);
        Item i50 = new Item( "Ceddy50", "Cutest teddy bear in Venus", "<INSERT URL HERE>",
                118, 0, 0, c3);
        Item i51 = new Item("Meddy51", "Cutest teddy bear in Mars", "<INSERT URL HERE>",
                147,5, 0, c4);
        Item i52 = new Item("Qeddy52", "Cutest teddy bear in Mercury", "<INSERT URL HERE>",
                155, 10, 0, c4);


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
        itemRepository.save(i13);
        itemRepository.save(i14);
        itemRepository.save(i15);
        itemRepository.save(i16);
        itemRepository.save(i17);
        itemRepository.save(i18);
        itemRepository.save(i19);
        itemRepository.save(i20);
        itemRepository.save(i21);
        itemRepository.save(i22);
        itemRepository.save(i23);
        itemRepository.save(i24);
        itemRepository.save(i25);
        itemRepository.save(i26);
        itemRepository.save(i27);
        itemRepository.save(i28);
        itemRepository.save(i29);
        itemRepository.save(i30);
        itemRepository.save(i31);
        itemRepository.save(i32);
        itemRepository.save(i33);
        itemRepository.save(i34);
        itemRepository.save(i35);
        itemRepository.save(i36);
        itemRepository.save(i37);
        itemRepository.save(i38);
        itemRepository.save(i39);
        itemRepository.save(i40);
        itemRepository.save(i41);
        itemRepository.save(i42);
        itemRepository.save(i43);
        itemRepository.save(i44);
        itemRepository.save(i45);
        itemRepository.save(i46);
        itemRepository.save(i47);
        itemRepository.save(i48);
        itemRepository.save(i49);
        itemRepository.save(i50);
        itemRepository.save(i51);
        itemRepository.save(i52);


        return "Successfully saved seed data of items and categories to database";
    }




}
