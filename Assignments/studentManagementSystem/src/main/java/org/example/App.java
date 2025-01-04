package org.example;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        boolean toContinue = true;
        StudentDetails studentDetails; // declaring studentDetails variable outside switch case

        StudentManagement studentManagement = new StudentManagement();
        RecordBook recordBook = new RecordBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Student Management System");
        recordBook.createFile();
        while (toContinue) {
            displayApplicationMenu();
            try {
                System.out.print("Enter the value to proceed: ");
                int integerInputValue = scanner.nextInt();
                System.out.println("***********************************************");
                switch (integerInputValue) {
                    case 1: // adding student
                        System.out.print("Enter new student id: ");
                        int newStudentId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter new student name: ");
                        String newStudentName = scanner.nextLine();

                        System.out.print("Enter new student class: ");
                        int newStudentClass = scanner.nextInt();
                        scanner.nextLine();

                        studentDetails = new StudentDetails(newStudentId, newStudentName, newStudentClass);
                        System.out.println("***********************************************");
                        studentManagement.addStudent(studentDetails);
                        break;
                    case 2: // viewing student
                        List<StudentDetails> viewStudentDetails = studentManagement.viewStudents();
                        if (viewStudentDetails != null) {
                            for (StudentDetails viewStdDetail: viewStudentDetails) {
                                System.out.println(viewStdDetail);
                            }
                        } else {
                            System.out.println("No Record Found!!!");
                        }
                        break;
                    case 3: // updating student
                        System.out.print("Enter the Student Id: ");
                        int stdIdToUpdate = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Student Name: ");
                        String stdNameToUpdate = scanner.nextLine();

                        System.out.print("Enter Student Class: ");
                        int stdClassToUpdate = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("***********************************************");
                        if (stdIdToUpdate <= 0) {
                            System.out.println("Invalid student ID. Student ID must be a positive integer.");
                            return;
                        }
                        else if (stdNameToUpdate.isEmpty()) {
                            System.out.println("Student name cannot be empty.");
                            return;
                        }
                        else if (stdClassToUpdate <= 0 || stdClassToUpdate > 12) {
                            System.out.println("Invalid student class. Student class must be a from 1 to 12.");
                            return;
                        }
                        else {
                            String result = studentManagement.updateStudent(stdIdToUpdate, stdNameToUpdate, stdClassToUpdate);
                            if (Objects.equals(result, "success")) {
                                System.out.println("Student record updated successfully");
                            } else if (Objects.equals(result, "failure")) {
                                System.out.println("No Record found!!!");
                            }
                        }
                        break;
                    case 4: // deleting student
                        System.out.print("Enter student id to delete: ");
                        int deleteStdId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("***********************************************");
                        studentManagement.deleteStudent(deleteStdId);
                        break;
                    case 5: // search by name and view student
                        System.out.print("Enter Student Name: ");
                        scanner.nextLine();
                        String searchStdName = scanner.nextLine();

                        System.out.println("***********************************************");
                        studentManagement.searchStudentByName(searchStdName);
                        break;
                    case 6: // search by id and view student
                        System.out.print("Enter Student Id: ");
                        int searchStdId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("***********************************************");
                        studentDetails = studentManagement.findStudentRecordById(searchStdId);
                        if (studentDetails != null) {
                            System.out.println(studentDetails);
                        } else {
                            System.out.println("No Record Found!!!");
                        }
                        break;
                    case 7: // deleting all records
                        recordBook.deleteFile();
                        studentManagement.deleteAllRecords();
                        break;
                    case 8: // creating a txt file named recordBook
                        recordBook.createFile();
                        break;
                    case 9:
                        System.out.println("Thank you for using the Application");
                        toContinue = false;
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid input: " + integerInputValue);
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("***********************************************");
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
    }

    private static void displayApplicationMenu() {
        System.out.println("***********************************************");
        System.out.println("Press 1 for adding a new student details");
        System.out.println("Press 2 for displaying students details");
        System.out.println("Press 3 for updating student detail");
        System.out.println("Press 4 for deleting student detail");
        System.out.println("Press 5 for displaying student details based on student name");
        System.out.println("Press 6 for displaying student details based on student id");
        System.out.println("Press 7 for deleting record book");
        System.out.println("Press 8 for creating a record book");
        System.out.println("Press 9 for Exit");
        System.out.println("***********************************************");
    }
}
