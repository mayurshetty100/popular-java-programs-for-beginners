import java.util.Scanner;
class countofones{
    public static void count(int n){
        int c=0;
        while(n!=0){
            if((n & 1)!=0){
                c++;
            }
            n=n>>1;
        }
        System.out.println("The number of ones in the binary representation of the number is "+c);// prints the number of ones in the binary representation of the number to the console
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a non negative integer number");
        int n=sc.nextInt();
        count(n);
    }
}
/* here first n becomes binary  
 * suppose n=5 
 * it becoems 0101
 * then n & 1 is 0101 & 0001 which is equal to 0001 !=0 so count will be 1 
 * then n will be right shifted by one postion i.e it becomes 0010 the 1 at 
 * last position will be eliminated.
 */