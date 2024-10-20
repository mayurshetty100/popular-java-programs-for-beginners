import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		int firstArray[] = new int[100]; // First array
        firstArray[0] = 2;
        firstArray[1] = 4;
        firstArray[2] = 6;
        int size1 = 3;

        int secondArray[] = new int[100]; // Second array
        secondArray[0] = 8;
        secondArray[1] = 10;
        secondArray[2] = 12;
        secondArray[3] = 14;
        int size2 = 4;
        int mergedsize=size1+size2;
         
        for(int i=size1;i<mergedsize;i++){
            firstArray[i]=secondArray[i-size1];
        }
        for (int i = 0; i < mergedsize; i++) {
            System.out.print(firstArray[i] + " ");
        }

	}
}
