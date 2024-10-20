import java.util.*;
class replacing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        String s=sc.nextLine();// the  string to be checked for the particular letter that has to be replaced 
        String ns=" ";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e'){
                ns+='i';
            }else{
                ns+=s.charAt(i);
            }
        }
      System.out.println("The String after replacement is:"+ns);
      sc.close();
    }
    
}
