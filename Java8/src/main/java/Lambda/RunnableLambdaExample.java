package Lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /**
         * Prior to Java8
         */

        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        /**
         * with Lambda
         */
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLambda).start();

        /**
         * With lambda for a single line statement
         */
        Runnable runnable1 = () -> System.out.println("Insire Runnable 3");
        new Thread(runnable1).start();

        /**
         * With lambda without creating a Runnable
         */
        new Thread(()-> System.out.println("Inside runnable 4")).start();

    }
}
