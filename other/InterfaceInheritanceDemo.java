// Parent interface
interface Animal {
    void eat();
}

// Child interface extending another interface
interface Pet extends Animal {
    void play();
}

// Class implementing the child interface
class Dog implements Pet {
    public void eat() {
        System.out.println("Dog is eating...");
    }
    public void play() {
        System.out.println("Dog is playing...");
    }
}

public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // from Animal
        myDog.play(); // from Pet
    }
}
