package com.handsome.designmode.MVP.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.handsome.designmode.MVP.Adapter.StudentAdapter;
import com.handsome.designmode.MVP.Bean.Student;
import com.handsome.designmode.MVP.Presenter.StudentPresenter;
import com.handsome.designmode.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IStudentView {

    private ListView lv;
    private StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

        StudentPresenter presenter = new StudentPresenter(this);
        presenter.fetch();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "正在加载中...", Toast.LENGTH_SHORT);
    }

    @Override
    public void showStudents(List<Student> students) {
        adapter = new StudentAdapter(this, students);
        lv.setAdapter(adapter);
    }
}
