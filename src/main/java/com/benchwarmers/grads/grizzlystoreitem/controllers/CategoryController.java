package com.benchwarmers.grads.grizzlystoreitem.controllers;

import com.benchwarmers.grads.grizzlystoreitem.Data;
import com.benchwarmers.grads.grizzlystoreitem.JsonResponse;
import com.benchwarmers.grads.grizzlystoreitem.entities.Category;
import com.benchwarmers.grads.grizzlystoreitem.repositories.CategoryRepository;
import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/category")
public class CategoryController
{
    @Autowired
    CategoryRepository categoryRepository;
    //This controller returns all categories along with all items within it
    @RequestMapping(path = "/all")
    public ResponseEntity getAllCategories()
    {
        JsonResponse response = new JsonResponse();
        List<Category> categories;
        List<Data> categoriesData = new ArrayList<>();
        categories = categoryRepository.findAll();


        for(Category i : categories)
            categoriesData.add(i);

        Array[] hello = new Array[categoriesData.size()];

        for(int i = 0; i < hello.length; ++i)
        {

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
}
