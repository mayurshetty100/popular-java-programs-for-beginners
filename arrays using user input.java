import java.util.Scanner;
class arrays{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of the subjects :");
        int n=input.nextInt();
        int marks[]=new int[n];
        System.out.println("enter the marks of each subject of the array:");
        for(int i=0;i<n;i++)
        {
            marks[i]=input.nextInt();
        }
        System.out.println("The marks of the respective subjects are as follows");
        for(int i=0;i<n;i++){
            System.out.println("The marks of the subject "+(i+1)+" is "+marks[i]);
        }input.close();
    }
}