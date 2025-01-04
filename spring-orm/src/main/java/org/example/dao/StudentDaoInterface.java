package org.example.dao;

import org.example.controller.Student;

import java.util.List;

public interface StudentDaoInterface {

    // Creating a new row data in the table
    int insert(Student student);

    // Reading a particular row data in table
    Student getStudent(int studentId);

    // Reading all the rows data in table
    List<Student> getAllStudents();

    // Deleting a particular row data in table
    void deleteStudent(int studentId);

    // Updating a particular row data in table
    void updateStudent(Student student);

}
