package thiskeyword;

/**
 * 2. used to invoke current class method
 */
public class A {
    int n;
    void m(A a){
        this.p();
        System.out.println("call current class method m");
    }
    void n(){
        System.out.println("n method gets called");
        m(this);

        System.out.println("exit from n");
    }
    void p(){
        System.out.println("P method");
    }
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}

