import java.util.Scanner;
class Recursion4{
    public static boolean isStrictlyIncreasing(int[] arr){
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();//size of the array input
        int[] arr=new int[n];//array declaration 
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(isStrictlyIncreasing(arr)){
            System.out.println("The array is strictly increasing");
        }else{
            System.out.println("The array is not strictly increasing");
        }
        sc.close();
    }
}
