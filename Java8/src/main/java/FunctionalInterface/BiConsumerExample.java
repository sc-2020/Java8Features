package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(name + " : " + activities);
        };

        studentList.forEach(student -> {biConsumer.accept(student.getName(), student.getActivities());});
    }
    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + " b: " + b);
        };
        biConsumer.accept("sakshi", "chaudhari");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println(a*b);
        };
        multiply.accept(4,5);

        printNameAndActivities();
    }
}
