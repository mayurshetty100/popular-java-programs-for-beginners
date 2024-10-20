import java.util.Scanner;
class functions{
    public static void gcd(int x,int y){
     int result=1;
     if(x<=y){
         for(int i=1;i<=x;i++ ){
             if(x%i==0&&y%i==0) {
                 result = i;
             }
             }
         }else {
         for(int i=1;i<=y;i++){
             if(y%i==0&&x%i==0){
                 result=i;
             }
         }
     }
        System.out.println("The greatest common divisor of the two number is "+result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers whose GCD is to be found");
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcd(a,b);
        sc.close();
    }
}