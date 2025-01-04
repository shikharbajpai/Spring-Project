package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementTest {
    StudentManagement studentManagement;
    StudentDetails studentDetails;
    private List<StudentDetails> studentRecord;

    @Before
    public void setUp() {
        studentManagement = new StudentManagement();
        studentDetails = new StudentDetails(100, "John Doe", 12);
        studentRecord = new ArrayList<>();
    }

    @Test
    public void testAddStudentValidInput() {
        studentManagement.addStudent(studentDetails);
        Assert.assertTrue(studentManagement.isStudentIdPresent(100));
        for (StudentDetails details : studentManagement.studentRecord) {
            Assert.assertEquals(studentDetails, details);
        }
    }

    @Test
    public void testAddStudentInvalidId() {
        StudentDetails invalidStudentId = new StudentDetails(-1, "Invalid id", 10);
        studentManagement.addStudent(invalidStudentId);
        Assert.assertFalse(studentManagement.isStudentIdPresent(-1));
    }

    @Test
    public void testAddStudentEmptyName() {
        StudentDetails invalidStudentName = new StudentDetails(2, "", 10);
        studentManagement.addStudent(invalidStudentName);
        Assert.assertFalse(studentManagement.isStudentIdPresent(2));
    }

    @Test
    public void testAddStudentInvalidClass() {
        StudentDetails invalidClassName = new StudentDetails(2, "Sam Doe", 13);
        studentManagement.addStudent(invalidClassName);
        Assert.assertFalse(studentManagement.isStudentIdPresent(2));
    }

    @Test
    public void testAddStudentAlreadyPresent() {
        StudentDetails duplicateStudentDetails = new StudentDetails(2, "Sam Doe", 12);
        studentManagement.addStudent(duplicateStudentDetails);
        studentManagement.addStudent(duplicateStudentDetails);
        Assert.assertTrue(studentManagement.isStudentIdPresent(2));
    }

    @Test
    public void testViewStudent() {
        StudentDetails viewStudentDetails = new StudentDetails(2, "Sam Doe", 12);
        studentRecord.add(viewStudentDetails);
        studentManagement.addStudent(viewStudentDetails);
        List<StudentDetails> result = studentManagement.viewStudents();
        Assert.assertEquals(studentRecord.size(), result.size());
        Assert.assertTrue(result.contains(viewStudentDetails));
    }

    @Test
    public void testUpdateStudentValidInput() {
        StudentDetails updatedStudent = new StudentDetails(1, "John Doe", 10);
        studentManagement.addStudent(updatedStudent);
        studentManagement.updateStudent(1, "Updated Name", 11);
        Assert.assertEquals("Updated Name", studentManagement.findStudentRecordById(1).getStudentName());
    }

    @Test
    public void testUpdateStudentIdNotPresent() {
        StudentDetails student = new StudentDetails(1, "John Doe", 10);
        studentManagement.addStudent(student);
        studentManagement.updateStudent(2, "Updated Name", 11);
        Assert.assertFalse(studentManagement.isStudentIdPresent(-1));
    }

    @Test
    public void testDeleteStudentValidId() {
        StudentDetails removedStudent = new StudentDetails(1, "John Doe", 10);
        studentManagement.addStudent(removedStudent);
        studentManagement.deleteStudent(1);
        Assert.assertFalse(studentManagement.isStudentIdPresent(1));
    }
}
