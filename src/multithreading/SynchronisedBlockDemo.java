package multithreading;

import java.util.Scanner;

class Table1 {
    void printTable(int no) {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(no * i);
            }
        }
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
        System.out.println("Welcome");
    }
}

class ThreadTable1 extends Thread {
    Table1 table;
    int no;

    ThreadTable1(Table1 table, int no) {
        this.table = table;
        this.no = no;
    }

    @Override
    public void run() {
        table.printTable(no);
    }
}

class ThreadTable2 extends Thread {
    Table1 table;
    int no;

    ThreadTable2(Table1 table, int no) {
        this.table = table;
        this.no = no;
    }

    @Override
    public void run() {
        table.printTable(no);
    }
}

public class SynchronisedBlockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any first number: ");
        int no1 = sc.nextInt();
        System.out.println("Enter any second number: ");
        int no2 = sc.nextInt();
        Table1 table = new Table1();
        ThreadTable1 t1 = new ThreadTable1(table, no1);
        ThreadTable2 t2 = new ThreadTable2(table, no2);
        t1.start();
        t2.start();
    }
}

