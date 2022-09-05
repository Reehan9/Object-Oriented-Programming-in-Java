import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {
  public static void main(String args[])  {
    Scanner sc = new Scanner(System.in); 
     ArrayList<String>Q = new ArrayList<String>();
     
     while(true){
         System.out.println("\n1 Enqueue");
         System.out.println("2 Dequeue");
         System.out.println("3 Display");
         System.out.println("4 Print all elements less than 5");
         System.out.println("0 PRESS 0 for exit");
         System.out.println("Enter choice");
         int chc = sc.nextInt();
                   sc.nextLine();
         switch (chc) {
             case 1: System.out.println("Enter String to enqueued");
                     String x = sc.nextLine();
                     Q.add(Q.size() , x);
                     break;
             case 2 : if(Q.isEmpty()){
                    System.out.println("Queue is empty");
                    break;
             }    else {
                     System.out.println("Element dequeued is "+Q.remove(0));
                     break;
                    }
             case 3 : if(Q.isEmpty()){
                      System.out.println("Queue is empty");
                      break;
             }
                  else {
                      for(int i = 0 ; i < Q.size() ; i++){
                          System.out.print(Q.get(i) + " ");
                      }
                      break;
                  }
             case 4 : boolean check = true;
                      for(int i = 0 ; i < Q.size(); i++){
                          if(Q.get(i).length()<=5){
                              check = false;
                          System.out.println(Q.get(0)+" ");
                      }
                    }
                    if(check)
                       System.out.println("No string exsists");
                       break;
            case 0 : sc.close();
                     System.exit(0);
                     break;
            default : System.out.println("INVALID ENTRY PRESS 0 FOR EXIT !!!!!!");
                      break;
        }
     }
  }
}
