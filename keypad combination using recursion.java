import java.util.Scanner;
class recursion9{
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs"};
    public static void printKeypadcombination(String number,int idx,String res){
        if(idx==number.length()){
            System.out.println(res);
            return;
        }
        for(int i=0;i<keypad[number.charAt(idx)-'0'].length();i++){
            char curr=keypad[number.charAt(idx)-'0'].charAt(i);
            printKeypadcombination(number,idx+1,res+curr); 
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the keypad entry you want: ");
        String number=sc.next();//input a string combination
        System.out.println("The entered keypad combination is:");
        printKeypadcombination(number,0,"");
        sc.close();//closing the scanner class
    }
}