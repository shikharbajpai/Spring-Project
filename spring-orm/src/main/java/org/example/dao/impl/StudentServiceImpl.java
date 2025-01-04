package org.example.dao.impl;

import org.example.controller.Student;
import org.example.dao.StudentDaoInterface;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentServiceImpl implements StudentDaoInterface {
    private HibernateTemplate hibernateTemplate;

    public StudentServiceImpl() {
    }

    public StudentServiceImpl(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    @Transactional
    public int insert(Student student) {
        return (int) this.hibernateTemplate.save(student);
    }

    @Override
    @Transactional
    public Student getStudent(int studentId) {
        return this.hibernateTemplate.get(Student.class, studentId);
    }

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return this.hibernateTemplate.loadAll(Student.class);
    }

    @Override
    @Transactional
    public void deleteStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        if (student != null) {
            this.hibernateTemplate.delete(student);
        }
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        this.hibernateTemplate.update(student);
    }
}
