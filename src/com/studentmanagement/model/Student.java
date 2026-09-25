package com.studentmanagement.model;

public class Student {
    
    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;

    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public double getMarks(){
        return marks;
    }

    public void setName(String name){
       this.name = name;
    }

    public void setMarks(double marks){
        
            this.marks = marks;
    }

    public void setAge(int age){
       
          this.age = age;
        
    }

    @Override 
    public String toString(){
        return "Student ={" + " Id: "+ id + " Name: "+ name + " Age: "+ age + " Marks: "+ marks + " }";
    }

    
}
