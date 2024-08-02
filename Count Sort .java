// Unlike other sorting techniques, Count Sort is a Non-Comparison sorting algorithm
// This sorting algorithm holds good for small numbers
// Step 1: Find the largest number from the given array
// Step 2: Create a new array of size (Largest no. from the given array + 1)
// Step 3: Create a frequency array. INDEX NUMBER = NO.OF TIMES NUMBERS OCCURED

import java.util.*;
public class Main
{   public static void countSort(int[] arr){
    
    if(arr == null || arr.length <= 1){   // Base Condition
        return;
    }
    int largest = arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    int[] countArray = new int[largest+1];
    for(int i=0;i<arr.length;i++){
        countArray[arr[i]]++;
    }
    int index =0;
    for(int i=0;i<= largest;i++){
        while(countArray[i]>0){
            arr[index]=i;
            index++;
            countArray[i]--;
        }
    }
}
	public static void main(String[] args) {
		int array[] = {3,7,5,9,11,2,3,1,2,5,6};
		countSort(array);
		System.out.println(Arrays.toString(array));
	}
}
