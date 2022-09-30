package multithreading;

class Counter{
  synchronized static void printTable(int no){
        for (int i=1;i<=10;i++){
            System.out.println(no*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class CounterOneThread extends Thread{
    Counter counter;
    CounterOneThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        Counter.printTable(5);
    }
}

class CounterTwoThread extends Thread{
    Counter counter;
    CounterTwoThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        Counter.printTable(7);
    }
}
public class StaticSynchronisationDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterOneThread t1 = new CounterOneThread(counter);
        CounterTwoThread t2 = new CounterTwoThread(counter);
        CounterOneThread t3 = new CounterOneThread(counter);
        CounterTwoThread t4 = new CounterTwoThread(counter);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
