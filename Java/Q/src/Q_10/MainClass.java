package Q_10;
import Q_10.ISE.ISE_department;
import Q_10.*;
import java.util.Scanner;
public class MainClass {
       public static void main(String args[]) {
    	   int counter = 0;
    	   Scanner sc = new Scanner (System.in);
    	   ISE_department ise = new ISE_department();
           System.out.println("Enter the number faculties you want to register :  ");
           int reg = sc.nextInt();
    	   Faculty f [] = new Faculty [reg];
    	   boolean p1 = false;
    	   boolean p2 = false;
    	   boolean p3 = false;
    	   boolean p4 = false;
    	   boolean p5 = false;
    	   while(true) {
    		   System.out.println("1 TO REGISTER A FACULTY");
    		   System.out.println("2 TO VIEW DETAILS OF A FACULTY");
    		   System.out.println("3 TO VIEW THE NUMBER OF RESEARCH PROJECTS PUBLISHED BY THE FACULTY");
    		   System.out.println("4 TO VIEW THE NUMBER OF DESIGNATIONS");
    		   System.out.println("PRESS 0 FOR EXIT!!!!!!!");
    		   System.out.println("Enter choice");
    		   int ch = sc.nextInt();
    		   sc.nextLine();
    		   switch(ch) {
    		   case 0 : System.exit(0);
    		            break;
    		   case 1:  f[counter] = new Faculty();
    		            ise.readData(f[counter]);
    		            counter++;
    		            break;
    		   case 2 : System.out.println("Enter the name of the faculty to be search");
    		            String sear = sc.nextLine();
    		            for(int i = 0 ; i < counter ; i++) {
    		                   if(sear.equals(f[i].name)) {
    		                	   p1 = true;
    		                	   ise.printData(f[i]);
    		                   }
    		            }
    		                   if(p1==false)
    		                	   System.out.println("ERROR NO SUCH FACULTY EXSISTS!!!");
    		                       break;
    		   case 3: System.out.println("Enter the name of the faculty to be view the number of projects");
	                   String sear1 = sc.nextLine();
	                    for(int i = 0 ; i < counter ; i++) {
	                    if(sear1.equals(f[i].name)) {
	                	   p2 = true;
	                	   ise.number_research_consultancy_projs(f[i]);
	                   }
	            }
	                   if(p2==false)
	                	   System.out.println("ERROR NO SUCH FACULTY EXSISTS!!!");
	                       break;
    		   case 4 : System.out.println("Enter the name of the faculty to view the number of designations");
    		            String sear2 = sc.nextLine();
    		            for(int i = 0 ; i < reg ; i++) {
    		            	if(f[i].name.equals(sear2)) {
    		            		p3 = true;
    		            		ise.print_number_designations(f[i]);
    		              }
    		            }
    		            	if(p3==false)
    		               System.out.println("ERROR NO SUCH FACULTY EXSISTS!!!");
 	                       break;
 	            default : System.out.println("Invalid choice");
 	                       break;
    		            		
    		           }
    		        }
    	          }
                }
              
