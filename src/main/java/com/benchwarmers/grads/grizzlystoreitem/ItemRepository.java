package com.benchwarmers.grads.grizzlystoreitem;

import org.springframework.data.repository.CrudRepository;
import com.benchwarmers.grads.grizzlystoreitem.Item;

public interface ItemRepository extends CrudRepository<Item, Integer> {

}
