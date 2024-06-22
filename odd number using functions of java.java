import java.util.Scanner;
class functions{
    public static void oddnumber(int n) {
        for (int i=1;i<=n;i++)
        {
            if (i%2==0)
            {
                continue;
            }
            else
            {
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the input number: ");
        int n=input.nextInt();
        oddnumber(n);
        input.close();
    }
}