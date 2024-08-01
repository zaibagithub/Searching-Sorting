import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]= {1,2,3,4,5,6,7,8,9,10};
	    int search = 5;
	    int low = 0;
	    int high = arr.length-1;
	    boolean flag = false;
	    while(low<=high){
	        int mid = (low+high)/2;
	        if(search == arr[mid]){
	            System.out.println("Element found");
	            flag = true;
	            break;
	        }
	        if(search > arr[mid]){
	            low = mid+1;
	        }
	        if(search < arr[mid]){
	            high = mid-1;
	        }
	    }
	    if(flag == false){
	        System.out.println("Element not found");
	    }
	}
}
