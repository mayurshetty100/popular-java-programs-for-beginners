public class bubbleSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//prints the elements of the array to the console
        }
    }
    public static void main(String[] args) {
    int arr[]={7,8,1,3,2};// array declaration+initialization

    //bubble sort
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printArray(arr);
    }
    
}

/* in this method we traverse the array and
 * replace the bigger element with the smaller element by comparing 
 * each element with its next element in the array and after every step we 
 * traverse one step less as the last position will be continously sorted 
 * in this process 
 * the time complexity of this process is O(N^2) where N is the number of elements in the array
 */
