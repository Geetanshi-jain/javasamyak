// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();

    // Non-abstract method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class abstractionExample {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Dog object
        Animal myCat = new Cat(); // Cat object

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows

        myDog.sleep(); // Output: Sleeping...
        myCat.sleep(); // Output: Sleeping...
    }
}
