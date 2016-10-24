package com.handsome.designmode.MVP.Model;

import com.handsome.designmode.MVP.Bean.Student;

import java.util.List;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/23.
 */
public interface IStudentMode {

    void query(onQueryListener listener);
    void addStudent(onAddStudentListener listener);
    void deleteStudent(onDeleteStudentListener listener);

    interface onQueryListener{
        void onComplete(List<Student> students);
    }
    interface onAddStudentListener{
        void onComplete();
    }
    interface onDeleteStudentListener{
        void onComplete();
    }
}
