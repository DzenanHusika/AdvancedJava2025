package five.concurency;

public class Counter {
    private int number = 23;

    public synchronized void increment(){
        number++;
    }
    private synchronized void decrement(){
        number--;
    }
}
