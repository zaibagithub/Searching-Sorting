import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		boolean flag = false;
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		for(int i=0;i<arr.length;i++){
		    if(key == arr[i]){
		        System.out.println("Element found at index "+ i);
		        flag = true;
		        break;
		    }
		}
		if(flag == false){
		    System.out.println("Not found");
		}
		
	}
}
