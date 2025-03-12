package six;

import six.concurrency.HelloRunnable;
import six.concurrency.HelloThread;

public class Demo {
    public static void main(String[] args) {
        HelloRunnable runnable = new HelloRunnable();
//        runnable.run();
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new HelloThread();
        thread1.start();
    }
}
