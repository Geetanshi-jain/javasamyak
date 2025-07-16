package Exceptionhandling;

public class GenricExceptionExample {

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int a = 10;
            int b = 0;
            int result = a / b; // This will throw ArithmeticException

            System.out.println("Result: " + result);
        } catch (Exception e) { // Generic exception catch block
            System.out.println("Something went wrong: " + e);
        }

        System.out.println("Program continues...");
    }
}
