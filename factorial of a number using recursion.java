import java.util.Scanner; 
class recursion3{
    public static void factorial(int n,int fact){
        //base case
        if(n==1){
            System.out.println("The factorial of the given number is: "+fact);
            return;
        }
       fact*=n;
       factorial(n-1,fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        factorial(n,1);
        sc.close();
    }
}
