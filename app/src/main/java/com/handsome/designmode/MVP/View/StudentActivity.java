package com.handsome.designmode.MVP.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.handsome.designmode.MVP.Adapter.StudentAdapter;
import com.handsome.designmode.MVP.Bean.Student;
import com.handsome.designmode.MVP.Presenter.StudentPresenter;
import com.handsome.designmode.R;

import java.util.List;

public class StudentActivity extends AppCompatActivity implements IStudentView, View.OnClickListener {

    private ListView lv;
    private StudentAdapter adapter;
    private Button bt_add, bt_delete;
    private StudentPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        lv = (ListView) findViewById(R.id.lv);
        bt_add = (Button) findViewById(R.id.bt_add);
        bt_delete = (Button) findViewById(R.id.bt_delete);
        bt_add.setOnClickListener(this);
        bt_delete.setOnClickListener(this);

        presenter = new StudentPresenter(this);
        presenter.queryStudent();
    }


    @Override
    public void showStudent(List<Student> list) {
        adapter = new StudentAdapter(this, list);
        lv.setAdapter(adapter);
    }

    @Override
    public void refreshStudent() {
        adapter.notifyDataSetChanged();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_add:
                presenter.addStudent();
                break;
            case R.id.bt_delete:
                presenter.deleteStudent();
                break;
        }
    }
}
