import java.util.Scanner;
abstract class Vehicle {
    int year_of_manufacture;
    abstract int getData(int model);
    abstract void putData();
    Vehicle(int year){
        year_of_manufacture = year;
    }
}
class TwoWheeler extends Vehicle {

    TwoWheeler(int year) {
        super(year);
    }
    int model;
    int getData(int model){
        this.model = model;
        return model;
    }
    void putData(){
        System.out.println("Year of Manufacture "+year_of_manufacture);
        System.out.println("Model Number "+this.getData(model));
    }
}
final class FourWheeler extends Vehicle { // final used to prevent overriding and inheritance
    FourWheeler(int year) {
        super(year);
    }
    int model;
    int getData(int model){
        this.model = model;
        return model;
    }
    void putData(){
        System.out.println("Year of Manufacture "+year_of_manufacture);
        System.out.println("Model Number "+this.getData(model));
    }
}
class MyTwoWheeler extends TwoWheeler{
    MyTwoWheeler(int year) {
        super(year);
    }
    int getData(int model){
        super.getData(model);
        return model;
    }
}

class Question9{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the manufacture of the two wheeler ");
        int yr = s.nextInt();
        MyTwoWheeler mtw = new MyTwoWheeler(yr);
        System.out.println("Enter the model number of your twi wheeler");
        int mtwm = s.nextInt();
        mtw.getData(mtwm);
        System.out.println("Displaying details");
        mtw.putData();
        System.out.println("\n");
        System.out.println("Enter the manufacture of the four wheeler ");
        int yr1 = s.nextInt();
        FourWheeler car = new FourWheeler(yr1);
        System.out.println("Enter model number of car");
        int carm = s.nextInt();
        car.getData(carm);
        System.out.println("Displaying details");
        car.putData();
        s.close();
    }
}