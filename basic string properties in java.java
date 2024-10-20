import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // taking user inputs for the string
        System.out.println("Enter the two String inputs");
        String s1=sc.nextLine();// for single word string input
        String s2=sc.nextLine();// for a line of input along with spaces in between the words
        // concatenation
        String s3=s1+s2;
        System.out.println("The result of concatenation of the two Strings is:"+s3);
        // example for concatenation
        String firstname="Mayur";
        String lastname="Shetty";
        String name=firstname+" "+lastname;
        System.out.println("Name:"+name);
        // to print tthe length of the string
        System.out.println("The length of the string name is "+name.length());
        // accessing the individual characters from the string 
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        sc.close();
    }
}