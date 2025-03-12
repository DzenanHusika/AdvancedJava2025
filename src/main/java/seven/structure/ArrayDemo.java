package seven.structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");
        names.add("Smith");
        names.add("Brown");
        names.remove("John");
        names.remove("Jane");
        for (String name : names){
            System.out.println(name);
        }
        System.out.println();
        System.out.println("-----------------------");

        List<String> names2 = Arrays.asList("John", "Jane", "Bob", "Mary", "Jack", "Smith", "Brown");
        names2.remove("John");
        names2.remove("Jane");
        for (String name : names2){
            System.out.println(name);
        }
    }
}
