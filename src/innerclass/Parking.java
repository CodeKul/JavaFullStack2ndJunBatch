package innerclass;

public abstract class Parking {
    void allowVehicle(String vehicleType){
        System.out.println("You can park your vehicle");
    }
}
class ParkingImpl{
    public static void main(String[] args) {
        Parking parking = new Parking(){
            @Override
            void allowVehicle(String vehicleType) {
                System.out.println(vehicleType.equals("Bike")?
                        "Two wheeler are not allowed":"You can park your car");
            }
        };
        parking.allowVehicle("Bike");
    }
}