import java.util.Scanner;
class CodeChef{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();// takes integer N as the input from the user.
        int[] a=new int[100];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();// N space separated integers.
        } 
        int X=sc.nextInt();
        for(int i=N;i>=0;i--){
            if(i==0){
                a[i+1]=a[i];
                a[i]=X;
                 N++;
            }else if (i==N)
            { a[i+1]=X;
              N++;
                }else{
               a[i+1]=a[i];
            }
        }
            for(int i=0;i<N;i++){
                System.out.print(a[i]+" ");
            }
            }
        }
