import java.util.Scanner;
class functions 
{
    public static void voter(int age){
        if (age>=18){
            System.out.println("The person is eligible to vote ");
        }
        else
        {
            System.out.println("the person is not eligible to vote ");
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the age of the person ");
        int age = input.nextInt();
        voter(age);
        input.close();
    }
}