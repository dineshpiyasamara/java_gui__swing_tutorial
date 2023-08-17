package lesson12_panel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.*;

class MyFrame extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    JPanel panel1, panel2;

    MyFrame() {
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        btn6 = new JButton("Button 6");
        btn7 = new JButton("Button 7");
        btn8 = new JButton("Button 8");

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.YELLOW);
        panel1.add(btn6);
        panel1.add(btn2);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 1));
        panel2.setBackground(Color.ORANGE);
        panel2.add(btn3);
        panel2.add(btn7);
        panel2.add(btn8);

        this.setLayout(new BorderLayout());
        this.add(btn1, BorderLayout.NORTH);
        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.EAST);
        this.add(btn4, BorderLayout.SOUTH);
        this.add(btn5, BorderLayout.WEST);
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