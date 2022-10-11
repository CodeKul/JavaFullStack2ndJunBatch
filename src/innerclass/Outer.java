package innerclass;

/**
 * 1. Member inner class
 */
public class Outer {
    int i = 10;
    class Inner{
        int j = 20;
        void show(){
            System.out.println("in show method");
        }
    }
}
class OuterImp{
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.i);
        Outer.Inner inner = outer.new Inner();
        System.out.println(inner.j);
        inner.show();
    }
}