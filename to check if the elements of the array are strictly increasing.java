import java.util.Scanner;
class arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] numbers=new int[size];
        boolean isascending=true;
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            if(numbers[i]>numbers[i+1]){
                isascending=false;
            }else{continue;}
        }
        if(isascending==true){
            System.out.println("The array  is in ascending order");
        }else{
            System.out.println("The array is not in ascending order");
        }
     sc.close();
    }
}