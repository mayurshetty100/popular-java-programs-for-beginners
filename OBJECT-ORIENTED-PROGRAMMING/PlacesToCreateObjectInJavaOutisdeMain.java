class ExampleClass {
    // Method where we create an object
    void someMethod() {
    // Creating an object of HelperClass inside someMethod
    HelperClass helper = new HelperClass();
    helper.displayMessage();
    }
    // Another method that creates an object of HelperClass
    void anotherMethod() {
    HelperClass helper = new HelperClass();
    helper.displayMessage();
    }
    }
    // Another class that we'll instantiate in different methods
    class HelperClass {
    void displayMessage() {
    System.out.println("Hello from HelperClass!");
    }
}
    public class PlacesToCreateObjectInJavaOutisdeMain {
    public static void main(String[] args) {
    ExampleClass example = new ExampleClass();
    // Calling methods that create objects within them
    example.someMethod();
    example.anotherMethod();
    } 
}