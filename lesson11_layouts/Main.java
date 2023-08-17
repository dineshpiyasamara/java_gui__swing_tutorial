package lesson11_layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

class MyFrame extends JFrame{
    JButton btn1, btn2, btn3, btn4, btn5;

    MyFrame(){
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");

        this.setLayout(new BorderLayout());
        this.add(btn1, BorderLayout.NORTH);
        this.add(btn2, BorderLayout.CENTER);
        // this.add(btn3, BorderLayout.EAST);
        // this.add(btn4, BorderLayout.SOUTH);
        this.add(btn5, BorderLayout.WEST);

        // FlowLayout fl = new FlowLayout();
        // fl.setAlignment(FlowLayout.CENTER);
        // fl.setHgap(50);
        // fl.setVgap(50);
        // this.setLayout(fl);
        // this.add(btn1);
        // this.add(btn2);
        // this.add(btn3);
        // this.add(btn4);
        // this.add(btn5);
    }
    
}

public class Main {
    public static void main(String[] args){
        MyFrame frame = new MyFrame();
        frame.setTitle("Applicaton");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}