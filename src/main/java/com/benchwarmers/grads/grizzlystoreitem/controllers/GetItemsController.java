package com.benchwarmers.grads.grizzlystoreitem.controllers;

import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/item")
public class GetItemsController
{
    @Autowired
    ItemRepository itemRepository;

    @RequestMapping("/all")
    public List<Item> getAllItems()
    {
        List<Item> items;
        items = itemRepository.findAll();

        return items;
    }

//    @RequestMapping("/catagory")
//    public List<Item> getItemsByCatagory(@RequestBody String catagory)
//    {
//        List<Item> items;
//        items = itemRepository.findAllByCategory_CategoryName(catagory);
//        return items;
//    }
//    public List<Item> getAllItemsByCatagory()
//    {
//
//    }

}
