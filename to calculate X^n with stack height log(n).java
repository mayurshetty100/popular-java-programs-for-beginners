import java.util.Scanner;
class recursion2{
    public static int calculatePower(int x, int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return calculatePower(x,n/2)*calculatePower(x,n/2);
        }else{
            return calculatePower(x,n/2)*calculatePower(x,n/2)*x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and exponent");
        int x=sc.nextInt();//enter the base value
        int n=sc.nextInt();//enter the exponent value
        int result=calculatePower(x,n);
        System.out.println("The result is : "+result);
        sc.close();
    }
}