package com.handsome.designmode.MVP.Bean;

/**
 * 作者：许英俊
 * 实体类
 * 对数据对象的封装
 */
public class Student {

    //学生的名字
    private String name;
    //学生的图片信息
    private int image;

    public Student(String name, int image) {
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
