package com.benchwarmers.grads.grizzlystoreitem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
       // List<Item> findAllByCategory_CategoryName(String category);
}
