class Engine {
    void start() {
    System.out.println("Engine starts.");
    }
}
    class Wheel {
    void rotate() {
    System.out.println("Wheel is rotating.");
    }
}
    class Car {
    private Engine engine;
    private Wheel wheel;
    //we can even write private Engine engine=new Engine(); directly
    public Car() {
    engine = new Engine(); // Composition
    wheel = new Wheel(); // Composition
    }
    void drive() {
    engine.start();
    wheel.rotate();
    System.out.println("Car is moving.");
    }
}
public class Composition{
    public static void main(String[] args) {
    Car car = new Car();
    car.drive();
    }
}