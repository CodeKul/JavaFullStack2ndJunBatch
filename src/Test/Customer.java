package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    private Integer id;
    private String name;
    private Integer mobile;
    private String email;

    public Customer(Integer id, String name, Integer mobile, String email) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }
}

class Transactions{
    private String transactionType;
    private Integer accountNumber;
    private Double amount;
    private Customer customer;
    public Transactions(){

    }

    public Transactions(String transactionType, Integer accountNumber, Double amount, Customer customer) {
        this.transactionType = transactionType;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.customer = customer;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }
}

class CustomerImpl{
    List<Transactions> transactionsList = new ArrayList<>();
    public static void main(String[] args) {
        CustomerImpl customerImpl = new CustomerImpl();
        Customer customer = new Customer(1,"ABC",98566,"abc@gmail.com");
        int ch;
        do {
            System.out.println("1. Add Transaction");
            System.out.println("2. Get Balance");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            ch  = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter transaction Type");
                    String transactionType = scanner.next();
                    System.out.println("Enter account no");
                    Integer accountNo = scanner.nextInt();
                    System.out.println("Enter amount ");
                    Double amount = scanner.nextDouble();
                    customerImpl.addTransaction(transactionType, accountNo, amount, customer);
                    break;
                case 2:
                    System.out.println("Enter account no");
                    Integer acc = scanner.nextInt();
                    customerImpl.getBalance(acc);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("invalid option");
            }
        }while (ch<=3);
    }

    private void addTransaction(String transactionType, Integer accountNo, Double amount, Customer customer) {
        Transactions transaction = new Transactions(transactionType,accountNo,amount,customer);
        transactionsList.add(transaction);
    }

    void getBalance(Integer accountNumber){
        System.out.println("Transaction List "+transactionsList.size());
        for (Transactions t: transactionsList){
            System.out.println("t.getAccountNumber: "+t.getAccountNumber());
            System.out.println("accountNumber : "+accountNumber);
            if (t.getAccountNumber() == accountNumber){
                System.out.println(t.getAccountNumber()+" "+t.getTransactionType()+" "+t.getAmount());
            }
        }
    }

}