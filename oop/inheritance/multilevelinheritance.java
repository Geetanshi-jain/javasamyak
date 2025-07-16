package inheritance;

class car {
    int wheel = 4;
    double speed = 400.0;

    public car() {

    }

    public void speed() {
        System.out.println("spedd of ar is " + this.speed);
    }

}

class ferrari extends car {
    String color = "red";

    public void avg() {
        System.out.println("avg of feerrari " + this.color);
    }
}

class ferrari2 extends ferrari {
    public void ferrari2mthd() {
        System.out.println("ferrari 2 mthd ");
    }

}

public class multilevelinheritance {

    public static void main(String[] args) {
        car c = new car();
        c.speed();
        ferrari f = new ferrari();
        f.avg();

    }

}
