package CreationalDesignPattern.MediatorPattern;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new TeacherConcrete();
        StudentConcrete stud1 = new StudentConcrete(teacher, "Dhruvil");
        StudentConcrete stud2 = new StudentConcrete(teacher, "Parth");
        StudentConcrete stud3 = new StudentConcrete(teacher, "Dev");

        teacher.addStudents(stud1);
        teacher.addStudents(stud2);
        teacher.addStudents(stud3);

        stud1.makeAnnouncement();
    }
}
