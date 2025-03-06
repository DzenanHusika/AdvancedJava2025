package five;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferencingDemo {
    public static void main(String[] args) {
        List<Person> personList = Person.socialNetwork;

        Consumer<Person> personConsumer = (Person person) -> System.out.println(person);
//        personConsumer.accept(personList.get(0));
        Consumer<Person> personConsumer2 = System.out::println;;
//        PersonComparator personComparator = new PersonComparator();
//        personList
//                .stream()
//                .sorted((o1, o2) -> personComparator.compare(o1, o2))
//                .forEach(personConsumer);

        personList.forEach(MethodReferencingDemo::printPerson);

        PersonSorter personSorter = new PersonSorter();
        Comparator<Person> comparator = (p1, p2) -> personSorter.uporedi(p1, p2);
        Comparator<Person> comparator2 = personSorter::uporedi;
        personList.sort(personSorter::uporedi);

        personList
                .stream()
                .map(Person::getName)
                .sorted()
                .forEach(System.out::println);
        transferUTargetKolekciju(personList, HashSet::new);
    }

    static <T, S extends Collection<T>, D extends Collection<T>> D transferUTargetKolekciju (S srcCollection, Supplier<D> dstCollectionSupplier){
        D destCollection = dstCollectionSupplier.get();
        for (T element: srcCollection){
            destCollection.add(element);
        }
        return destCollection;
    }

    static String transform(Person person){
        String name = person.getName();
        return name;
    }

    public static void printPerson(Person person){
        System.out.println(person);
    }

    static class PersonSorter{
        public int uporedi(Person person1, Person person2){
            String o1Name = person1.getName();
            String o2Name = person2.getName();
            int nameResult = o1Name.compareTo(o2Name);
            return nameResult;
        }
    }


    private class PersonComparator implements Comparator<Person>{

        @Override
        public int compare(Person person1, Person person2) {
            String o1Name = person1.getName();
            String o2Name = person2.getName();
            int nameResult = o1Name.compareTo(o2Name);
            return nameResult;
        }
    }
}
