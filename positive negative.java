import java.util.Scanner;
class posneg{
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of entries that will be given ");
        int m= input.nextInt();
        System.out.println("enter the user entries");
        for (int i = 0;i<m; i++) {
            int n = input.nextInt();
            if (n > 0) {
                a++;
            } else if (n < 0) {
                b++;
            } else {
                c++;
            }
        }
            System.out.println("The  number of positive numbers is = " + a);
            System.out.println("The number of negative entries is = " + b);
            System.out.println("The number of zeroes is = " + c);

    }
}