class ExampleClass {
    // Object created using field initializer
    HelperClass helper = new HelperClass();
    void displayHelperMessage() {
    helper.displayMessage();
    }
}
    class HelperClass {
    void displayMessage() {
    System.out.println("Hello from HelperClass!");
    }
}
public class FieldInitializer {
    public static void main(String[] args) {
    ExampleClass example = new ExampleClass();
    example.displayHelperMessage();
    }
}