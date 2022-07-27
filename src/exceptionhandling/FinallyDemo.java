package exceptionhandling;

public class FinallyDemo {
    public static void main(String[] args) {
        String msg = null;
        try {
            System.out.println(msg.length());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("in finally block");
        }
        System.out.println("Rest of the code");
    }
}
