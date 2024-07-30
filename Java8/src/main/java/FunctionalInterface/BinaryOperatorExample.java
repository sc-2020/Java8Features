package FunctionalInterface;

import javax.swing.text.Position;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    /**
     * Takes two examples and produces one single output
     * if input and output types are same we can use unary and binary operator in place of functions
     */

    static Comparator<Integer> compare = (a, b) -> a.compareTo(b);
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(5, 6));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(compare);
        System.out.println("Result of maxBy is : " + maxBy.apply(5, 7));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(compare);
        System.out.println("Result of minBy is : " + minBy.apply(5, 7));
    }
}
