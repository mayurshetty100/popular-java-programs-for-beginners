import java.util.Scanner;
class recursion{
    public static int calculatepower(int b,int e){
     if(e==0){
        return 1;
     } else if(b==0){
        return 0;
     }
     int power=b*calculatepower(b,e-1);//recursive call to higher powers of the base 
     return power;
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int exponent=sc.nextInt();
        int result=calculatepower(base,exponent);
        System.out.println("The result is "+result);
        sc.close();
    }
}