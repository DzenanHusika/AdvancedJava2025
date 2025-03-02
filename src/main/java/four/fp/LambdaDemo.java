package four.fp;

import four.dao.CustomerDao;
import three.customer.Customer;

import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        CustomerDao customerDao = new CustomerDao();
        List<Customer> customers = customerDao.findAll();
        customers
                .stream()
                .filter(c->c.getPhone()!=null)
                .filter(cu->cu.getPoints()<0)
                .map(customer -> customer.getFirstName()+ " " + customer.getLastName())
                .forEach(customerName -> System.out.println(customerName));
    }
}
