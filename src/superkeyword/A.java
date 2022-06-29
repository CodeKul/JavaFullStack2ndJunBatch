package superkeyword;

/**
 * 1. used to refer immediate parent class instance variable
 */
public class A {
    int a =10;
}
class B extends A{
    int a = 20;
    void display(int a){
        System.out.println(a); //30
        System.out.println(this.a); //20
        System.out.println(super.a); //10
    }
}
class AImpl{
    public static void main(String[] args) {
        B b = new B();
        b.display(30);
    }
}
