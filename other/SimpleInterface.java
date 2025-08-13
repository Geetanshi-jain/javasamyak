// Interface declaration
interface Animal {
    // Abstract method (no body)
    void makeSound();

    // Default method (has body)
    default void sleep() {
        System.out.println("Sleeping...");
    }
}

// Class implementing the interface
class Dog implements Animal {
    // Implement the abstract method
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class SimpleInterface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls overridden method
        myDog.sleep();     // Calls default method from interface
    }
}
