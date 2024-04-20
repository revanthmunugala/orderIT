package com.application.orderIT.entity;

import jakarta.persistence.*;

@Entity
public class restaurantRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String restaurantName;
    @Column(nullable = false)
    private Integer restaurantRating;
    @Column(nullable = false)
    private double restaurantLatitude;
    @Column(nullable = false)
    private double restaurantLongitude;

    public restaurantRecord(Integer restaurantRating) {

        this.restaurantRating = restaurantRating;
    }

    public restaurantRecord(Long id, String restaurantName, Integer restaurantRating, double restaurantLatitude, double restaurantLongitude) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.restaurantLatitude = restaurantLatitude;
        this.restaurantLongitude = restaurantLongitude;
    }

    public restaurantRecord() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public double getRestaurantLatitude() {
        return restaurantLatitude;
    }

    public void setRestaurantLatitude(double restaurantLatitude) {
        this.restaurantLatitude = restaurantLatitude;
    }

    public double getRestaurantLongitude() {
        return restaurantLongitude;
    }

    public void setRestaurantLongitude(double restaurantLongitude) {
        this.restaurantLongitude = restaurantLongitude;
    }

    public Integer getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(Integer restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    @Override
    public String toString() {
        return "restaurantRecord{" +
                "id=" + id +
                ", restaurantName='" + restaurantName + '\'' +
                ", restaurantLatitude=" + restaurantLatitude +
                ", restaurantLongitude=" + restaurantLongitude +
                '}';
    }
}
