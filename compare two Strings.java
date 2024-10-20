import java.util.*;// here we can use .Scanner also 
// the .* imports all the utility packages
class comparetwoStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two strings to be compared");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        // comparition using .equals operator
        if(s1.equals(s2)){
            System.out.println("The given two String are equal");
        }else{
            System.out.println("The given two Strings are not equal ");
        }
        // we should not use == to comapre two strings
        // in the below method when you input equal strings you get the answer as they are not same  
        if(s1==s2){
            System.out.println("The two stringsd are same ");

        }else{
            System.out.println("The two strings are not same");
        }
        sc.close();//closes the scanner class

    }
}
