package lesson3_label_class;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {
    JLabel label;

    MyFrame() {

        label = new JLabel();
        label.setText("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position
        label.setVerticalAlignment(JLabel.TOP); // set vertical poosition
        label.setForeground(Color.BLUE);

        this.add(label);
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
