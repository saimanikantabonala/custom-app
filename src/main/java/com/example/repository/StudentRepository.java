package com.example.repository;

import com.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public void createStudent(String name, int id) {
        Student s = new Student(name, id);
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void updateStudent(String name, int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
            }
        }
    }

    public void deleteStudent(int id) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == id) {
                student = s;
                break;
            }
        }
        students.remove(student);
    }
}
