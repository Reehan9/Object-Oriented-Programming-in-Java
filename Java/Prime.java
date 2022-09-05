import java.util.Scanner;
class Prime{
    static boolean printprime(int n){
        for(int i = 2 ;i < n ; i++){
            if(n%i==0)
               return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to print the series");
        int n = sc.nextInt();
        sc.close();
        for(int i = 2 ; i < n ; i++){
            if(printprime(i)){
                System.out.print(i+" ");
            }
        }

    }
}