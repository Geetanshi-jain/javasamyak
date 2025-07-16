package Exceptionhandling;

// Custom checked exception
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class customExceptionCreation {

    // A method that throws the custom exception
    public static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16); // This will throw the custom exception
        } catch (MyCustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
