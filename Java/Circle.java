import java.lang.Math;
import java.util.Scanner;
class cir{
  int radius ;
  cir(int radius){
      this.radius = radius;
  }
   double compute_area(){
       return Math.PI*Math.pow(radius, 2);
   }
}
class Sector extends cir{
    int angle; // calulated in radians
    Sector(int radius , int angle){
        super(radius);
        this.angle = angle;
    }
    double compute_area(double radius){
        return Math.PI*Math.pow(radius, 2);
    }
}





public class Circle{

}