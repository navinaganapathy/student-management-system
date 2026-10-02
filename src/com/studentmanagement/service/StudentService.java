package com.studentmanagement.service;
import com.studentmanagement.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    
    private final List<Student> students;
    
    public StudentService (){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
        System.out.println("student added");
    }

    public Student getStudentById(int id){
        for(Student student : students){
            if(student.getId()==id){
                System.out.println("Student found");
                return student;
            }
        }
        return null;
    }

    public  ArrayList<String> getAllStudent(){
        ArrayList<String> studentList = new ArrayList<>();
        for(Student student : students){
            studentList.add(student.toString());
        }
        return studentList;
    }

    public void updateStudent(int id, String name, int age, double marks){
        for(Student s : students){
            if(s.getId() == id){
                s.setName(name);
                s.setAge(age);
                s.setMarks(marks);
            }
            return ;
        }
        

    }
}
