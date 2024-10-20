
import java.util.Scanner;
class bitManipulation {
     public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     // get bit operation
     int n=5;// 0101 in binary (divide 5 by 2 and note down the remainders)
     int pos=3;
     int bitMask=1<<pos;// leftshift operator <<
     System.out.println(bitMask);// prints the integer value of the bitmask i.e. 8 (0100)
     if((bitMask&n)==0)/* performs bitwise AND operation between the binary convertion of 5 i.e. 
     0101 and the bitMask i.e. 0100 . so all other digits will be zero as the bitmask has only one 1
     and if the number 5 has 0 in that place where bitmask has one , it will give zero else it will give one 
      */
     {
        System.out.println("The bit was zero.");
     }else{
        System.out.println("The bit was one");
     }   
     //set bit operation
     pos=1;
     bitMask=1<<pos;// leftshift operator <<
     int newnumber=bitMask|n;
     System.out.println("The new number is "+newnumber);// prints the result after set operation 
     //i.e 7 (0111 in binary)
     // clear bit operation
     pos=2;
     bitMask=1<<pos;//0100 is the bitmask
     int newBitMask= ~(bitMask);// creates the complement of the bitmask to remove the bit 
     // at the position of 1 in the bitmask
     int newNumber=newBitMask & n;// here n is 5 (0101) and becomes 0001
     System.out.println("The result after clearBit operation is "+newNumber);// prints the result after clearing to the console
    
      //update bit operation
     int oper=sc.nextInt();// if oper=1 (to convert the bit into 1) => set operation to update the bit
      // if oper=0 (to convert the bit into 0)=> perform clear operation to update the bit
     pos=1;
     bitMask=1<<pos;// 0010
     if(oper==1)// to convert the bit into 1
     {      //set operation
      newNumber= bitMask | n;
      System.out.println(" The number after updation is "+newNumber);// prints the result after updation
     }
     else
     {
      //clear operation to convert the bit into 0
      newBitMask=~(bitMask);
      newNumber=newBitMask & n;
      System.out.println("The number after updation is "+newNumber);
      sc.close();
     }
   }
}
