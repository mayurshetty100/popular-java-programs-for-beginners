import java.util.*;
class recursion {
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        //transfer top n-1 disks from source to helper using destination as a helper   
        towerOfHanoi(n-1,src,dest,helper);

        //transfer nth disk from source to dest
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);

        //transfer n-1 disks from helper to destination using source as a helper
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of disks in the tower: ");
        int n=sc.nextInt();
        towerOfHanoi(n,"A","B","C");
        sc.close();
    } 
}
