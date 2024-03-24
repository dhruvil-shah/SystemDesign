package CreationalDesignPattern.BuilderPattern;

public class Student {
    public int rollNo;
    public String name;
    public String surName;
    public String gender;
    public int classNo;

    Student(StudentBuilder studentBuilder) {
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.surName = studentBuilder.surName;
        this.gender = studentBuilder.gender;
        this.classNo = studentBuilder.classNo;
    }
}
