package encapsulation;

import java.util.Scanner;

public class User {
    private String name;
    private int id;
    private Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
class Account{
    private int accountNo;
    private double totalAmount;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

interface Bank{
    String withdrawMoney(Account account,double withdrawAmount);
    String depositMoney(Account account,double amount);
    void userDetails(User user);
}
class BankTransaction implements Bank{
    @Override
    public String withdrawMoney(Account account ,double withdrawAmount) {
        if (withdrawAmount> 0 && account.getTotalAmount() > withdrawAmount ){
            account.setTotalAmount(account.getTotalAmount() - withdrawAmount);
            return "Current Balance "+account.getTotalAmount();
        }else {
           return  "In Sufficient Balance";
        }
    }

    @Override
    public String depositMoney(Account account,double amount) {
        if (amount > 0) {
            account.setTotalAmount(account.getTotalAmount() + amount);
            return "Amount after deposit Rs."+account.getTotalAmount();
        }
        else
            return "Invalid amount";
    }

    @Override
    public void userDetails(User user) {

    }
}

class UserImpl{
    public static void main(String[] args) {
        int ch;
        Account account = new Account();
        User user = new User();
        do {
            System.out.println("1.Fill User Details");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Deposit Money");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            Bank bank = new BankTransaction();
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    user.setId(1);
                    user.setName("Pallavi Garewal");
                    account.setAccountNo(34526387);
                    account.setTotalAmount(10000);
                    user.setAccount(account);
                    bank.userDetails(user);
                    break;
                case 2:
                    System.out.println("Enter withdraw amount");
                    double withdrawAmount = sc.nextDouble();
                    System.out.println(bank.withdrawMoney(account, withdrawAmount));
                    break;
                case 3:
                    System.out.println("Enter amount for deposit");
                    double depositAmount = sc.nextDouble();
                    System.out.println(bank.depositMoney(account, depositAmount));
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while (ch<4);
    }
}

