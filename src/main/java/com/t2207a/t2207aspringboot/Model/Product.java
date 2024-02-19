package com.t2207a.t2207aspringboot.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private String description;

    private String thumbail;

    public Product() {
    }

    public Product(Long id, String name, int price, String description, String thumbail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.thumbail = thumbail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbail() {
        return thumbail;
    }

    public void setThumbail(String thumbail) {
        this.thumbail = thumbail;
    }
}
