import java.util.Scanner;
class hollowbutterfly{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in the pattern you want");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j=i;j>=1;j--){
                if(j==1||j==i) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j=i;j>=1;j--){
                if(j==1||j==i) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }sc.close();
    }
}