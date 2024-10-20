import java.util.Scanner;
class array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("Enter the number of elements in the array");
        int numbers[]= new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("The elements of the array are");
        for(int i=0;i<size;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}