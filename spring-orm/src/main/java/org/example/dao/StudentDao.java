package org.example.dao;

import org.example.controller.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;

    public StudentDao() {
    }

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    // Creating a new row data in the table
    @Transactional
    public int insert(Student student) {
        return (int) this.hibernateTemplate.save(student);
    }

    // Reading a particular row data in table
    @Transactional
    public Student getStudent(int studentId) {
        return this.hibernateTemplate.get(Student.class, studentId);
    }

    // Reading all the rows data in table
    @Transactional
    public List<Student> getAllStudents() {
        return this.hibernateTemplate.loadAll(Student.class);
    }

    // Deleting a particular row data in table
    @Transactional
    public void deleteStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        if (student != null) {
            this.hibernateTemplate.delete(student);
        }
    }

    // Updating a particular row data in table
    public void updateStudent(Student student) {
        this.hibernateTemplate.update(student);
    }

    @Override
    public String toString() {
        return "StudentDao{" +
                "hibernateTemplate=" + hibernateTemplate +
                '}';
    }
}
