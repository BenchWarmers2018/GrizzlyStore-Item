package com.benchwarmers.grads.grizzlystoreitem;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_Item;

    @ManyToOne
    @JoinColumn(name = "item_category_id")
    private Category category;

    private String item_Name;

    private String item_Description;

    private String item_Image;

    private double item_Price;

    private int item_SalePercentage;

    @CreationTimestamp
    @Column(name = "last_Modified", nullable = false)
    private Date last_modified;

    public Item() {
    }

    public Item(Category category, String item_Name, String item_Description, String item_Image, double item_Price, int item_SalePercentage) {
        this.category = category;
        this.item_Name = item_Name;
        this.item_Description = item_Description;
        this.item_Image = item_Image;
        this.item_Price = item_Price;
        this.item_SalePercentage = item_SalePercentage;
    }

    public Integer getId_Item() {
        return id_Item;
    }

    //no setter for id_Item required


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public String getItem_Description() {
        return item_Description;
    }

    public void setItem_Description(String item_Description) {
        this.item_Description = item_Description;
    }

    public String getItem_Image() {
        return item_Image;
    }

    public void setItem_Image(String item_Image) {
        this.item_Image = item_Image;
    }

    public double getItem_Price() {
        return item_Price;
    }

    public void setItem_Price(double item_Price) {
        this.item_Price = item_Price;
    }

    public int getItem_SalePercentage() {
        return item_SalePercentage;
    }

    public void setItem_SalePercentage(int item_SalePercentage) {
        this.item_SalePercentage = item_SalePercentage;
    }
}
