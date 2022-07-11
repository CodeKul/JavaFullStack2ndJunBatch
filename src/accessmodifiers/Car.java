package accessmodifiers;

import accessmodifiers.defaultex.Bike;

/**
 * private example
 */
public class Car {
    private String segment;
    private String variant;
    private Car(){}
    public Car(String segment, String variant) {
        this.segment = segment;
        this.variant = variant;
    }

    private void show(){
        System.out.println("in show method");
    }
}

class CarImpl extends Bike {
    public static void main(String[] args) {
        CarImpl car = new CarImpl();
        car.model = "RS15";
        // bike.name = ""; //default access modifier error

        //compile time error
     //   Car car = new Car();
       // car.show();
    }
}