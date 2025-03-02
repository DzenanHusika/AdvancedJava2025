package two.db.dao;

public class SwapMain {
    public static void main(String[] args) {
        int number1 = 23;
        int number2 = 42;
        System.out.println("Number 1: " + number1 + " Number 2: " + number2);
        swap(number1, number2);
        System.out.println("Number 1: " + number1 + " Number 2: " + number2);

        IntNumber intNumber1 = new IntNumber(23);
        IntNumber intNumber2 = new IntNumber(42);
        System.out.println("Number 1: " + intNumber1 + " Number 2: " + intNumber2);
        swap(intNumber1, intNumber2);
        System.out.println("Number 1: " + intNumber1 + " Number 2: " + intNumber2);
    }

    static void swap(int number1, int number2){
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Number 1: " + number1 + " Number 2: " + number2);
    }
    static void swap(IntNumber number1, IntNumber number2){
        IntNumber temp = new IntNumber(number1.getValue());
        number1.setValue(number2.getValue());
        number2.setValue(temp.getValue());
        System.out.println("Function -> Number 1: " + number1 + " Number 2: " + number2);
    }
}
