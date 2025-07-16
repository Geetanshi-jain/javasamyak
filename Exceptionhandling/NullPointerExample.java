package Exceptionhandling;

public class NullPointerExample {
    public static void main(String[] args) {
        String str = null; // str doesn't point to any object

        try {
            // Attempting to call a method on a null object
            System.out.println(str.length()); // This line throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }

}
