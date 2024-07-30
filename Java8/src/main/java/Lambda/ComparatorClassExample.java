package Lambda;

import java.util.Comparator;

public class ComparatorClassExample {
    public static void main(String[] args) {

        /**
         * Prior to Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of comparator is: " + comparator.compare(4,5));

        /**
         * with Lmabda
         */
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of comparator with lambda is: " + comparatorLambda.compare(4, 5));

        /**
         * with Lmabda without specifying type to parameters
         */
        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
        System.out.println("Result of comparator with lambda1 is: " + comparatorLambda1.compare(4, 5));
    }
}
