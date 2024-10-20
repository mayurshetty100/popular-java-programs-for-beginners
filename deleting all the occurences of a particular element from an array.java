
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 int[] arr=new int[N];
	 for(int i=0;i<N;i++){
	     arr[i]=sc.nextInt();
	 }
	 int X=sc.nextInt();
	 for(int i=0;i<N;i++){
	     if(arr[i]==X){
	         for(int j=i;j<N-1;j++){
	             arr[j]=arr[j+1];
	         }
	         N--;
	         i--;// it is added so that the very next element does not get skipped by the loop after shifting the positions
	     }
	     else {
	         continue;
	     }
	 }
	 for(int i=0;i<N;i++){
	     System.out.print(arr[i]+" ");
	 }
	}
}
