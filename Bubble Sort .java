import java.util.*;
public class Main
{
    
    static void bubblesort(int arr[], int n){
      for(int i= n-1;  i>= 0; i--){
          int DidSwap = 0;
          for(int j=0; j<n-1;j++){
              if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  DidSwap = 1;
              }
          }
          if(DidSwap == 0){
              break;
          }
      }
      for(int i=0;i<n;i++){
          System.out.print(arr[j+1]+" ");
      }
        
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {12,80,1,99,5};
		int n = arr.length;
		System.out.print("After sorting ");
		bubblesort(arr,n);
	}
}
