package com.application.orderIT.entity;

import jakarta.persistence.*;

@Entity
public class menuRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String itemName;
    @Column(nullable = false)
    private String itemDescription;
    @Column(nullable = false)
    private Integer rating;
    @Column(nullable = false)
    private boolean special;


    public menuRecord() {}

    public menuRecord(Long id, String itemName, Integer rating, String itemDescription, boolean special) {
        this.id = id;
        this.itemName = itemName;
        this.rating = rating;
        this.itemDescription = itemDescription;
        this.special = special;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "menuRecord{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", rating=" + rating +
                ", special=" + special +
                '}';
    }
}
