package org.example;

public class StudentDetails {
    public int id;
    public String studentName;
    public int studentClass;

    public StudentDetails(int id, String studentName, int studentClass) {
        this.id = id;
        this.studentName = studentName;
        this.studentClass = studentClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentClass='" + studentClass + '\'' +
                "}\n";
    }
}

