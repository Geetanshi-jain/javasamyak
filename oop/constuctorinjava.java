import java.util.Scanner;

public class constuctorinjava {
    public String name;
    final int mark = 10;
    int rollno;

    public void mthd() {
        System.out.println("marks = " + mark);
    }

    public static void main(String[] args) {
        constuctorinjava c = new constuctorinjava();
        c.mthd();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks");
        int m = sc.nextInt();

        System.out.println("enter your name");
        sc.nextLine();
        String nm = sc.nextLine();
        System.out.println("m = " + m);
        System.out.println("nm = " + nm);

    }
}