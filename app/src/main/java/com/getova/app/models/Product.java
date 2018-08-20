package com.getova.app.models;

public class Product {
    public String productName;
    public String productDescription;
    public double price;

    public Product() {
        // Required empty public constructor
    }

    public Product(String categoryName, String productDescription, double price) {
        this.setProductName(categoryName);
        this.setProductDescription(productDescription);
        this.setPrice(price);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String categoryDescription) {
        this.productDescription = categoryDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
