package four.dao;

import javax.swing.*;

public class GUIExecution {
    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Customer GUI");
        frame.setSize(300, 600);
        CustomerPanel customerPanel = new CustomerPanel();
        frame.setContentPane(customerPanel);
        frame.setVisible(true);



//        customerDao.create(customer);
    }
}
