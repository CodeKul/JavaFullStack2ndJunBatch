package multithreading;

public class JoinMethodDemo extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("in method "+Thread.currentThread().getName());
    }
}
class JoinMethodDemoImpl{
    public static void main(String[] args) throws InterruptedException{
        JoinMethodDemo t1 = new JoinMethodDemo();
        JoinMethodDemo t2 = new JoinMethodDemo();
        JoinMethodDemo t3 = new JoinMethodDemo();
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
