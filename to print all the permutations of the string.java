import java.util.Scanner;
class Recursion {
    public static void printPermutation(String str,int idx,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr, idx+1, perm+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//declaring the scanner class
        System.out.println("Enter the string : ");
        String s=sc.next();
        printPermutation(s,0,"");
        sc.close();
    }
}
