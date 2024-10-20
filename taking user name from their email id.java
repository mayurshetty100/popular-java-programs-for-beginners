import java.util.Scanner;
 class username{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the email id");   
     String email=sc.next();// taking email address input from the user
     String username="";
     int i=-1;
     while(i++<email.length()){
        if(email.charAt(i)=='@'){
            break;
        }else{
            username+=email.charAt(i);
        }
     }
     System.out.println("The username is : "+username);
     sc.close();
    }
}
