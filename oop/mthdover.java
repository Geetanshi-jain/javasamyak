
public class mthdover {

    public void add() {
        System.out.println("it is add fun");
    }

    public int add(int a, int b) {

        return a + b;
    }

    public static int add(float a, float b) {
        int c = (int) (a + b);
        return c;
    }

    public static double add(double a, int b) {
        return a + b;

    }

    public static double add(double a, double b) {
        return a + b;

    }

    public void add(String addNm) {
        System.out.println("addname =   " + addNm);
    }

    public static void main(String[] args) {
        System.out.println("method overloading");
        mthdover m = new mthdover();
        m.add();
        System.out.println(m.add(10, 20));
        System.out.println(add(12.4, 13.2));
        System.out.println(add(12.4f, 13f));
        m.add("add method calling here");

    }

}
