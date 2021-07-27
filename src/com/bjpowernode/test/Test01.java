package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import com.bjpowernode.util.ServiceFactory;

import java.util.List;

public class Test01 {
    public static void main(String[] args)  {
        StudentService ss =  (StudentService) ServiceFactory.getService(new StudentServiceImpl());

     /*   Student s = new Student();
        s.setId("A006");
        s.setName("wq");
        s.setAge(20);

        ss.save(s);*/
        //查询单条记录
       Student s =ss.getById("A002");
        System.out.println(s);

      //查询所有记录
    /*    List<Student> sList= ss.getAll();
        for (Student s: sList) {
            System.out.println(s);

        }*/



    }

}
