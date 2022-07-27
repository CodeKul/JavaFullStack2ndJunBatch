package exceptionhandling;

public class NestedTryDemo {
    public static void main(String[] args) {
        String msg = null;
        try {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            try {
                System.out.println(10/0);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println(msg.toLowerCase());
            System.out.println("Rest of the code 1");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the code 2");
    }
}
