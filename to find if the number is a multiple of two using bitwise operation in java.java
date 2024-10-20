import java.util.Scanner;
class Main {
    public static boolean poweroftwo(int n){
        if((n & n-1)==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=sc.nextInt();// user input (a non negative integer)
        if(poweroftwo(n)){
            System.out.println("The number is a power of two");
        }else{
            System.out.println("The number is not a power of two");
        }
    }
    
}
