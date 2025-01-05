//interface engine
interface Engine {
    void start();
}

//petrolEngine implementation
class PetrolEngine implements Engine{
    public void start() {
        System.out.println("Petrol Engine started");
    }
}

//electric engine implementation
class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric Engine started");
    }
}

// this  class depends on engine interface and not on any of its implementations
class Car {
    private Engine engine;  // Loose coupling: Car depends on the Engine interface
    
    // Constructor with dependency injection
    Car(Engine engine) {
        this.engine = engine;  // Injecting the engine dependency
    }
    
    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

public class Loosecoupling {
    public static void main(String[] args) {
        // two types of engines
        Engine petrolEngine = new PetrolEngine();
        Engine electricEngine = new ElectricEngine();
        
        //petrol engine calling
        Car car1 = new Car(petrolEngine);
        car1.drive();  // Uses Petrol Engine
        
        //electric engine calling
        Car car2 = new Car(electricEngine);
        car2.drive();  // Uses Electric Engine
    }
}
// loose coupling allows flexibility of the program 