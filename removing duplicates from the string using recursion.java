import java.util.*;
class Recursion6 {
    public static String removeDuplicates(String str,int idx,boolean present[]){
        if(idx==str.length()){
            return "";
        }
        char curr=str.charAt(idx);
        if(present[curr-'a']){
            return removeDuplicates(str,idx+1,present);
        }else{
            present[curr-'a']=true;
            return curr + removeDuplicates(str,idx+1,present);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();//taking the string input from the user
        boolean present[] = new boolean[str.length()];//creating a boolean array for checking the duplicates
        System.out.println("The String after removing the duplicates is: "+removeDuplicates(str,0,present));
        sc.close();
    }
}
