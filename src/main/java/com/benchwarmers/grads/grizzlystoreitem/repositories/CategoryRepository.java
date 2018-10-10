package com.benchwarmers.grads.grizzlystoreitem.repositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
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
    Page findCategoryByCategoryName(String name, Pageable pageable);
    boolean existsByCategoryName(String name);

    Category findCategoriesByItemsContaining(Integer itemId);
    boolean existsCategoryByItemsContaining(Integer itemId);

}
