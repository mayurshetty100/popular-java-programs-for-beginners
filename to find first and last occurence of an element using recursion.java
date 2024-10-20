import java.util.Scanner;
class Recursion{
    public static int first =-1;
    public static int last=-1;
    
    public static void getIndices(String s,char c,int idx){
        if(idx==s.length()){
            return;
        }
        if(s.charAt(idx)==c){
            if(first==-1){
                first=idx;
                last=idx;
            }else{
                last=idx;
            }
        }
        getIndices(s,c,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.next();//the string inut from the user
        System.out.println("Enter the character to be searched");
        char c=sc.next().charAt(0);//the character to be checked
        getIndices(s,c,0);
        System.out.println("The first occurence is : "+first);
        System.out.println("The last occurence is: "+last);
        sc.close();
    }
}
