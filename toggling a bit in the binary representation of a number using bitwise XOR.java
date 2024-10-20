import java.util.Scanner;
class toggling{
    public static void toggle(int n,int pos){
        int bitmask=1<<pos;
        System.out.println("The result after toggling is :"+ (n^bitmask));//performs the XOR operation and prints the result of toggling to the console
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);// creating the scanner class
    System.out.println("Enter a number ");// enter a non negative integer number 
    int n=sc.nextInt();
    System.out.println("Enter the position of the bit to be toggled");// to enter the position at which the bit present there must be toggled
    int pos =sc.nextInt();
    toggle(n,pos);
 }
}
/* here the XOR operation prints the bit to 1 if there are are odd number of ones in the operation 
 and it returns 0 if there are even number of 1's or no 1's 

 example : suppose the number is 5 and the pos is 1
  5 can bve written as 0101 in binary 
  bitask is 0010 
  n^bitmask becomes 0111 i.e. 7 in decimal 

  also if pos =2
  bitmask becomes 0100
  n^bitmask is 0001 which is = 1 in decimal
  */
    

