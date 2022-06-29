package superkeyword;

/**
 * 3. used to invoke parent class constructor
 */
public class Vehicle {
    int vehicleCode;
    String vehicleType;
    public Vehicle(int vehicleCode, String vehicleType) {
        this.vehicleCode = vehicleCode;
        this.vehicleType = vehicleType;
    }
}
class Bike extends Vehicle{
    String bikeName;
    String brand;
    String model;

    public Bike(int vehicleCode, String vehicleType, String bikeName, String brand, String model) {
        super(vehicleCode, vehicleType);
        this.bikeName = bikeName;
        this.brand = brand;
        this.model = model;
    }
    void display(){
        System.out.println("Vehicle Code:"+super.vehicleCode);
        System.out.println("Vehicle Type:"+super.vehicleType);
        System.out.println("Bike Name:"+bikeName);
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Bike bike = new Bike(101,"Bike","Splender","Hero","125CC");
        bike.display();
    }
}