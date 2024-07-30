package FunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExmple {

    /**
     * takes and returns the same data type with some modifications on existing object
     */
    static UnaryOperator<String> unaryOperator = (s ->  s.concat("Default"));

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
