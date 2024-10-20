public class insertionSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//prints all the elements of the array into the
            //console with spaces in between all the elements 
        }
    }
    public static void main(String[] args) {
     int arr[]={7,8,1,3,2};// declaration and initialization of the array
     
     //Insertion sort 
     for(int i=1;i<arr.length;i++){
        int current=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>current){
            //keep swapping
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=current;
     }
     printArray(arr);
    }
}
/* in this method you fix arr[i] as curent and compare it with
 * all its previous elements .
 * if the previous elements are found larger then swapping takes place 
 * finally the array gets sorted 
 * remember that the for loop starts with i=1;
 */
