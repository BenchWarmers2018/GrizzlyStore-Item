package com.benchwarmers.grads.grizzlystoreitem.repositories;

import com.benchwarmers.grads.grizzlystoreitem.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.benchwarmers.grads.grizzlystoreitem.entities.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
//    @Query(value = "SELECT category_name FROM category", nativeQuery = true)
//    List<Category> findAllCategories();
    //List<Category> find
    Category findCategoryByIdCategory(Integer id);
    boolean existsByIdCategory(Integer id);
    Category findCategoryByCategoryName(String name);
    boolean existsByCategoryName(String name);

}
