package com.block3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInformationTest {
    //定义添加学生信息方法
    public static ArrayList add(ArrayList list,String id, String name, String age){
        StudentInformation stu = new StudentInformation(id,name,age);
        list.add(stu);
        System.out.println("添加成功！");
        return list;
    }
    //定义删除学生信息方法
    public static ArrayList delete(ArrayList list,String delId){
        list.remove(Integer.parseInt(delId) - 1);
        System.out.println("删除成功！");
        return list;
    }
    //定义查找学生信息方法
    public static ArrayList find(ArrayList list,String finId){
        System.out.println((list.get(Integer.parseInt(finId) - 1).toString()));
        return list;
    }
    //定义修改学生信息方法
    public static ArrayList edit(ArrayList list,String editAge,String editId,String editName){
        StudentInformation stu = new StudentInformation();
        stu.setAge(editAge);
        stu.setId(editId);
        stu.setName(editName);
        list.set(Integer.parseInt(editId) - 1,stu);
        System.out.println("修改成功！");
        return list;
    }
    //定义遍历学生信息方法
    public static ArrayList iterator(ArrayList list){
        for(Object al:list){
            System.out.println(al.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        StudentInformation si = new StudentInformation();
        ArrayList list = new ArrayList();
        while(true) {
            //调用界面方法
            si.console();
            String key = new Scanner(System.in).next();
            switch (key) {
                //输入1时，调用添加学生方法
                case "1":
                    System.out.println("请输入添加的学生编号：");
                    String id = new Scanner(System.in).next();
                    System.out.println("请输入添加的学生姓名：");
                    String name = new Scanner(System.in).next();
                    System.out.println("请输入添加的学生年龄：");
                    String age = new Scanner(System.in).next();
                    add(list, id, name, age);
                    break;
                //输入2时，调用删除学生方法
                case "2":
                    System.out.println("请输入要删除的学生编号：");
                    String delId = new Scanner(System.in).next();
                    delete(list, delId);
                    break;
                //输入3时，调用查找学生方法
                case "3":
                    System.out.println("请输入要查找的学生编号：");
                    String finId = new Scanner(System.in).next();
                    find(list, finId);
                    break;
                //输入4时，调用修改学生方法
                case "4":
                    System.out.println("请输入修改的学生编号：");
                    String editId = new Scanner(System.in).next();
                    System.out.println("请输入修改的学生姓名：");
                    String editName = new Scanner(System.in).next();
                    System.out.println("请输入修改的学生年龄：");
                    String editAge = new Scanner(System.in).next();
                    edit(list, editAge, editId, editName);
                    break;
                //输入5时，调用遍历学生方法
                case "5":
                    iterator(list);
                    break;
                    //其余默认值为退出
                default:
                    System.out.println("退出系统");
                    break;
            }
        }
    }
}
