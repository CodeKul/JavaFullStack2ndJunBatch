package exceptionhandling;

public class Test1 {
    public static void main(String[] args) {
        String n = null;
        try {
            System.out.println("I am in try block");
            System.out.println(n.length());
        }catch (Exception e){
            try {
                System.out.println(10/0);
            }catch (ArithmeticException e1){
                System.out.println(e1.getMessage());
            }
        }
        finally {
            String num = "121A";
            try {
                System.out.println(Integer.parseInt(num));
            }catch (NumberFormatException e2){
                System.out.println("Given string contains alphabets");
            }
        }
        System.out.println("Rest of the code");
    }
}
