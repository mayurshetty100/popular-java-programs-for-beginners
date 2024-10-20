import java.util.Scanner;
class pascal{
    public static int factorial(int x){
      int fact=1;
      for(int i=1;i<=x;i++){
          fact*=i;
      }
      return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in the pascals triangle you want ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(factorial(i)/(factorial(i-j)*factorial(j))+" ");
            } System.out.println();
        }sc.close();
    }
}