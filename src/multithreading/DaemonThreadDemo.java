package multithreading;


public class DaemonThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("run method");
    }

    public static void main(String[] args) {
        DaemonThreadDemo t1 = new DaemonThreadDemo();
        t1.setDaemon(true);
        t1.start();
        System.out.println(t1.isDaemon());
    }
}
