package exceptionhandling;

public class UserExceptionTest {
    public static void main(String[] args) {
        try {
            throw new InsufficientBalanceException("Insufficient Balance");
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}
