package dao;

import controller.Student;

import java.util.List;

public interface StudentDao {
    // StudentDao is the parent of StudentServiceImpl class.
    int insert(Student student);
    int update(Student student);
    int delete(int studentId);
    Student getStudent(int studentId);
    List<Student> getAllStudents();

}
