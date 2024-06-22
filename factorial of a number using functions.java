import java.util.Scanner;
class functions{
    public static void calculatefactorial(double n){
        double factorial=1;
        for(double  i=n;i>=1;i--)
        {
            factorial= factorial *i;
        }
        System.out.println("The factorial of the given number is "+factorial);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        double n=input.nextDouble();
        calculatefactorial(n);
        input.close();
    }
}