package org.referenceInjection;

public class Marks {
    private int marks_id;
    private String subject_name;

    public Marks() {
    }

    public Marks(int marks_id, String subject_name) {
        this.marks_id = marks_id;
        this.subject_name = subject_name;
    }

    public int getMarks_id() {
        return marks_id;
    }

    public void setMarks_id(int marks_id) {
        this.marks_id = marks_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    @Override
    public String toString() {
        return "Marks{" +
                "marks_id=" + marks_id +
                ", subject_name='" + subject_name + '\'' +
                '}';
    }
}
