package multithreading;

public class ThreadClassDemo extends Thread {

    @Override
    public void run() {
        System.out.println("thread in running state");
    }
}
class ThreadClassImpl{
    public static void main(String[] args) {
        ThreadClassDemo t1 = new ThreadClassDemo();
        t1.start();
    }
}