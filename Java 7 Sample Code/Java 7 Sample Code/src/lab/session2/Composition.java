package lab.session2;

class Car {
    public void start() {
        System.out.println("車子啟動");
    }
}
class Rocket{
    public void shootRockets() {
        System.out.println("發射火箭");
    }
}
class SunRoof {
    public void openSunRoof() {
        System.out.println("打開敞篷");
    }
}
class SpyCar {
    private Car car = new Car();
    private Rocket rocket = new Rocket();
    private SunRoof sunRoof = new SunRoof();
    public void start() {
        car.start(); // Method forwarding(方法轉發)
    } 
    public void shootRockets() {
        rocket.shootRockets();
    }
    public void openSunRoof() {
        sunRoof.openSunRoof();
    }    
}

public class Composition {
    public static void main(String[] args) {
        SpyCar spyCar = new SpyCar();
        spyCar.start();
        spyCar.openSunRoof();
        spyCar.shootRockets();
    }
}

