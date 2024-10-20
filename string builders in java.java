
import java.util.Scanner;
class stringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // declaration of string builder
        StringBuilder sb=new StringBuilder("Mayur Shetty");
        System.out.println(sb);// prints sb to console

        // to get a character from specific index in string builder
        System.out.println(sb.charAt(0));//prints the first character to console

        // to set a character at a specific index 
        sb.setCharAt(1,'r');
        System.out.println("After setchar function:"+sb);

        // to insert a character at some index
        sb.insert(2,'i');
        System.out.println("After insertion the StringBuilder becomes"+sb);

        // to delete a character at some index
        sb.delete(2,3);
        System.out.println("After deletion "+sb);

       // to append or to add something at the end of the end of the existing string
       sb.append("RIT");
       System.out.println("The string after appending is :"+sb);

       // to print the length of the string 
       StringBuilder s=new StringBuilder("MS Ramaiah");
       System.out.println("The string is "+s+" and its length is "+s.length());// prints the string and its length to the console

       // to take user input
       StringBuilder newsb =new StringBuilder();
       System.out.println("Enter the new string input ");
       String n=sc.next();
       newsb.append(n);
       System.out.println("The new String is "+newsb);
       sc.close(); 
    }
    
}
