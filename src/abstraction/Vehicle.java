package abstraction;

public abstract class Vehicle {
    abstract void start();
    Vehicle(){
        System.out.println("in Vehicle Constructor");
    }
    static void show(){
        System.out.println("in show method");
    }
    final void stop(){
        System.out.println("in stop method");
    }
    void drive(){
        System.out.println("in drive method");
    }
}
class Car extends Vehicle{
    Car(){
        super();
    }
    @Override
    void start() {
        System.out.println("in car start method");
    }
    @Override
    void drive() {
        super.drive();
    }
    static void show(){
        System.out.println("in Car show method");
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
        v1.drive();
        v1.stop();
        Vehicle.show();
    }
}