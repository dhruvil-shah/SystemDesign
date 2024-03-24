package CreationalDesignPattern.BuilderPattern;

public class StudentBuilder {
    public int rollNo;
    public String name;
    public String surName;
    public String gender;
    public int classNo;
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }
    Student build(){
        return new Student(this);
    }
    
}
