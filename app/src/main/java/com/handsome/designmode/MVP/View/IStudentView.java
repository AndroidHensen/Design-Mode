package com.handsome.designmode.MVP.View;

import com.handsome.designmode.MVP.Bean.Student;

import java.util.List;

/**
 * =====作者=====
 * 许英俊
 * =====时间=====
 * 2016/10/24.
 */
public interface IStudentView {
    void showStudent(List<Student> list);
    void refreshStudent();
}
