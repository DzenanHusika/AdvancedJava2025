package three.execution;

import three.customer.Customer;
import three.customer.CustomerDao;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExecutionDemo {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        List<Customer> customers = customerDao.findAll();

//      customers.stream().filter(it->it.getAge()>=35)
//      .filter(customer -> customer.getState().equals("FL"))
//      .forEach(customer -> System.out.println(customer));



//      Stream<Customer> customerStream = customers.stream();
//      customerStream = customerStream.filter(c-> c.getAge() < 35);
//      customerStream = customerStream.filter(c-> c.getPhone() != null);
//      Stream<String> customerNameStream = customerStream.map(t-> t.getFirstName());
//      customerStream.forEach(c-> System.out.println(c));


        Predicate<Customer> filterByAge = e-> e.getAge() >= 18;
        Predicate<Customer> noPhoneNumberFilter = cust-> cust.getPhone()==null;
        Function<Customer, String> customerExtractor = cust-> cust.getFirstName()+" "+cust.getLastName();
        Consumer<String> customerConsumer = cFullName-> System.out.println(cFullName);
        customers
                .stream()
                .filter(filterByAge)
                .filter(noPhoneNumberFilter)
                .map(customerExtractor)
                .forEach(customerConsumer);




       // //printOlderThan(customers, 25);
       // printCustomers(customers, c -> c.getAge() >= 35, c-> System.out.println(c));
       // System.out.println();
       // System.out.println("Mladji od 35");
       // //printYoungerThan(customers, 25);
       // printCustomers(customers, customer -> customer.getAge() < 35, c-> System.out.println(c));
       // System.out.println();
       // System.out.println("Ljudi između 35-40 godina");
       // printCustomers(customers, customer -> customer.getAge() >= 35 && customer.getAge() <=35, c-> System.out.println(c));
       // System.out.println();
       // System.out.println("Iz BA");
       // //printCustomersInState(customers, "BA");
       // printCustomers(customers, customer -> customer.getState().equals("BA"), c-> System.out.println(c));
    }

    static void printCustomers(List<Customer> customers, Predicate<Customer> tester, Consumer<Customer> consumer){

        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()){
            Customer customer = iterator.next();
            if (tester.test(customer)){
                consumer.accept(customer);
            }
        }
//        for (Customer customer : customers){
//            if (tester.test(customer)){
//                consumer.accept(customer);
//            }
//        }
    }

    static void printOlderThan(List<Customer> customers, int age){
        for (Customer customer : customers){
            if (customer.getAge()<age){
                continue;
            }
            System.out.println(customer);
        }

    }
    static void printYoungerThan(List<Customer> customers, int age){
        for (Customer customer : customers){
            if (customer.getAge()>age){
                continue;
            }
            System.out.println(customer);
        }

    }
    static void printCustomersInState(List<Customer> customers, String state){
        for (Customer customer : customers){
            if (customer.getState().equals(state)){
                System.out.println(customer);
            }
        }
    }
}
