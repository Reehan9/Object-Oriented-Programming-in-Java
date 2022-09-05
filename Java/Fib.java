import java.util.*;
public class Fib {
    public static void fib(int n){
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        while(counter<n){
            System.out.print(num1+" ");
            int num3 = num1 + num2;
            num2 = num1;
            num1 = num3;
            counter++;
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        fib(n);
        sc.close();
        
    }
}
