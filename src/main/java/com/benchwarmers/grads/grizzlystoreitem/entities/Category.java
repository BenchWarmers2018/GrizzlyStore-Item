package com.benchwarmers.grads.grizzlystoreitem.entities;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Category", nullable = false)
    private Integer id_Category;

    @Column(name = "category_Name", nullable = false)
    private String category_Name;

    @Column(name = "category_Description", nullable = false)
    private String category_Description;


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Item> items= new ArrayList<>();

    @CreationTimestamp
    @Column(name = "last_modified", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_modified;

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


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Date getLast_modified() {
        return last_modified;
    }
}
