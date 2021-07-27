package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

public interface StudentDao {


    public  List<Student> getAll();

    public Student getById(String id);
    public void save(Student s);

    List<Student> select1(Student s);

    List<Student> select2(String z);

    List<Student> select3(Student s);

    List<Student> select4(String[] stArr);
}
