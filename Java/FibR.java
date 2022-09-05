import java.util.*;
public class FibR {
   static int Fib (int n){
            if(n==0 || n==1)
              return n;
    return (Fib(n-1)+Fib(n-2));
   } 
   public static void main(String args[]){
     System.out.println("Enter number");
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
    for(int i = 0 ; i < num ; i++){
        System.out.print(Fib(i)+" ");
    }
    sc.close();
   }
}
