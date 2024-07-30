package FunctionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    /**
     * exactly opposite of consumer (accepts input returns nothing)
     * supplier - takes no input but returns an output on invocation to the caller
     */

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
          return new Student("Sakshi", 2, 3.6, "female", Arrays.asList("badminton", "dancing"));
        };

        System.out.println("Student is : " + studentSupplier.get());

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println("Result similar to getFromStuentDatabase : " + listSupplier.get());


    }
}
