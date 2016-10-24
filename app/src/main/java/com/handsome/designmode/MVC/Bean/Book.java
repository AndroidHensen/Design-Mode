package com.handsome.designmode.MVC.Bean;

/**
 * 作者：许英俊
 * 实体类
 * 对数据对象的封装
 */
public class Book {

    //书名
    private String name;
    //书的图片
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
