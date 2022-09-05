import java.util.Scanner;
class Bubble {
    public static void  sort (int arr[]){
        for(int i = 0 ; i < arr.length -1 ; i++){
            for(int j = 0 ; j < arr.length -i -1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void Display(int arr[]){
        for(int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

   public static void main(String args[]){
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the size of the array");
       int s = sc.nextInt();
       int arr [] = new int [s];
       System.out.println("Enter the elements");
       for(int i = 0 ; i<s ; i++){
           arr[i] = sc.nextInt();
       }
       System.out.println();
       System.out.println("Before bubble sorting");
       Display(arr);
       sort(arr);
       System.out.println("After Sorting");
       Display(arr);
       sc.close();
   }



}