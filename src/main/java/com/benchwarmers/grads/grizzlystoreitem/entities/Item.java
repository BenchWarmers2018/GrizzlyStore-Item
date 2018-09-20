package com.benchwarmers.grads.grizzlystoreitem.entities;

import com.benchwarmers.grads.grizzlystoreitem.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Item extends Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idItem", nullable = false)
    private Integer idItem;

    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;

    @Column(name = "itemName", nullable = false)
    private String itemName;

    @Column(name = "itemDescription", nullable = false)
    private String itemDescription;

    @Column(name = "itemImage", nullable = false)
    private String itemImage;

    @Column(name = "itemPrice", nullable = false)
    private double itemPrice;

    @Column(name = "itemSalePercentage", nullable = false)
    private Integer itemSalePercentage;

    @CreationTimestamp
    @Column(name = "last_Modified", nullable = false)
    private Date lastModified;

    public Item() {
    }

    public Item(String itemName, String itemDescription, String itemImage, double itemPrice, int itemSalePercentage, Category category) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;
        this.itemSalePercentage = itemSalePercentage;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getIdItem() {
        return idItem;
    }

    //no setter for idItem required

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemSalePercentage() {
        return itemSalePercentage;
    }

    public void setItemSalePercentage(int itemSalePercentage) {
        this.itemSalePercentage = itemSalePercentage;
    }

    public Date getLastModified() {
        return lastModified;
    }
}
