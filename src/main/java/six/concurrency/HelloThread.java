package six.concurrency;

public class HelloThread extends Thread{
    public void run(){
        System.out.println("Hello World kaze Thread " + Thread.currentThread().getName());
    }
}
