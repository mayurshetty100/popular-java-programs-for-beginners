import java.util.Scanner;
class functions{
    public static void fibonacci(int a,int b,int n){
        for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in the fibonacci series");
        int n=sc.nextInt();
        System.out.println("0\n1");
        fibonacci(0,1,n);
    }
}