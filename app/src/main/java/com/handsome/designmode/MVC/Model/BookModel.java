package com.handsome.designmode.MVC.Model;

import com.handsome.designmode.MVC.Bean.Book;
import com.handsome.designmode.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/24.
 */
public class BookModel {

    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book("Java从入门到精通", R.drawable.java));
        list.add(new Book("Android从入门到精通", R.drawable.android));
        list.add(new Book("Java从入门到精通", R.drawable.java));
        list.add(new Book("Android从入门到精通", R.drawable.android));
    }

    public void addBook(String name, int image) {
        list.add(new Book(name, image));
    }

    public void deleteBook( ) {
        list.remove(list.size() - 1);
    }

    public List<Book> query() {
        return list;
    }

}
