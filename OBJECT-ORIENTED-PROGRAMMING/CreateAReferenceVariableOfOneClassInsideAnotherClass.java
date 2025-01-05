/*In Java, you can create a reference variable of one class inside another class. This is commonly
used to establish relationships between classes, such as aggregation, association, or composition.
Here’s an example where one class (Car) has a reference variable to another class (Engine) */
// Define the Engine class
class Engine {
    // Method of Engine class
    void start() {
    System.out.println("Engine started.");
    }
}
    // Define the Car class
    class Car {
    // Reference variable of type Engine inside the Car class
    Engine engine; // Car has an Engine
    // Constructor to initialize the Engine reference
    public Car(Engine engine) {
    this.engine = engine;
    }
    // Method to start the car
    void startCar() {
    if (engine != null) {
    engine.start(); // Call the start method of Engine through the reference
    System.out.println("Car started.");
    } else {
    System.out.println("No engine found.");
    }
    }
}
    // main class class to test the reference variable
    public class CreateAReferenceVariableOfOneClassInsideAnotherClass{
    public static void main(String[] args) {
    // Create an Engine object
    Engine engine = new Engine();
    // Create a Car object and pass the Engine object to the constructor
    Car car = new Car(engine);
    // Start the car
    car.startCar();
    }
}
