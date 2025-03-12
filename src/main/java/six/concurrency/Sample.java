package six.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 45, 45, 2323, 544, 5);
//        int sum = 0;
//        for (Integer number: numbers){
//            if (number % 2 == 0){
//                sum = sum + number;
//            }
//        }
        Predicate<Integer> paranBrojTester = broj -> broj % 2 == 0;
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int sum = numbers
                .stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, (x1, x2)->x1 + x2);
        System.out.println("Suma : " + sum);
    }
}
