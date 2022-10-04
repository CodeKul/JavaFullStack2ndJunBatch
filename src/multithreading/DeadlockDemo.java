package multithreading;

public class DeadlockDemo {
    public static void main(String[] args) {
        String str1 = "Pune";
        String str2 = "Mumbai";

        new Thread(){
            @Override
            public void run() {
                synchronized (str1){
                    try {
                        Thread.sleep(500l);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (str2){
                        System.out.println("STR2"+str2);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                synchronized (str2){
                    try {
                        Thread.sleep(500l);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (str1){
                        System.out.println("STR1"+str1);
                    }
                }
            }
        }.start();
    }
}
