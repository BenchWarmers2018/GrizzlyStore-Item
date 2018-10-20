package com.benchwarmers.grads.grizzlystoreitem.repositories;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
       //List<Item> findAllByCategory_CategoryName(String category);
        Item findItemByIdItem(int id);
        boolean existsByIdItem(int id);
        List<Item> findAllByCategory_CategoryName(String category);

        List<Item> findAllByItemNameContainsOrItemDescriptionContains(String name, String name1);

        List<Item> findAllByItemNameContains(String search);

        List<Item> findAllByItemPriceBetween(double minimum, double maximum);





}
