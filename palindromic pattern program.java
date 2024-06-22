import java.util.Scanner;
class palindromicpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the integer ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            input.close();
        }
    }
}