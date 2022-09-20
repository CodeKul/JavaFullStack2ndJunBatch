package multithreading;

public class SleepMethodDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}
class SleepMethodDemo2Impl{
    public static void main(String[] args) {
        SleepMethodDemo2 t1 = new SleepMethodDemo2();
        Thread th1  = new Thread(t1);
        th1.setName("T1");
        th1.start();
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