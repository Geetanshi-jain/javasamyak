package Exceptionhandling;

public class FinallyWithReturn {
    public static int getValue() {
        try {
            return 10;
        } finally {
            System.out.println("finally block executed even after return!");
        }
    }

    public static void main(String[] args) {
        int value = getValue();
        System.out.println("Returned value: " + value);
    }
}
