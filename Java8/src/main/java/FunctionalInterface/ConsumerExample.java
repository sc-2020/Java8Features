package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    /**
     * similar to getters
     */
    static Consumer<Student> consumer = (student) -> System.out.println(student);
    static Consumer<Student> studentActivities = (student) -> System.out.println(student.getActivities());
    static Consumer<Student> studentName = (student) -> System.out.print(student.getName());
    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printName(){
        System.out.println(" \n -- printName : ");
        studentList.forEach(consumer);
    }

    public static void printNameAndActivities(){
        System.out.println(" \n -- printNameAndActivities : ");
        studentList.forEach(studentName.andThen(studentActivities)); //consumer chaining
    }

    public static void printNameAndActivitiesWithGradeCondition(){
        System.out.println(" \n -- printNameAndActivitiesWithGradeCondition : ");
        studentList.forEach(student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                studentName.andThen(studentActivities).accept(student);
            }
        }); //consumer chaining
    }

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> {
            System.out.println(s.toUpperCase());
        };

        consumer.accept("Sakshi");
        printName();
        printNameAndActivities();
        printNameAndActivitiesWithGradeCondition();
    }
}
