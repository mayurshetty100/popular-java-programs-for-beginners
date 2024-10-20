/* This is a program to count all the possible paths from 
0,0 to m,n of a maze or matrix */
import java.util.Scanner;
class countpathmaze{
    public static int countPaths(int i,int j,int m,int n){
        if(i==m-1 || j==n-1){
            return 1;
        }
        return countPaths(i+1,j,m,n)+countPaths(i,j+1,m,n);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows and columns in the maze");
    int m=sc.nextInt();//number of rows 
    int n=sc.nextInt();//number of columns 
    System.out.println("The total number of paths available are "+
    countPaths(0,0,m,n));
    sc.close();
    }
    
}
