package lesson5_button_events;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JButton button2;
    int count = 0;

    MyFrame() {
        label = new JLabel();
        label.setText("Hello " + count);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.BLUE);

        button = new JButton();
        button.setText("Increment");
        button.setToolTipText("click to increment");

        button2 = new JButton();
        button2.setText("Decrement");
        button2.setToolTipText("click to increment");

        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(button);
        this.add(button2);

        button.addActionListener(this);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button) {
            count++;
        }
        if (ae.getSource() == button2) {
            count--;
        }

        label.setText("Hello " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setSize(420, 420);
        frame.setTitle("Applicaton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
