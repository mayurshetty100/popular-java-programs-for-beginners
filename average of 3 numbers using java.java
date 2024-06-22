import java.util.Scanner;
class functions{
    public static float average(int a,int b,int c)
    {
        int sum=a+b+c;
        float average=sum/3;
        return average;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the 3 numbers ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        float avg=average(a,b,c);
        System.out.println("the average of the two numbers is "+avg);
    input.close();
    }}  