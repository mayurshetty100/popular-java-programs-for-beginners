abstract class Shape {
    abstract void draw();
    }
    class Circle extends Shape {
    void draw() {
    System.out.println("Drawing a Circle.");
    }
}
    public class Abstraction{
    public static void main(String[] args) {
    Shape shape = new Circle();/*abstract classes may or maynot  have constructors 
    but if they have the constructor then they must be called using their subclass 
    constructors*/
    shape.draw();
    }
}