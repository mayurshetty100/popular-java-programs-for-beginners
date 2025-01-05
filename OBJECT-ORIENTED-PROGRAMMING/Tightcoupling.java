class Engine {
    void start() {
    System.out.println("Engine starts.");
    }
}
    class Car {
    private Engine engine = new Engine(); // Tight Coupling
    void drive() {
    engine.start();
    System.out.println("Car is moving.");
    }
}
    public class Tightcoupling {
    public static void main(String[] args) {
    Car car = new Car();
    car.drive();
    }
}
/*Coupling describes how closely the classes are connected to each other.
tight coupling means the changes in one class will often require changes in other class
like in the above example , the changes in the engine class needs the changes in the drive class too
it makes the system harder to maintain and extend.
here the classes are directly dependent on each other  
*/
