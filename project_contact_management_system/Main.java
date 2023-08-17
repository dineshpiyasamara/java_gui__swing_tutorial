import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return name + " - " + phoneNumber;
    }
}

class MyFrame extends JFrame implements ActionListener {
    private DefaultListModel<String> listModel;
    private JList<String> contactList;

    JPanel mainPanel, inputPanel, buttonPanel;
    JTextField nameField, phoneField;
    JButton addButton, deleteButton;

    public MyFrame() {
        listModel = new DefaultListModel<>();
        contactList = new JList<>(listModel);

        nameField = new JTextField();
        phoneField = new JTextField();

        inputPanel = new JPanel(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Phone Number:"));
        inputPanel.add(phoneField);

        addButton = new JButton("Add Contact");
        deleteButton = new JButton("Delete Contact");

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);

        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(contactList), BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        this.add(mainPanel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            String phoneNumber = phoneField.getText();

            Contact contact = new Contact(name, phoneNumber);
            listModel.addElement(contact.toString());
            JOptionPane.showMessageDialog(null, "Contact added successful", "Successful",
                    JOptionPane.INFORMATION_MESSAGE);
            nameField.setText("");
            phoneField.setText("");

        }
        if (e.getSource() == deleteButton) {
            int selectedIndex = contactList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
                JOptionPane.showMessageDialog(null, "Contact deleted successful", "Deleted",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

public class Main extends JFrame {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setTitle("Contact Management System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
