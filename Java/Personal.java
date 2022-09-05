import java.util.Scanner;
public class Personal{
    Scanner sc = new Scanner(System.in);
    int age , yop , nol , la ;
    double salary ;
    String name , q; 
          public static void get_input(Personal p){
             Scanner sc = new Scanner(System.in);
              System.out.println("Enter your name");
               p.name = sc.nextLine();
              System.out.println("Enter the age of the person");
               p.age = sc.nextInt();
                        sc.nextLine();
              System.out.println("Enter your qualification");
              p.q = sc.nextLine();
              System.out.println("Enter your salary");
              p.salary = sc.nextDouble();
              System.out.println("Enter years of experience");
              p.yop = sc.nextInt();
              System.out.println("Enter the number of loans taken");
              p. nol = sc.nextInt();
              System.out.println("Enter the loan amount");
              p.la = sc.nextInt();
              sc.close();
          } 
        public void isEligible(){
            if(nol>2 && la<10000){
                System.out.println("Employee is eligible for loan");
            }
            else {
                System.out.println("Employee not eligible for loan");
            }
            System.out.println();
        }
        public void taxPay(){
            if(salary>100000){
                System.out.println("Employee needs to pay tax of "+(salary*0.1));
            }
            else {
                System.out.println("Employee is exempted from payment");
            }
            System.out.println();
        }
        public void isEligiblePromotion(){
            if(yop>10 && age>30){
                System.out.println("Employee is eligible for promotion");
            }
            else {
                System.out.println("Not eligible for promotion");
            }
            System.out.println();
        }
        public void Display(){
            System.out.println();
            System.out.println("NAME : "+name);
            System.out.println("AGE "+age);
            System.out.println("QUALIFICATION "+q);
            System.out.println("SALARY : "+salary);
            System.out.println("YEARS OF EXPERIENCE "+yop);
            System.out.println("NUMBER OF LOANS "+nol);
            System.out.println("LOAN AMOUNT APPLIED "+la);
        }
         public static void main(String args[]){
             System.out.println("Enter the number of the employees");
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             Personal p [] = new Personal [n];
             for(int i = 0 ; i < n ; i++){
                 p[i] =  new Personal(); 
                 get_input(p[i]);
                 p[i].isEligible();
                 p[i].taxPay();
                 p[i].isEligiblePromotion();
                 p[i].Display();
             }
                    sc.close();
         }
}