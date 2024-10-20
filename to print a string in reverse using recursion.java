import java.util.Scanner;
class recursion2{
    public static String revString(String s){
        if(s.length()==1){
            return s;
        }
        char curr=s.charAt(0);
        String nextString=revString(s.substring(1));
        return nextString+curr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=sc.nextLine();
        String rev=revString(s);
        System.out.println("The reversed string is : "+rev);
    }
    
}
