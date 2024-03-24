package CreationalDesignPattern.BuilderPattern;

public class Test {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setName("Dhruvil");
        studentBuilder.setClassNo(12);
        studentBuilder.setGender("Male");
        studentBuilder.setSurName("Shah");
        studentBuilder.setRollNo(58);
        Student student = studentBuilder.build();
        System.out.println(student.classNo + " " + student.name + " " + student.surName + " " + student.rollNo + " "
                + student.gender);
    }
}
