package com.bjpowernode.test;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtil;

import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);
        //用domain形式实现多个参数的查询
      /* Student s = new Student();
       s.setName("lh");
       s.setAge(24);
        List<Student> aList =studentDao.select1(s);
        for (Student s1:aList) {
            System.out.println(s1);
        }*/

        //模糊查询
         /*   List<Student> aList = studentDao.select2("z");
            for (Student s1: aList) {
                System.out.println(s1);
            }*/

         //动态sql查询  where标签+if标签
       /* Student s = new Student();
        s.setName("z");
        s.setAddress("a");
        List<Student> aList = studentDao.select3(s);
        for (Student s1: aList) {
            System.out.println(s1);
        }*/

        //动态sql  foreach标签
         String[]  stArr = {"A001","A002","A003"};
        List<Student> aList = studentDao.select4(stArr);
        for (Student s: aList) {
            System.out.println(s);
        }






    }
}
