package multithreading;

import java.util.Scanner;

public class BankTransactions {
    int totalAmount = 0;
    synchronized int withdrawMoney(int amount) throws InsufficientBalance{
        if (amount > totalAmount) {
            throw new InsufficientBalance("Insufficient balance ");
        }else {
            totalAmount = totalAmount - amount;
            return totalAmount;
        }
    }
    synchronized int depositMoney(int amount){
         totalAmount = totalAmount + amount;
         return totalAmount;

    }
}
class UserOne extends Thread{
    int amt;
    BankTransactions bankTransactions;
    UserOne(BankTransactions bankTransactions, int amt){
        this.bankTransactions = bankTransactions;
        this.amt = amt;
    }
    @Override
    public void run() {
        System.out.println("Current "+bankTransactions.depositMoney(amt));
    }
}
class UserTwo extends Thread{
    int amt;
    BankTransactions bankTransactions;
    UserTwo(BankTransactions bankTransactions, int amt){
        this.bankTransactions = bankTransactions;
        this.amt = amt;
    }
    @Override
    public void run() {
        try {
            System.out.println("Remaining "+bankTransactions.withdrawMoney(amt));
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }
    }
}

class TransactionImpl{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter deposit amount");
        int deposit = sc.nextInt();

        BankTransactions bankTransactions = new BankTransactions();
        UserOne t1 = new UserOne(bankTransactions,deposit);
        t1.start();
     //   t1.join();
        System.out.println("Enter withdrawal amount");
        int withdraw = sc.nextInt();
        UserTwo t3 = new UserTwo(bankTransactions,withdraw);
        t3.start();

    }
}