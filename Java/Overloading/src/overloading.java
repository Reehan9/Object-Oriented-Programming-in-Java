import java.util.*;
    class OverloadDemo{
    	        void multiply(int a , int b) {
    	        	System.out.println("These numbers are passed "+a+" "+b);
    	        }
    	       void mulitply (double a) {
    	    	   System.out.println("integer has been converted to  double "+a+" ");
    	       }
    	      void mulitply () {
    	    	  System.out.println("Void");
    	      }
    }     
          class overloading{
        	  public static void main(String args[]) {
        		  OverloadDemo obj = new OverloadDemo();
        		  obj.mulitply();
        		  obj.multiply(4 ,6);
        		  int a = 10;
        		  obj.mulitply(a);
        	  }
          }