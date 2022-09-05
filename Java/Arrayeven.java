import java.util.*;
public class Arrayeven {
    public static void main(String args[]) {
       int arr[] =new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] even = new int[5];
        int odd[] = new int[5];
        for(int i = 0 , j = 0 , k = 0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                 even[j] = arr[i];
                 j++;
            }
                 else {
                odd[k] = arr[i];
                k++;
        }
    }
        for(int o =  0 ; o < even.length ; o++){
             System.out.println(even[o]+" ");
        }
    }
}

