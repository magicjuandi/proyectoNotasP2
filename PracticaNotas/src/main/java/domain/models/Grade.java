package domain.models;

import java.util.List;

public class Grade {
    private int id;
    private Student student;
    private Subject subject;
    private List<Grade> grades;

    public Grade() {
    }

    public Grade(int id, Student student, Subject subject, List<Grade> grades) {
        this.id = id;
        this.student = student;
        this.subject = subject;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", student=" + student +
                ", subject=" + subject +
                ", grades=" + grades +
                '}';
    }
}
