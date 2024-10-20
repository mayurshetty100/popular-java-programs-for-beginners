import java.util.Scanner;
class Recursion8{

    public static void printSubseq(String str,int idx,String res){
        if(idx==str.length()){
            System.out.println(res);
            return;
        }
        //choose the element
        printSubseq(str,idx+1,res+str.charAt(idx));
        //don't choose the element
        printSubseq(str,idx+1,res);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();//taking the string input
        System.out.println("The subsequences are as follows : ");
        printSubseq(str ,0,"");
        sc.close();
    }
}
