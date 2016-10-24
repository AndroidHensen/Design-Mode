package com.handsome.designmode.MVP.Presenter;

import com.handsome.designmode.MVP.Bean.Student;
import com.handsome.designmode.MVP.Model.IStudentMode;
import com.handsome.designmode.MVP.Model.StudentMode;
import com.handsome.designmode.MVP.View.IStudentView;
import com.handsome.designmode.MVP.View.MainActivity;

import java.util.List;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/23.
 */
public class StudentPresenter {

    private IStudentMode studentMode;
    private IStudentView studentView;

    public StudentPresenter(IStudentView studentView) {
        studentMode = new StudentMode();
        this.studentView = studentView;
    }

    public void fetch() {
        studentView.showLoading();
        if (studentMode != null) {
            studentMode.loadStudent(new IStudentMode.onLoadStudentListener() {
                @Override
                public void onComplete(List<Student> students) {
                    studentView.showStudents(students);
                }
            });
        }
    }
}
