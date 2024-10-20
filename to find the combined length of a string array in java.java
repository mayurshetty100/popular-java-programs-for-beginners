import java.util.*;
 class combinedlength{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the string array");
        int size=sc.nextInt();//size of the string array
        String[] array=new String[size];
        int totallength=0;
        System.out.println("Enter the elements of the string array:");
        for(int i=0;i<size;i++){
            array[i]=sc.next();
            totallength+=array[i].length();
        }
          System.out.println("The combined length of the given array of strings is : "+totallength);
    }
}
