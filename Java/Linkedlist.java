import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class Linkedlist{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList<String>l1 = new LinkedList<String>();
        while(true){
            System.out.println();
            System.out.println("1 Add element");
            System.out.println("2 Delete element");
            System.out.println("3 Display elements with lenght less than 5");
            System.out.println("4 Display all elements");
            System.out.println("Press 0 for exit!!!");
            System.out.println("Enter choice");
            int chc = sc.nextInt();
                      sc.nextLine();
            switch(chc){
                case 1: System.out.println("Enter string");
                        String x = sc.nextLine();
                        l1.add(x);
                        break;
                case 2: System.out.println("Deleted string is "+l1.remove(0));
                        break;
                case 3: Iterator <String> s = l1.iterator();
                        if(l1.peek()==null){
                          System.out.println("LIST IS EMPTY");
                          break;
                        }
                        else {
                              while(s.hasNext()){
                            System.out.print(s.next()+" ");
                            }
                        }
                case 4: if(l1.peek()==null){
                        System.out.println("LIST IS EMPTY");
                        break;
                       }
                        Iterator <String> m  = l1.iterator();
                        while(m.hasNext()){
                            if(m.next().length()<=5){
                                System.out.print(m.next()+" ");
                            }
                        }
                case 0 : sc.close();
                         System.exit(0);
                         break;
                default : System.out.println("PRESS 0 FOR EXIT !!!! Invalid entry");
                          break;
            }
        }
    }
}