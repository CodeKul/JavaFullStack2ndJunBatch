package interfacedemo;

public interface Bank {
    double getRateOfInterest();
    float N = 10;
}
interface BankOperations extends Bank{
    double calculateInterest();
}
class HDFC implements BankOperations{

    @Override
    public double getRateOfInterest() {
        return 10;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}

class BankImpl{
    public static void main(String[] args) {
        BankOperations bank;//reference variable
        bank = new HDFC();
        bank.getRateOfInterest();
        bank.calculateInterest();
    }
}