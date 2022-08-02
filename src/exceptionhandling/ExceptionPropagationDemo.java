package exceptionhandling;

public class ExceptionPropagationDemo {
    void m1(){
        int result = 10/0;
       // throw new UserDefinedException("User Defined Exception");
    }

    void m2(){
        m1();
    }

    void m3(){
        try {
            m2();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining code");
    }

    public static void main(String[] args) {
        ExceptionPropagationDemo demo = new ExceptionPropagationDemo();
        demo.m3();
    }
}
