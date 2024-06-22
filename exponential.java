import java.util.Scanner;
class power{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the base number");
        int x=input.nextInt();
        System.out.println("Enter the exponential number");
        int n=input.nextInt();
        int y=x;
        for (int i=1;i<n;i++)
        {
            x=x*y;

        }
        System.out.println("The result of the calculation is =" +x);
    }
}