package domain.models;

import domain.enums.Semester;

public class Student {
    private int id;
    private String name;
    private String email;
    private Semester semester;

    public Student(int id, String name, String email, Semester semester) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.semester = semester;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", semester=" + semester +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
