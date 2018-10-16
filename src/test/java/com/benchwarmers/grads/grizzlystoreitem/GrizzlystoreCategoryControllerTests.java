package com.benchwarmers.grads.grizzlystoreitem;

import com.benchwarmers.grads.grizzlystoreitem.controllers.CategoryController;
import com.benchwarmers.grads.grizzlystoreitem.entities.Category;
import com.benchwarmers.grads.grizzlystoreitem.repositories.CategoryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class GrizzlystoreCategoryControllerTests
{
    @Resource
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryController categoryController;

    @Autowired
    MockMvc mockMvc;

    private String testJson;

    private Category testCategory;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(categoryController).build();
    }
    //This test checks if a status 200 is returned when a correct Id have been entered.
//    @Test
//    public void validCategoryId() throws Exception
//    {
//        mockMvc.perform(post("/category/id").contentType(MediaType.ALL).param("id", Integer.toString(testCategory.getIdCategory()))).andExpect(status().isOk());
//    }

    //This test checks if a status 400 is returned when an incorrect id has been entered.
    @Test
    public void invalidCategoryId() throws Exception
    {
        mockMvc.perform(post("/category/id").contentType(MediaType.ALL).param("id", "2000")).andExpect(status().isBadRequest());
    }

//    @Test
//    public void validCategoryName() throws Exception
//    {
//
//        mockMvc.perform(post("/category/name").contentType(MediaType.ALL).param("name", testCategory.getCategoryName())).andExpect(status().isOk());
//    }

    @Test
    public void invalidCategoryName() throws Exception
    {
        mockMvc.perform(post("/category/name").contentType(MediaType.ALL).param("name", "I dont exist")).andExpect(status().isBadRequest());
    }

    @Test
    public void getAllCategories() throws Exception
    {
        mockMvc.perform(post("/category/all").contentType(MediaType.ALL)).andExpect(status().isOk());
    }

//    @Test
//    public void addCategorySuccess() throws Exception {
//        ObjectMapper mapper = new ObjectMapper();
//        Category validCategory = new Category();
//
//        testJson = "{" +
//                "\"categoryName\":\"New Category\", " +
//                "\"categoryDescription\":\"Sample Description\"" +
//                "}";
//
//        mockMvc.perform(
//                MockMvcRequestBuilders.post("/category/add")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(testJson))
//                .andExpect(status().isOk());
//    }

    @Test
    public void addCategoryWithoutCategoryName() throws Exception {
        testJson = "{" +
                "\"categoryName\":\"\", " +
                "\"categoryDescription\":\"Description\"" +
                "}";

        MvcResult result = mockMvc.perform(
                MockMvcRequestBuilders.post("/category/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(testJson))
                .andExpect(status().isNotAcceptable())
                .andReturn();

        String content = result.getResponse().getContentAsString();

        // Get the objects within the "errors" section of the Json Response
        JSONArray jsonErrors = new JSONObject(content).getJSONArray("errors");

        // Expected error message
        String errorMessage = "No category name specified. Please enter a name!";

        // Error message within the JsonResponse
        String jsonErrorMessage = jsonErrors.get(0).toString();

        Assert.assertEquals(errorMessage, jsonErrorMessage);
    }

//    @Test
//    public void addCategoryThatAlreadyExists() throws Exception {
//        testJson = "{" +
//                "\"categoryName\":\"" + testCategory.getCategoryName() + "\", " +
//                "\"categoryDescription\":\"\"" +
//                "}";
//
//        MvcResult result = mockMvc.perform(
//                MockMvcRequestBuilders.post("/category/add")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(testJson))
//                .andExpect(status().isNotAcceptable())
//                .andReturn();
//
//        String content = result.getResponse().getContentAsString();
//
//        // Get the objects within the "errors" section of the Json Response
//        JSONArray jsonErrors = new JSONObject(content).getJSONArray("errors");
//
//        // Expected error message
//        String errorMessage = "A category already exists with this name: " + testCategory.getCategoryName() + "!";
//
//        // Error message within the JsonResponse
//        String jsonErrorMessage = jsonErrors.get(0).toString();
//
//        Assert.assertEquals(errorMessage, jsonErrorMessage);
//    }
}