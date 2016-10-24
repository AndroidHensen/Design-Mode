package com.handsome.designmode.MVP.Model;

import com.handsome.designmode.MVP.Bean.Student;

import java.util.List;

/**
 * 作者：许英俊
 * 模型抽象类
 * 对模型层的抽象
 */
public interface IStudentMode {

    /**
     * 查询所有学生
     * @param listener
     */
    void query(onQueryListener listener);

    /**
     * 添加学生
     * @param listener
     */
    void addStudent(onAddStudentListener listener);

    /**
     * 删除学生
     * @param listener
     */
    void deleteStudent(onDeleteStudentListener listener);

    /**
     * 查询学生回调
     */
    interface onQueryListener{
        void onComplete(List<Student> students);
    }

    /**
     * 添加学生回调
     */
    interface onAddStudentListener{
        void onComplete();
    }

    /**
     * 删除学生回调
     */
    interface onDeleteStudentListener{
        void onComplete();
    }
}
