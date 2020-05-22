package com.block3;

import java.util.ArrayList;
import java.util.List;


public class StudentInformation {
    //定义学生类的成员变量
    private String name;
    private String id;
    private String age;
    //提供共有的get,set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
            this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
            this.age = age;
    }

    public StudentInformation() {
    }
    //定义构造方法
    public StudentInformation(String name, String id, String age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    //定义学生信息系统界面方法
    public void console (){
        System.out.println("********学生信息管理系统********");
        System.out.println("1-> 增加学生");
        System.out.println("2-> 删除学生");
        System.out.println("3-> 查找学生");
        System.out.println("4-> 修改学生");
        System.out.println("5-> 遍历学生");
        System.out.println("请选择您想要执行的操作：");
    }
    //重写toString方法
    @Override
    public String toString() {
        return "StudentInformation{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
