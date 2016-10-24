package com.handsome.designmode.MVC.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.handsome.designmode.MVC.Adapter.BookAdapter;
import com.handsome.designmode.MVC.Bean.Book;
import com.handsome.designmode.MVC.Controller.BookController;
import com.handsome.designmode.R;

import java.util.List;

/**
 * 作者：许英俊
 * 视图层
 * 发送输入请求给控制器
 */
public class BookActivity extends AppCompatActivity implements View.OnClickListener {

    private BookController bookController;

    private ListView lv_book;
    private List<Book> list;
    private BookAdapter adapter;
    private Button bt_add, bt_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        lv_book = (ListView) findViewById(R.id.lv);
        bt_add = (Button) findViewById(R.id.bt_add);
        bt_delete = (Button) findViewById(R.id.bt_delete);
        bt_add.setOnClickListener(this);
        bt_delete.setOnClickListener(this);

        bookController = new BookController();
        list = bookController.query();
        adapter = new BookAdapter(this, list);
        lv_book.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //添加书本按钮
            case R.id.bt_add:
                bookController.add(new BookController.onAddBookListener() {
                    @Override
                    public void onComplete() {
                        adapter.notifyDataSetChanged();
                    }
                });
                break;
            //删除书本按钮
            case R.id.bt_delete:
                bookController.delete(new BookController.onDeleteBookListener() {
                    @Override
                    public void onComplete() {
                        adapter.notifyDataSetChanged();
                    }
                });
                break;
        }
    }
}
