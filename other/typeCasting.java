package other;

//Implicite type casting example

/*1. Widening (Implicit) Casting */
//int → long → float → double

/*✅ 2. Narrowing (Explicit) Casting
→ Converting a larger type to a smaller type (manually done).
Example: double → float → long → int → short → byte */

public class typeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a; // automatic widening

        System.out.println("int value: " + a);
        System.out.println("double value: " + b);
    }
}
