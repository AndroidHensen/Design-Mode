package com.handsome.designmode.MVP.Model;

import com.handsome.designmode.MVP.Bean.Student;
import com.handsome.designmode.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：许英俊
 * 模型实现类
 * 对模型层的实现
 */
public class StudentMode implements IStudentMode {

    private static List<Student> list = new ArrayList<>();

    /**
     * 本地模拟数据库
     */
    static {
        list.add(new Student("小龙", R.drawable.man));
        list.add(new Student("小红", R.drawable.woman));
        list.add(new Student("小龙", R.drawable.man));
    }

    /**
     * 查询学生
     * @param listener
     */
    @Override
    public void query(onQueryListener listener) {
        if (listener != null) {
            listener.onComplete(list);
        }
    }

    /**
     * 添加学生
     * @param listener
     */
    @Override
    public void addStudent(onAddStudentListener listener) {
        list.add(new Student("小燕", R.drawable.girl));
        if (listener != null) {
            listener.onComplete();
        }
    }

    /**
     * 删除学生
     * @param listener
     */
    @Override
    public void deleteStudent(onDeleteStudentListener listener) {
        if (list.size() > 0) {
            list.remove(list.size() - 1);
        }
        if (listener != null) {
            listener.onComplete();
        }
    }
}
