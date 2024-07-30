package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> {
        System.out.println(name + " : " + activities);
    };

    Consumer<Student> studentConsumer = (student) -> {
        //with Predicate And
        if(p1.and(p2).test(student)){
            System.out.println("\n -- with Predicate And");
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }

        //with BiPredicate
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
            System.out.println("\n -- with BiPredicate");
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
