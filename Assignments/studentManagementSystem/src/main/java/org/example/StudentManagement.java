package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public final List<StudentDetails> studentRecord = new ArrayList<>();
    RecordBook recordBook = new RecordBook();

    public void addStudent(StudentDetails student) {
        if (student.getId() <= 0) {
            System.out.println("Invalid student id. Student id must be a positive integer.");
            return;
        }
        if (student.getStudentName().isEmpty()) {
            System.out.println("Student name cannot be empty.");
            return;
        }
        if (student.getStudentClass() <= 0 || student.getStudentClass() > 12) {
            System.out.println("Invalid student class. Student class must be a from 1 to 12.");
            return;
        }

        if (!isStudentIdPresent(student.getId())) {
            studentRecord.add(student);
            recordBook.addDataToFile(student);
            System.out.println("Student record added successfully!!!");
        } else {
            System.out.println("Student Id already exists in records!!!");
        }
    }

    public List<StudentDetails> viewStudents() {
        return studentRecord;
    }

    /*    public StudentDetails viewStudents() {
        if (studentRecord.isEmpty()) {
            System.out.println("No records present!!!");
            return null;
        } else {
            for (StudentDetails std : studentRecord) {
                return std;
            }
        }
        return null;
    }*/

    public String updateStudent(int id, String studentName, int studentClass) {
        if (isStudentIdPresent(id)) {
            StudentDetails singleStudentRecord = findStudentRecordById(id);
            recordBook.emptyDataFromFile();
            singleStudentRecord.setStudentName(studentName);
            singleStudentRecord.setStudentClass(studentClass);
            for (StudentDetails std : studentRecord) {
                recordBook.addDataToFile(std);
            }
            return "success";
        } else {
            return "fail";
        }
    }

    public void deleteStudent(int id) {
        if (isStudentIdPresent(id)) {
            StudentDetails stdRecord = findStudentRecordById(id);
            studentRecord.remove(stdRecord);
            recordBook.emptyDataFromFile();
            for (StudentDetails std : studentRecord) {
                recordBook.addDataToFile(std);
            }
            System.out.println("Student Record deleted Successfully!!!");
        } else {
            System.out.println("No Record found!!!");
        }
    }

    public void deleteAllRecords() {
        if (studentRecord.isEmpty()) {
            System.out.println("No records are created!!!");
        } else {
            studentRecord.clear();
            System.out.println("All thr records are removed!!!");
        }
    }

    public boolean isStudentIdPresent(int id) {
        for (StudentDetails std : studentRecord) {
            if (std.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public StudentDetails findStudentRecordById(int id) {
        for (StudentDetails std : studentRecord) {
            if (std.getId() == id) {
                return std;
            }
        }
        return null;
    }

    public void searchStudentByName(String studentName) {
        if (studentName.isEmpty()) {
            System.out.println("Student name cannot be empty.");
        }
        if (studentRecord.isEmpty()) {
            System.out.println("No records present by student name: " + studentName);
        } else {
            for (StudentDetails std : studentRecord) {
                if (std.getStudentName().equalsIgnoreCase(studentName)) {
                    System.out.println(std);
                }
            }
        }
    }
}
