package thiskeyword;

/**
 * 3. used to invoke current class constructor
 */
public class Bike {
    int bikeNo;
    String bikeName;

    public Bike() {
        this(101, "Activa");
        System.out.println("in Default constructor");
    }

    public Bike(int bikeNo, String bikeName) {
        System.out.println("in parametrised constructor");
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
    }

    void display() {
        System.out.println("Bike Details");
        System.out.println("Bike No: " + bikeNo);
        System.out.println("Bike Name: " + bikeName);
    }
}

class BikeImpl {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.display();
    }
}