import java.util.Scanner;
 class recursion {
    //prints the numbers from n to 1

    public static void printbackward(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printbackward(n-1);//recursive call to the next stage
    }
    // prints the numbers from 1 to n
    public static void printforward(int n){
        //base case
        if(n==0){
            return;
        }
        printforward(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();// input a positive integer
        System.out.println("The forward pattern is as follows");
        printforward(n);//prints the numberrs from 1 to n
        System.out.println();
        System.out.println("The backward pattern is as follows");
        printbackward(n);// prints the numbers from n to 1
    }
    
}
