
import java.util.Scanner;
class functions{
    public static void greater (int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a<b){
            System.out.println(b+" is greater than "+a);
        }
        else if (a==b){
            System.out.println("both the numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter the input numbers ");
        int a=input.nextInt();
        int b=input.nextInt();
        greater(a,b);
        input.close();
    }
}