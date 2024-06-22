import java.util.Scanner;
class functions{
    public static void infinite(int n){
        do{
            System.out.println("hello, Mayur shetty");
            n=n+1;
        }
        while(n>1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=input.nextInt();
        infinite(n);
        input.close();
    }
}