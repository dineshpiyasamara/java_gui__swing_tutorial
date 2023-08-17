package lesson9_radiobutton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{

    JRadioButton rb1, rb2, rb3;
    JLabel label;
    
    MyFrame(){
        ButtonGroup group = new ButtonGroup();
        rb1 = new JRadioButton("Orange");
        rb2 = new JRadioButton("Apple");
        rb3 = new JRadioButton("Mango");
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);

        label = new JLabel("Not selected");

        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(rb1);
        this.add(rb2);
        this.add(rb3);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e){
        if(rb1.isSelected()){
            label.setText(rb1.getText());
        }
        if(rb2.isSelected()){
            label.setText(rb2.getText());
        }
        if(rb3.isSelected()){
            label.setText(rb3.getText());
        }
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