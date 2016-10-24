package com.handsome.designmode.MVP.Model;

import com.handsome.designmode.MVP.Bean.Student;
import com.handsome.designmode.R;

import java.util.ArrayList;
import java.util.List;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/23.
 */
public class StudentMode implements IStudentMode{

    @Override
    public void loadStudent(onLoadStudentListener listener) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("李四", R.mipmap.ic_launcher));
        students.add(new Student("張三", R.mipmap.ic_launcher));
        students.add(new Student("李四", R.mipmap.ic_launcher));
        students.add(new Student("張三", R.mipmap.ic_launcher));
        students.add(new Student("李四", R.mipmap.ic_launcher));
        if(listener != null){
            listener.onComplete(students);
        }
    }
}
