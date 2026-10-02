package com.studentmanagement;
import java.util.ArrayList;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;
public class Main {
    public static void main(String[] args){
        Student s1 = new Student(01, "Navina", 24, 90);
        Student s2 = new Student(02, "Ren", 25, 98);

        StudentService studentService = new StudentService();

        studentService.addStudent(s1);
        studentService.addStudent(s2);
        Student s = studentService.getStudentById(02);
        System.out.println(s.toString());

        ArrayList<String> students = studentService.getAllStudent();
        System.out.println(students);

        studentService.updateStudent(01, "Navi", 24, 95);
        System.out.println(studentService.getStudentById(01));
    }
}
