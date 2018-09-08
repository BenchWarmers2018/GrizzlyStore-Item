package com.benchwarmers.grads.grizzlystoreitem.repositories;

import org.springframework.data.repository.CrudRepository;
import com.benchwarmers.grads.grizzlystoreitem.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
