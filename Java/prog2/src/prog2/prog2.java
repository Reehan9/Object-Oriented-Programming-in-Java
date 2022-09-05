package prog2;
import java.util.Scanner;
public class prog2 {
                 static boolean check(int num) {
                	 for(int i = 2 ; i <= num/2 ; i++) {
                		 if(num%i==0)
                			 return false;
                	 }
                	 return true;
                 }
                 public static void main(String args[]) {
                	 Scanner sc = new Scanner(System.in);
                	 System.out.print("Enter number to check if its prime or not :  ");
                	 int n = sc.nextInt();
                	 if(check(n)==true)
                		 System.out.println("Number is prime");
                	 else 
                		 System.out.println("Number is not prime");
                 }
}
