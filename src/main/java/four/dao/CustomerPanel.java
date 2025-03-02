package four.dao;

import javax.swing.*;
import java.awt.*;

public class CustomerPanel extends JPanel {
    private final JTextField firstNameField = new JTextField();
    private final JTextField lastNameField = new JTextField();
    private final JTextField addressField = new JTextField();
    private final JTextField cityField = new JTextField();
    private final JTextField stateField = new JTextField();
    private final JButton saveButton = new JButton("Save Customer");

    public CustomerPanel(){
        setLayout(new FlowLayout());
        firstNameField.setColumns(30);
        lastNameField.setColumns(30);
        addressField.setColumns(30);
        cityField.setColumns(30);
        stateField.setColumns(30);
        add(new JLabel("First name"));
        add(firstNameField);
        add(new JLabel("Last name"));
        add(lastNameField);
        add(new JLabel("Address"));
        add(addressField);
        add(new JLabel("City"));
        add(cityField);
        add(new JLabel("State"));
        add(stateField);
        SaveCustomerListener saveCustomerListener = new SaveCustomerListener(this);
        saveButton.addActionListener(saveCustomerListener);
        add(saveButton);

    }
    public String getFirstName(){
        return firstNameField.getText();
    }
    public String getLastName(){
        return lastNameField.getText();
    }
    public String getAddress(){
        return addressField.getText();
    }
    public String getCity(){
        return cityField.getText();
    }
    public String getState(){
        return stateField.getText();
    }
}
