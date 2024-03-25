package CreationalDesignPattern.PrototypePattern;

public class Student implements Prototype {
    String name;
    private int rollNo;
    String surName;

    Student(String name, int rollNo, String surName) {
        this.name = name;
        this.rollNo = rollNo;
        this.surName = surName;
    }

    @Override
    public Prototype clone(){
        return new Student(this.name, this.rollNo, this.surName);
    }

}
