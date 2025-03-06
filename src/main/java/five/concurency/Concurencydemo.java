package five.concurency;

public class Concurencydemo {
    public static void main(String[] args) {
        String mainName= Thread.currentThread().getName();
        System.out.println(mainName);
        int number = 23;
        System.out.println(number + " rekao je " + mainName + " Thread");
        //1
        Runnable runnable = new HelloRunnable();
        Thread radnik1 = new Thread(runnable);
        radnik1.setName("Rudar 1");
        radnik1.start();

        //2
        Thread radnik2 = new HelloThread();
        radnik2.setName("Rudar 2");
        radnik2.start();
    }
}
