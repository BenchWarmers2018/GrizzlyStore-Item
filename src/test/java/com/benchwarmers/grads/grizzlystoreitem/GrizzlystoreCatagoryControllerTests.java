package com.benchwarmers.grads.grizzlystoreitem;

import com.benchwarmers.grads.grizzlystoreitem.controllers.CategoryController;
import com.benchwarmers.grads.grizzlystoreitem.controllers.ItemsController;
import com.benchwarmers.grads.grizzlystoreitem.entities.Category;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import com.benchwarmers.grads.grizzlystoreitem.repositories.CategoryRepository;
import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.util.*;
import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class GrizzlystoreCatagoryControllerTests
{
    @Resource
    private CategoryRepository mockedCategoryRepository;


    private Category testCategory;

    @Autowired
    private CategoryController categoryController;

    @Autowired
    MockMvc mvc;


    @Before
    public void setup() {
        //MockitoAnnotations.initMocks(this);
        mockedCategoryRepository.deleteAll();
        testCategory = new Category();
        //testAccount.setIdAccount(UUID.randomUUID());
        testCategory.setCategoryName("Jewellery");
        testCategory.setCategoryDescription("Shiny");

        //testItem.setLastModified(Date.from(Instant.now()));


        //testAccount.setLastModified(Date.from(Instant.now()));
        //Mockito.when(mockedAccountRepository.save( Mockito.any(Account.class) )).thenReturn(testAccount);
        //This is what is required
        //MockitoAnnotations.initMocks(this);
        mockedCategoryRepository.save(testCategory);

        this.mvc = MockMvcBuilders.standaloneSetup(categoryController).build();
    }

    @Test
    public void validCategoryId() throws Exception
    {
        mvc.perform(post("/category/id").contentType(MediaType.ALL).param("id", Integer.toString(testCategory.getIdCategory()))).andExpect(status().isOk());
    }

    @Test
    public void invalidCategoryId() throws Exception
    {
        mvc.perform(post("/category/id").contentType(MediaType.ALL).param("id", "2000")).andExpect(status().isBadRequest());
    }

    @Test
    public void validCategoryName() throws Exception
    {
        mvc.perform(post("/category/name").contentType(MediaType.ALL).param("name", testCategory.getCategoryName())).andExpect(status().isOk());
    }

    @Test
    public void invalidCategoryName() throws Exception
    {
        mvc.perform(post("/category/name").contentType(MediaType.ALL).param("name", "I dont exist")).andExpect(status().isBadRequest());
    }

    @Test
    public void getAllCategories() throws Exception
    {
        mvc.perform(post("/category/all").contentType(MediaType.ALL)).andExpect(status().isOk());
    }
}
