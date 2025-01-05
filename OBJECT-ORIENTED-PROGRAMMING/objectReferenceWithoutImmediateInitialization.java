class Example {
    void display() {
    System.out.println("Example3 object method called.");
    }
}
public class objectReferenceWithoutImmediateInitialization {
    public static void main(String[] args) {
    // Declaring a reference to Example3, but not initializing it
    Example j;
    //if (j == null) {
      //  System.out.println()"Reference j is null.");
        //}
    // At this point(i.e. above), 'j' is null and cannot be used until initialized
    j = new Example(); // Now 'j' points to a new Example3 object
    // Now you can use the 'j' reference
    j.display(); // Outputs: Example3 object method called.
    }
}
    