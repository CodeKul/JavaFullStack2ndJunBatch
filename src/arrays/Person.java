package arrays;

import java.util.Scanner;

public class Person {
    private int pid;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String address;

    public Person(int pid, String firstName, String lastName, String mobileNo, String address) {
        this.pid = pid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getPid() {
        return pid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getAddress() {
        return address;
    }
}

class PersonImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = scanner.nextInt();
        Person person[] = new Person[size];
        System.out.println("Enter Person Details");
        for (int i=0;i<size;i++){
            System.out.println("Enter Id");
            int id = scanner.nextInt();
            System.out.println("Enter first name");
            String fname = scanner.next();
            System.out.println("Enter Last name");
            String lname = scanner.next();
            System.out.println("Enter mobile no");
            String mobile = scanner.next();
            System.out.println("Enter Address");
            String address = scanner.next();
            person[i] = new Person(id,fname,lname,mobile,address);
        }

        for (Person p:person){
            System.out.println("Id: "+p.getPid());
            System.out.println("First Name: "+p.getFirstName());
            System.out.println("Last Name: "+p.getLastName());
            System.out.println("Mobile No: "+p.getMobileNo());
            System.out.println("Address: "+p.getAddress());
        }

    }
}