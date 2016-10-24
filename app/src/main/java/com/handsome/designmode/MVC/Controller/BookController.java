package com.handsome.designmode.MVC.Controller;

import com.handsome.designmode.MVC.Bean.Book;
import com.handsome.designmode.MVC.Model.BookModel;
import com.handsome.designmode.R;

import java.util.List;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/24.
 */
public class BookController {

    private BookModel mode;

    public BookController() {
        mode = new BookModel();
    }

    public void add(onAddBookListener listener) {
        mode.addBook("JavaWeb从入门到精通", R.drawable.javaweb);
        if (listener != null) {
            listener.opComplete();
        }
    }

    public void delete(onDeleteBookListener listener) {
        if(mode.query().isEmpty()){
           return;
        }else{
            mode.deleteBook();
        }
        if (listener != null) {
            listener.opComplete();
        }
    }

    public List<Book> query() {
        return mode.query();
    }

    public interface onAddBookListener {
        void opComplete();
    }

    public interface onDeleteBookListener {
        void opComplete();
    }
}
