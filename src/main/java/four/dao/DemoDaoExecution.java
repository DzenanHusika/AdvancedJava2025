package four.dao;

import three.customer.Customer;

import java.time.LocalDate;

public class DemoDaoExecution {
    public static void main(String[] args) {
        int id = 11;
        CustomerDao customerDao = new CustomerDao();
        Customer customer = customerDao.findById(id);
        System.out.println(customer);
        customer.setBirthDate(LocalDate.of(1990, 12 ,31));
        customer.setPhone("+3842328371");
        customer.setPoints(2343);
        customerDao.update(customer);
        customerDao.delete(customer);
    }
}
