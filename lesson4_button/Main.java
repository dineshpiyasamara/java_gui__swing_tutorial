package lesson4_button;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
    JLabel label;
    JButton button;

    MyFrame() {

        label = new JLabel();
        label.setText("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.BLUE);

        button = new JButton();
        button.setText("Click Me");

        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(button);
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
