package CreationalDesignPattern.PrototypePattern;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Dhruvil", 10, "Shah");
        Student studentClone = (Student) student.clone();
        System.out.println(studentClone.name + " " + studentClone.surName);

    }
}
