package lesson6_textfield;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    JLabel label;

    MyFrame() {
        textField = new JTextField();
        textField.setColumns(15);

        button = new JButton();
        button.setText("Click");

        label = new JLabel("Empty text field");

        button.addActionListener(this);
        textField.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button) {
            label.setText(textField.getText());
        }
        if (ae.getSource() == textField) {
            label.setText(textField.getText());
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Applicaton");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
