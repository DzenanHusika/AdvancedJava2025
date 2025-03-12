package six.concurrency;

public class HelloRunnable implements Runnable{
    public void run(){
        System.out.println("Hllo World Thread " + Thread.currentThread().getName());
    }
}
