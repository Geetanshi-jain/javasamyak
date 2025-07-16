
class Car {
    int wheel = 4;
    double speed = 400;

    public Car() {

    }

    public void speed() {
        System.out.println("speed");
    }
}

class ferrari extends Car {
    String color = "red";

    public void avg() {
        System.out.println("avg age\n ");
    }
}

class Thar extends Car {
    public void clsThar() {
        System.out.println("tharmths called\n");
    }
}

public class hirarchical {

    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
        Thar t = new Thar();
        t.clsThar();
        ferrari f = new ferrari();
        f.speed();
        f.avg();

    }

}
