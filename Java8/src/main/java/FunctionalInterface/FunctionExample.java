package FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {

    /**
     * Type conversion
     */
    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> addSomeString = (name) -> name.concat("chaudhari");

    public static void main(String[] args) {
        System.out.println("Result is: " + function.apply("sakshi"));
        System.out.println("Result of andThen is: " + function.andThen(addSomeString).apply("sakshi"));
        System.out.println("Result of andThen is: " + function.compose(addSomeString).apply("sakshi"));
        System.out.println("Result of andThen is: " + function.andThen(addSomeString).compose(function).apply("sakshi"));
    }

}
