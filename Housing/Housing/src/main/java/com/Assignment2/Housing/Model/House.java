package com.Assignment2.Housing.Model;

import jakarta.persistence.*;

@Entity
@Table(name="house")
public class House {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="bedrooms")
    private int bedrooms;
    @Column(name="bathrooms")
    private int bathrooms;
    @Column(name="squareFootage")
    private long squareFootage;
    @Column(name="location")
    private String location;
    @Column(name="salePrice")
    private long salePrice;

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public long getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(long squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String  getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(long salePrice) {
        this.salePrice = salePrice;
    }

    public House(int id, int bedrooms, int bathrooms, long squareFootage, String location, long salePrice) {
        this.id = id;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.squareFootage = squareFootage;
        this.location = location;
        this.salePrice = salePrice;
    }

    public House(){}
}
