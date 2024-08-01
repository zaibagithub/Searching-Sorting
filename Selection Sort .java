import java.util.*;
public class Main
{
    
    static void selectionsort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1 ; j<n;j++){
                if(arr[j]<arr[min])
                min = j;
            }
            int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
        }   
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
        }
         System.out.println();
        
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {12,80,1,99,5};
		int n = arr.length;
		System.out.print("After sorting ");
		selectionsort(arr,n);
	}
}
