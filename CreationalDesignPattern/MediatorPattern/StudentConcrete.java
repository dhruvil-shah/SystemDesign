package CreationalDesignPattern.MediatorPattern;

public class StudentConcrete implements Student {
    Teacher teacher;
    public String name;

    StudentConcrete(Teacher teacher, String name) {
        this.teacher = teacher;
        this.name = name;
    }

    @Override
    public void makeAnnouncement() {
        teacher.informStudents(this);
    }

    @Override
    public void notifyMe(String msg) {
        System.out.println(name + " : " + msg);
    }

}
