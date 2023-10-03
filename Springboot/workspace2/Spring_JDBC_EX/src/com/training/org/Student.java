package com.training.org;
public class Student {

 

    private int id;

    private String name;

    private int age;

 

    public int getId() {

        return id;

    }

 

    public void setId(int id) {

        this.id = id;

    }

 

    public String getName() {

        return name;

    }

 

    public void setName(String name) {

        this.name = name;

    }

 

    public int getAge() {

        return age;

    }

 

    public void setAge(int age) {

        this.age = age;

    }

 

    public Student() {

        System.out.println("default constructor:");

    }

 

    public Student(int id, String name, int age) {

        System.out.println("this is parameterise constructor:");

        this.id = id;

        this.name = name;

        this.age = age;

    }

 

    @Override

    public String toString() {

        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";

    }

    

    

 

}

 