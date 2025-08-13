
// First interface
interface Engine {
    void start();
}

// Second interface
interface MusicSystem {
    void playMusic();
}

// A class implementing both interfaces
class Car implements Engine, MusicSystem {
    public void start() {
        System.out.println("Car engine started...");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }
}




public class multipleInheritanceWithInterfaces {
    
public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();      // From Engine interface
        myCar.playMusic();  // From MusicSystem interface
    }
}

