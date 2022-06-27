package oops;

import java.util.Scanner;

public class Student {
    int rno;
    String name;
    String address;
    float age;

    void insertData(int r, String nm, String addr, float a) {
        rno = r;
        name = nm;
        address = addr;
        age = a;
    }

    void display() {
        System.out.println("***********Student Details*********");
        System.out.println("Roll no: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

class StudentImpl {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rno = 1;
        s1.name = "Amit";
        s1.address = "Kothrud,Pune";
        s1.age = 4.5f;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rno");
        int rno = sc.nextInt();
        System.out.println("Enter name");
        String nm = sc.next();
        System.out.println("Enter address");
        String addr = sc.next();
        System.out.println("Enter age");
        float age = sc.nextFloat();

        Student s2 = new Student();
        s2.insertData(rno, nm, addr, age);
        s2.display();

        Student s3 = new Student();
        s3.insertData(3, "Jorge", "NY", 45);
        s3.display();

    }
}