package com.benchwarmers.grads.grizzlystoreitem.repositories;

import org.springframework.data.repository.CrudRepository;
import com.benchwarmers.grads.grizzlystoreitem.entities.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
