import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO MY CALCULATOR");
        System.out.println("Enter the two numbers for operation");
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division \n 5 for modulo  ");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("The sum of the two numbers is "+(a+b));
                break;
            case 2:
                System.out.println("The difference of the two numbers is "+(a-b));
                break;
            case 3:
                System.out.println("The product of the two numbers is "+(a*b));
                break;
            case 4:
                System.out.println("The quotient of the two numbers is "+(a/b));
                break;
            case 5:
                System.out.println("The remainder of the two numbers is "+(a%b));
                break;
            default:
                System.out.println("Invalid input ");
        }
       sc.close();
    }
}