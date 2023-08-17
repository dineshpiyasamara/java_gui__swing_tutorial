package lesson2_label;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {

        Border border = BorderFactory.createLineBorder(new Color(56, 243, 65), 3);

        JLabel label = new JLabel(); // create a label
        label.setText("Hello World"); // set text on label

        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position
        label.setVerticalAlignment(JLabel.TOP); // set vertical poosition
        label.setForeground(Color.BLUE);
        label.setBorder(border);

        JFrame frame = new JFrame();
        frame.setSize(420, 420);
        frame.setTitle("Applicaton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(label);

    }
}
