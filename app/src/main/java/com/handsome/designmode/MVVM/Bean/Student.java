package com.handsome.designmode.MVVM.Bean;

public class Student {

    private String name;
    private String nickName;

    public Student(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    public String getNickName() {

        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
