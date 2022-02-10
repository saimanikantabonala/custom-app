package com.example.config;

import com.example.model.Student;
import com.example.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepository();
        String name;
        int id;
        do {
            System.out.println("select operation");
            System.out.println("1 -> create student");
            System.out.println("2 -> get students list");
            System.out.println("3 -> update student");
            System.out.println("4 -> remove student");
            int choose = scan.nextInt();
            switch (choose) {
                case 1:
                    name = scan.next();
                    id = scan.nextInt();
                    studentRepository.createStudent(name, id);
                    break;
                case 2:
                    List<Student> list = studentRepository.getStudents();
                    for (Student s : list) {
                        System.out.println("student name:" + s.getName() + "student id:" + s.getId());
                    }
                    break;
                case 3:
                    System.out.println("enter id of student");
                    id = scan.nextInt();
                    System.out.println("enter new student name");
                    name = scan.next();
                    studentRepository.updateStudent(name, id);
                    break;
                case 4:
                    System.out.println("enter student id to remove");
                    id = scan.nextInt();
                    studentRepository.deleteStudent(id);
                    break;
            }
            System.out.println("press y to continue");
            System.out.println("press n to exit");
        }while(scan.next().charAt(0)=='y'||scan.next().charAt(0)=='Y');
    }
}
