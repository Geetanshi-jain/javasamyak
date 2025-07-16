
// Class with encapsulation
class Student {
    // Private
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String newName) {
        name = newName;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

// Main class to test
public class encapsulatio {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setters
        s.setName("Geetanshi");
        s.setAge(21);

        // Getting values using getters
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}