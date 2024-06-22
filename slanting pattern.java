import java.util.Scanner;
class mayur{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the integer");
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         input.close();
    }
}