public class selectionSort{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//prints the elements of the array to the console
        }
    }
 public static void main(String[] args) {
    int arr[]={7,8,1,3,2};
    
    //selection sort
    for(int i=0;i<arr.length-1;i++){
        int smallest=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[smallest]){
                smallest=j;
            }
        }
        //swap
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
        }
        printArray(arr);
    }
 }    
 /* this sorting method fixes the first element as the smallest then it traverses 
 throughout the array and checks if any element is smaller than the arr[smallest] 
 if it is found smaller then the two elements are swapped .abstract here in the 
 first for loop we have traversed till <length-1 because the last element will automatically be 
 sorted while comparing.the time complexity of this sorting method is O(N^2);
  */

