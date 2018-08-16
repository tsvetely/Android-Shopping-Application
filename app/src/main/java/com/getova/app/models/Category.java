package com.getova.app.models;

public class Category {
    private String categoryName;
    private String categoryDescription;
    private int categoryImage;
    private String itemColor;

    public Category() {
        // Required empty public constructor
    }

    public Category(String categoryName, String categoryDescription, int categoryImage, String itemColor) {
        this.setCategoryName(categoryName);
        this.setCategoryDescription(categoryDescription);
        this.setCategoryImage(categoryImage);
        this.setItemColor(itemColor);
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

    public int getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(int categoryImage) {
        this.categoryImage = categoryImage;
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }
}
