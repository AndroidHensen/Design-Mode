package com.handsome.designmode.MVVM.View;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.handsome.designmode.MVVM.Bean.Student;
import com.handsome.designmode.R;
import com.handsome.designmode.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    Student student = new Student("Hensen", "handsome");
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        binding.setStudent(student);
        binding.setController(new Controller());
    }

    public class Controller {
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            student.setName(s.toString());
            binding.setStudent(student);
        }

        public void onClick(View view) {
            Toast.makeText(LoginActivity.this, "clickMe", Toast.LENGTH_SHORT).show();
        }

        public void onClickListenerBinding(Student student) {
            Toast.makeText(LoginActivity.this, student.getNickName(), Toast.LENGTH_SHORT).show();
        }
    }
}
