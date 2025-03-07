    package five.concurency.mysql;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

    public class Sample3 {

        final static long MAX = 990000000;

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 2323, 544, 5);
            long currentTime = System.currentTimeMillis();
            int sum = numbers
                    .stream()
                    .parallel()
                    .map(Sample3::compute)
                    .reduce(0, Integer::sum);
            ForkJoinPool forkJoinPool = new ForkJoinPool(1000);
            forkJoinPool.execute(()->{
               int result = numbers
                       .stream()
                       .map(Sample3::print)
                       .map(Sample3::compute)
                       .reduce(0, Integer::sum);
                System.out.println("Sum = " + result);
            });
            forkJoinPool.shutdown();
            long period = System.currentTimeMillis() - currentTime;
//            System.out.println("Sum: " + sum);
            System.out.println("Period: " + period/1000);
        }

        static int print(int number){
            System.out.println("Thread name = " + Thread.currentThread().getName());
            return number;
        }

        static int compute(int number){
            Thread thread = Thread.currentThread();
            System.out.println("Thread: " + thread.getName() + " izvršava compute");
            double result = 0;
            for (int i = 0; i < MAX; i++){
                for (int j = 0; j < MAX; j++){
                    result = Math.sqrt(i*j);
                }
            }
            int finalResult = (int) (result + number);
            return finalResult;
        }

        static boolean isOdd(int number){
            return number % 2 != 0;
        }
        static boolean isEven(int number){
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + " izvršava funkciju isEven");
            return number % 2 == 0;
        }
    }
