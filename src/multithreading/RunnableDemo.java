package multithreading;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("t1 is in running state");
    }
}
class RunnableDemoImpl{
    public static void main(String[] args) {
        RunnableDemo t1 = new RunnableDemo();
        Thread thread = new Thread(t1);
       // thread.start();
    }
}