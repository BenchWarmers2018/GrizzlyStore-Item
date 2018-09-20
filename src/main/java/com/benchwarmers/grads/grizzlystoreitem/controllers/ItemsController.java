package com.benchwarmers.grads.grizzlystoreitem.controllers;

import com.benchwarmers.grads.grizzlystoreitem.Data;
import com.benchwarmers.grads.grizzlystoreitem.JsonResponse;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/items")
public class ItemsController
{
    @Autowired
    ItemRepository itemRepository;

    //This function returns all items and details
    @RequestMapping("/all")
    public ResponseEntity getAllItems()
    {
        JsonResponse response = new JsonResponse(); 
        List<Item> items;
        List<Data> items2 = new ArrayList<>();
        items = itemRepository.findAll();

        for(Item i : items)
            items2.add(i);

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


}
