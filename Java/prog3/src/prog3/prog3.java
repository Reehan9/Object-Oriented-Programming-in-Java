package prog3;
import java.util.Scanner;
public class prog3 {
   static void sort(int arr[]) {
	   int l = arr.length;
	   for(int i = 0 ; i < l - 1 ; i++) {
		   for(int j = 0 ; j < l - i - 1 ; j++) {
			   if(arr[j]>arr[j+1]) {
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = temp;
			   }
		   }
	   }
   }
       static void print(int arr[]) {
    	   for(int i = 0 ; i < arr.length ; i++) {
    		   System.out.print(arr[i] +" ");
    	   }
    	   System.out.println();
       }
      public static void main(String args[]) {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter the size of the array");
    	  int m = sc.nextInt();
    	  int arr[] = new int [m];
    	  System.out.println("Enter the numbers :  ");
    	  for(int i = 0 ; i < m ; i++) {
    		 arr[i] = sc.nextInt();
    	  }
    	 System.out.println("Before Sorting");
    	 print(arr);
    	 System.out.println("After Sorting");
    	 sort(arr);
    	 print(arr);
      }
	
}
