import java.util.Scanner;
class Recursion2{
    public static void sumofn(int n,int sum){
        //base case
        if(n==0){
            System.out.println("The sum is: "+sum);
            return; 
        }
        sum+=n;
        sumofn(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");// input a non-negative integer
        int n=sc.nextInt();
        sumofn(n,0);
        sc.close();
    }
}
