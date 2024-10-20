import java.util.Scanner;
class arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] array=new  int[r][c];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array elements are as follows");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(array[i][j]+"\t");
            }
        }sc.close();
    }
}