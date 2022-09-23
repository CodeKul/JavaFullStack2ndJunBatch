package multithreading;

class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("In Thread One");
        }
    }

}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("In Thread Two");
        }
    }

}

public class YieldDemo {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();
        t1.yield();
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        Thread.yield();
        for (int i=0;i<5;i++){

            System.out.println("in main thread");
        }

    }
}
