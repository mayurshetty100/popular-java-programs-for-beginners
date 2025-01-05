//compile time polymorphism (method overloading)
class Calculator {
    // Method with one parameter
    int add(int a) {
        return a + 10;
    }

    // Method with two parameters (overloaded)
    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters (overloaded)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class compiletimepolymorphism{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5));         // Calls add(int a)
        System.out.println(calc.add(5, 10));     // Calls add(int a, int b)
        System.out.println(calc.add(5, 10, 15)); // Calls add(int a, int b, int c)
    }
}