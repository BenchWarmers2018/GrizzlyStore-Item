package com.benchwarmers.grads.grizzlystoreitem.controllers;

import com.benchwarmers.grads.grizzlystoreitem.Data;
import com.benchwarmers.grads.grizzlystoreitem.JsonResponse;
import com.benchwarmers.grads.grizzlystoreitem.entities.Category;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import com.benchwarmers.grads.grizzlystoreitem.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/category")
@CrossOrigin
public class CategoryController
{
    @Autowired
    CategoryRepository categoryRepository;

    //This controller returns all categories along with all items within it
    @RequestMapping(path = "/allwithoutitems")
    public ResponseEntity getAllCategoriesWithoutItems()
    {
        // This variable is used to remove each item array from categories
        Category removeItem;
        JsonResponse response = new JsonResponse();

        //This List is used to replace the items list in each category
        List<Item> items = new ArrayList<>();
        List<Data> categoriesData = new ArrayList<>();
        List<Category> categories = categoryRepository.findAll();

        for(Category i : categories)
        {
            i.getItems().removeAll(i.getItems());
            categoriesData.add(i);
        }

        response.setStatus(HttpStatus.OK);
        response.addAllEntities(categoriesData);
        return response.createResponse();
    }

    @RequestMapping(path = "/all")
    public ResponseEntity getAllCategories()
    {
        // This variable is used to remove each item array from categories
        JsonResponse response = new JsonResponse();
        List<Category> categories;
        List<Data> categoriesData = new ArrayList<>();
        categories = categoryRepository.findAll();

        for(Category i : categories){
            categoriesData.add(i);
        }



        response.setStatus(HttpStatus.OK);
        response.addAllEntities(categoriesData);
        return response.createResponse();
    }

    //This controller takes a category id and returns the category plus all items
    @RequestMapping(path = "/id")
    public ResponseEntity findCategoryById(@RequestParam String id)
    {
        Category category;
        category = categoryRepository.findCategoryByIdCategory(Integer.parseInt(id));
        //Checks if the category id that has been entered exists before returning a category
        if(!categoryRepository.existsByIdCategory(Integer.parseInt(id)))
        {
            System.out.println(id);
            JsonResponse response = new JsonResponse();
            response.setStatus(HttpStatus.BAD_REQUEST);
            return response.createResponse();
        }
        else
        {
            System.out.println(id);
            JsonResponse response = new JsonResponse();
            response.setStatus(HttpStatus.OK);
            response.addEntity(category);
            return response.createResponse();
        }

    }

    @RequestMapping(path = "/name")
    public ResponseEntity searchCategoryByName(@RequestParam String name) {
        Category category;
        category = categoryRepository.findCategoryByCategoryName(name);
        if (!categoryRepository.existsByCategoryName(name))
        {
            JsonResponse response = new JsonResponse();
            response.setStatus(HttpStatus.BAD_REQUEST);
            return response.createResponse();
        } else {
            JsonResponse response = new JsonResponse();
            response.setStatus(HttpStatus.OK);
            response.addEntity(category);
            return response.createResponse();
        }
    }

    @RequestMapping(path = "/itemid")
    public ResponseEntity findCategoryByItemId(@RequestParam String itemid)
    {
        JsonResponse response = new JsonResponse();
        List<Category> categoryList = categoryRepository.findAll();
        for (Category cat: categoryList
             ) {
            List<Item> itemList = cat.getItems();
            for (Item i: itemList
                 ) {
                if(i.getIdItem()==Integer.parseInt(itemid))
                {
                    response.setStatus(HttpStatus.OK);
                    cat.getItems().removeAll(cat.getItems());
                    response.addEntity(cat);
                    break;
                }

            }

        }
        return response.createResponse();

    }


}
