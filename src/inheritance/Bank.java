package inheritance;

/**
 * Single Inheritance
 */
public class Bank {
    int bankNo;
    String ifsCode;
}

class SbiBank extends Bank {
    String address;
    String branchCode;
    String contactNo;

    void display() {
        System.out.println("Bank No. " + bankNo);
        System.out.println("ifsCode " + ifsCode);
        System.out.println("address " + address);
        System.out.println("branchCode " + branchCode);
        System.out.println("contactNo " + contactNo);
    }
}


class BankImpl {
    public static void main(String[] args) {
        SbiBank sbiBank = new SbiBank();
        sbiBank.address = "Kothrud,Pune";
        sbiBank.branchCode = "SBI10025";
        sbiBank.bankNo = 8555;
        sbiBank.ifsCode = "SBI000015397";
        sbiBank.contactNo = "9865321452";
        sbiBank.display();
    }
}