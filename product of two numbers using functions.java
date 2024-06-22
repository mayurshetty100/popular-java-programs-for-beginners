 import java.util.Scanner;
class functions{
    public static int calculateproduct(int a ,int b) {
        int product=a*b;
        System.out.println("the product of the two numbers is "+product);
        return 1;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the two integers ");
        int a = input.nextInt();
        int b=input.nextInt();
        calculateproduct(a,b);
    }

}
