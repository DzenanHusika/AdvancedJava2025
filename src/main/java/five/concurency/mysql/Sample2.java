    package five.concurency.mysql;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Sample2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 2323, 544, 5);
        int suma = 0;
        for (Integer number : numbers){
            suma = suma + number;
        }
        System.out.println("Suma = " + suma);

        int suma2 = numbers
                .parallelStream()
                .filter(Sample2::isEven)
                .reduce(0, Integer::sum);
        System.out.println("Suma = " + suma2);


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
