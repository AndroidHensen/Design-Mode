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
    // 显示进度
    void showLoading();
    // 显示学生
    void showStudents(List<Student> students);
}
