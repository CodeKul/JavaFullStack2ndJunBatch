package interfacedemo;

import java.math.BigInteger;
import java.util.Random;

//marker interface
public interface Parking {
}

class TwoWheeler implements Parking{
    void show(){
        System.out.println("Allow");
    }
}
class FourWheeler{
    void show(){
        System.out.println("Don't Allow");
    }
}
class ParkingImpl{
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        FourWheeler fourWheeler = new FourWheeler();
        if (fourWheeler instanceof Parking){
            fourWheeler.show();
        }
        else {
            twoWheeler.show();
        }
    }
}