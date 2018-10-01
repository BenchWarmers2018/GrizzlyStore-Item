//package com.benchwarmers.grads.grizzlystoreitem;
//
//import com.benchwarmers.grads.grizzlystoreitem.controllers.ItemsController;
//import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
//import com.benchwarmers.grads.grizzlystoreitem.repositories.ItemRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import javax.annotation.Resource;
//
//import java.time.Instant;
//import java.util.Date;
//import java.util.UUID;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//public class GrizzlystoreItemControllerTests
//{
//    @Resource
//    private ItemRepository mockedItemRepository;
//
//
//    private Item testItem;
//
//    @Autowired
//    private ItemsController itemsController;
//
//    @Autowired
//    MockMvc mvc;
//
//    @Before
//    public void setup() {
//        //MockitoAnnotations.initMocks(this);
//        mockedItemRepository.deleteAll();
//        testItem = new Item();
////        testItem.setItem(UUID.randomUUID());
//        testItem.setItemName("Bear hat");
//        testItem.setItemDescription("Can you bear it?");
//        testItem.setItemImage("Bear hat image");
//        testItem.setItemPrice(50.0);
//        testItem.setItemSalePercentage(50);
//        //testItem.setLastModified(Date.from(Instant.now()));
//
//
//        //testAccount.setLastModified(Date.from(Instant.now()));
//        //Mockito.when(mockedAccountRepository.save( Mockito.any(Account.class) )).thenReturn(testAccount);
//        //This is what is required
//        //MockitoAnnotations.initMocks(this);
//        mockedItemRepository.save(testItem);
//
//        this.mvc = MockMvcBuilders.standaloneSetup(itemsController).build();
//    }
//
//    @Test
//    public void validItemId() throws Exception
//    {
//        mvc.perform(post("/items/id").contentType(MediaType.ALL).param("itemId", testItem.getIdItem().toString())).andExpect(status().isOk());
//    }
//
//    @Test
//    public void invalidItemId() throws Exception
//    {
//        mvc.perform(post("/items/id").contentType(MediaType.ALL).param("itemId", "2000")).andExpect(status().isBadRequest());
//    }
//
//    @Test
//    public void getAllItemsCheck() throws Exception
//    {
//        mvc.perform(post("/items/all")).andExpect(status().isOk());
//    }
//}
