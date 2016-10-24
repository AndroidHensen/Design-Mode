package com.handsome.designmode.MVC.Bean;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/23.
 */
public class Book {

    private String name;
    private int image;

    public Book(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
