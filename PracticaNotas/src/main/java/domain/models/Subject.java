package domain.models;

import domain.enums.Semester;

public class Subject {
    private int id;
    private String name;
    private Teacher teacher;
    private Semester semester;

    public Subject(int id, String name, Teacher teacher, Semester semester) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.semester = semester;
    }

    public Subject() {
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
}
