package five.concurency.mysql;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 2323, 544, 5);
        int suma = 0;
        for (Integer number : numbers){
            suma = suma + number;
        }
        System.out.println("Suma = " + suma);
        BinaryOperator<Integer> operacija = (n1, n2)-> n1 + n2;
        BinaryOperator<Integer> operacija2 = (n1, n2)-> Integer.sum(n1, n2);
        BinaryOperator<Integer> operacija3 = Integer::sum;
//        int result = operacija.apply(23, 24);
//        int result2 = operacija.apply(234, 343);
        Predicate<Integer> testNeparniBroj = Sample::isOdd;
        Predicate<Integer> testParniBroj = Sample::isEven;
        int sumaFunctional = numbers
                .stream()
                .filter(testNeparniBroj)
                .reduce(0,operacija);
        System.out.println("Suma = " + sumaFunctional);


    }

    static boolean isOdd(int number){
        return number % 2 != 0;
    }
    static boolean isEven(int number){
        return number % 2 == 0;
    }
}
