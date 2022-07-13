package javapackages.p2;

//import javapackages.p1.A;
//import javapackages.p1.B;
import javapackages.p1.*;
import javapackages.p1.p3.C;
import javapackages.p1.p3.D;


public class PackageImpl {


    public static void main(String[] args) {
        //B b = new B();
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        javapackages.p1.p3.A a1  = new javapackages.p1.p3.A();
    }
}
