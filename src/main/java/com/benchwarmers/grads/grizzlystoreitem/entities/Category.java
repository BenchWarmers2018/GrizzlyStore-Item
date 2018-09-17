package com.benchwarmers.grads.grizzlystoreitem.entities;

import javax.persistence.*;

import com.benchwarmers.grads.grizzlystoreitem.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "category")
public class Category extends Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCategory", nullable = false)
    private Integer idCategory;

    @Column(name = "categoryName", nullable = false)
    private String categoryName;

    @Column(name = "categoryDescription", nullable = false)
    private String categoryDescription;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idCategory")
    private List<Item> items= new ArrayList<>();

    @CreationTimestamp
    @Column(name = "last_modified", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_modified;

    public Category() {
    }

    public Category(int idCategory, String categoryName, String categoryDescription) {
        this.idCategory = idCategory;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItemToList(Item item)
    {
        items.add(item);
    }
    public Date getLast_modified() {
        return last_modified;
    }
}
