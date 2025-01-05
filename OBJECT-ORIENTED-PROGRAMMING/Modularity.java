/* modularity is the division of code into self contained independent steps 
improving readability */
 class MathOperations {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
}
public class Modularity {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        
        int num1 = 10;
        int num2 = 5;
        
        // Using the MathOperations methods
        System.out.println("Addition: " + mathOps.add(num1, num2));
        System.out.println("Subtraction: " + mathOps.subtract(num1, num2));
        System.out.println("Multiplication: " + mathOps.multiply(num1, num2));
        System.out.println("Division: " + mathOps.divide(num1, num2));
    }
}
