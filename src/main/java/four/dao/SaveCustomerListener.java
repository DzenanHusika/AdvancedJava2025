package four.dao;

import three.customer.Customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveCustomerListener implements ActionListener {
private final CustomerPanel panel;

public SaveCustomerListener(CustomerPanel panel){
    this.panel = panel;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        CustomerDao customerDao = new CustomerDao();
        Customer customer = new Customer();
        customer.setFirstName(panel.getFirstName());
        customer.setLastName(panel.getLastName());
        customer.setAddress(panel.getAddress());
        customer.setCity(panel.getCity());
        customer.setState(panel.getState());
        customerDao.create(customer);
        JOptionPane.showMessageDialog(null,"Uspješno kreiran customer!");
    }
}
