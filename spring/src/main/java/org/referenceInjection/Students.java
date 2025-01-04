package org.referenceInjection;

public class Students {
    private int student_id;
    private Marks marks;

    public Students() {
    }

    public Students(int student_id, Marks marks) {
        this.student_id = student_id;
        this.marks = marks;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "student_id=" + student_id +
                ", marks=" + marks +
                '}';
    }
}
