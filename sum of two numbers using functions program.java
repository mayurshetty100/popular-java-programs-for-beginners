import java.util.Scanner;
class functions{
    public static int calculatesum(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("sum of the two numbers is "+calculatesum(a,b));
    }
}