package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    /**
     * Conditional checks
     */
    static Predicate<Integer> p = (num) -> num % 2 == 0;
    static Predicate<Integer> p1 = (num) -> num % 3 == 0;
    static Predicate<Integer> p2 = (num) -> num % 5 == 0;

    public static void predicateAnd(){
        System.out.println("\n -- predicateAnd");
        System.out.println(p1.and(p2).test(50));
    }

    public static void predicateOr(){
        System.out.println("\n -- predicateOr");
        System.out.println(p1.or(p2).test(50));
    }

    public static void predicateNegate(){
        System.out.println("\n -- predicateNegate");
        System.out.println(p1.negate().test(50));
    }

    public static void main(String[] args) {
        System.out.println(p1.test(45));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
