import java.util.*;
class recursion {
    public static void printSubseq(String str,int idx,String res,HashSet<String> allSubseq){
        if(idx==str.length()){
            if(allSubseq.contains(res)){
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        //choose the element 
        printSubseq(str,idx+1,res+str.charAt(idx),allSubseq);

        //don't choose the element 
        printSubseq(str,idx+1,res,allSubseq);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.next();
        HashSet<String> allSubseq=new HashSet<>();//to store the occurences to eliminate the duplicates
        System.out.println("All the subsequences of the string are :");
        printSubseq(str,0,"",allSubseq);
        sc.close();
    }
}
