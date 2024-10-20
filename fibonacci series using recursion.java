import java.util.Scanner;
class recursion4{
    public static void fibonacci(int n,int a ,int b){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
        fibonacci(n-1,a,b);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");//input an integer
        int n=sc.nextInt();
        System.out.print(0+" "+1+" ");
        fibonacci(n-2,0,1);
    }
    
}
