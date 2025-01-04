package org.example;

import org.example.controller.Student;
import org.example.dao.StudentDaoInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Spring ORM started....");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configuration.xml");
        /*Through StudentDao class*/
//        StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);

        /*Through StudentDao Interface*/
        StudentDaoInterface studentDaoInterface = applicationContext.getBean("studentServiceImpl", StudentDaoInterface.class);

        System.out.println("Press 1 for adding a new entry of student ");
        System.out.println("Press 2 for displaying all entries of students");
        System.out.println("Press 3 for displaying entry of single student");
        System.out.println("Press 4 for deleting a student entry");
        System.out.println("Press 5 for updating student entry");
        System.out.println("Press 6 for Exit");


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the value to proceed: ");
            int inputValue = scanner.nextInt();
            switch (inputValue) {
                case 1:
                    // adding a new entry
                    Student student = new Student();
                    student.setStudentId(104);
                    student.setStudentName("John");
                    student.setStudentCity("New York");

                    int value = studentDaoInterface.insert(student);
                    System.out.println("Inserted studentId is: " + value);
                    System.out.println("Student entry added successfully");
                    break;
                case 2:
                    // displaying all entries
                    List<Student> allStudentsData = studentDaoInterface.getAllStudents();
                    System.out.println("List of all student entries:");
                    for (Student std : allStudentsData) {
                        System.out.println("****************************");
                        System.out.println("studentId: " + std.getStudentId());
                        System.out.println("studentName: " + std.getStudentName());
                        System.out.println("studentCity: " + std.getStudentCity());
                    }
                    break;
                case 3:
                    // displaying single entry
                    Student selectedStudent = studentDaoInterface.getStudent(101);
                    System.out.println("Selected student entry data: ");
                    System.out.println("****************************");
                    System.out.println("studentId: " + selectedStudent.getStudentId());
                    System.out.println("studentName: " + selectedStudent.getStudentName());
                    System.out.println("studentCity: " + selectedStudent.getStudentCity());
                    System.out.println("****************************");
                    break;
                case 4:
                    // deleting entry
                    studentDaoInterface.deleteStudent(104);
                    System.out.println("Student entry deleted successfully");
                    break;
                case 5:
                    // updating entry
                    Student updatedStudent = new Student();
                    updatedStudent.setStudentId(101);
                    updatedStudent.setStudentName("Jake");
                    updatedStudent.setStudentCity("Qatar");

                    studentDaoInterface.updateStudent(updatedStudent);
                    System.out.println("Student entry updated successfully");
                    break;
                case 6:
                    System.out.println("Exiting from application!!!");
                    // exit from application
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + inputValue);
            }
        } catch (Exception e) {
            System.out.println("Invalid input.... Try again!!!");
            System.out.println(e.getMessage());
        }
        System.out.println("Thank you for using the application...");
    }
}
