import java.util.*;
class Recursion5{
    public static String addChar(int count){
        String newStr="x";//here we cannot use empty strinf because strings are immutable
        for(int i=1;i<count;i++){
            newStr+='x';
        }
        return newStr;
    }
    //here the character to be moved to the end is 'x'
    public static String moveallchar(String str,int idx,int count)
    {
        if(idx==str.length()){
            return addChar(count);
        }
        if(str.charAt(idx)=='x'){
            return moveallchar(str,idx+1,count+1);
        }else{
            String nextStr=moveallchar(str,idx+1,count);
            return str.charAt(idx)+nextStr;
        }
    }
      

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=sc.nextLine();
        int count =0;
        String newString=moveallchar(str,0,count);
        System.out.println("The new String is : "+newString);
        sc.close();
    }
}
