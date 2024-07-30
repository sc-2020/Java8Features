package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> studentPredicateGrade = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> studentPredicateGpa = (student) -> student.getGpa() >= 3.9;
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterStudentsByGradeLevel(){
        System.out.println("\n -- filterStudentsByGradeLevel");
        studentList.forEach(student -> {
            if(studentPredicateGrade.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsByGpa(){
        System.out.println("\n -- filterStudentsByGpa");
        studentList.forEach(student -> {
            if(studentPredicateGpa.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterStudents(){
        System.out.println("\n -- filterStudents");
        studentList.forEach(student -> {
            if(studentPredicateGrade.and(studentPredicateGpa).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGpa();
        filterStudents();
    }
}
