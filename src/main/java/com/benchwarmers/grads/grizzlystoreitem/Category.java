package com.benchwarmers.grads.grizzlystoreitem;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
public class Category {
    @Id
    private int id_Category;

    private String category_Name;

    private String category_Description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Item> items;

    @CreationTimestamp
    @Column(name = "last_Modified", nullable = false)
    private Date last_Modified;

    public Category() {
    }

    public Category(int id_Category, String category_Name, String category_Description) {
        this.id_Category = id_Category;
        this.category_Name = category_Name;
        this.category_Description = category_Description;
    }

    public int getId_Category() {
        return id_Category;
    }

    public String getCategory_Name() {
        return category_Name;
    }

    public void setCategory_Name(String category_Name) {
        this.category_Name = category_Name;
    }

    public String getCategory_Description() {
        return category_Description;
    }

    public void setCategory_Description(String category_Description) {
        this.category_Description = category_Description;
    }


    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
