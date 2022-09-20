package multithreading;

public class SleepMethodDemo extends Thread{
    @Override
    public void run() {
        System.out.println("in run method");
        for (int i = 1;i <=5;i++){
            try {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class SleepImpl{
    public static void main(String[] args) {
        SleepMethodDemo t1 = new SleepMethodDemo();
        t1.setName("T1");
        SleepMethodDemo t2 = new SleepMethodDemo();
        t2.setName("T2");
        t1.start();
        t2.start();

      //  t1.start(); // IllegalThreadStateException

    }
}