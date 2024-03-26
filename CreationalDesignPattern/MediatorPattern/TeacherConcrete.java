package CreationalDesignPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class TeacherConcrete implements Teacher {
    List<Student> students;
    TeacherConcrete(){
        students = new ArrayList<>();
    }
    @Override
    public void informStudents(Student informer) {
        for(Student student:students){
            if (informer!=student) {
                student.notifyMe("Their is cricket match on 31st March");
            }
        }
    }       

    @Override
    public void addStudents(Student student) {
        students.add(student);
    }
}
