package prog1;
import java.util.Scanner;
class pro1 {
	static void  Fib (int  n) {
		int num1 = 0;
		int num2 = 1;
		int counter = 0 ;
		while(counter<n) {
			System.out.print(num1+" ");
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			counter++;
		}
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms upto you wish to find out\n");
        int m = sc.nextInt();
        Fib(m);
	}

}
