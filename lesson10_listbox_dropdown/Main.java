package lesson10_listbox_dropdown;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame implements ListSelectionListener, ActionListener{
    JList listbox;
    JComboBox combobox;
    
    MyFrame(){

        String[] languages = {"Java", "Python", "C++", "JavaScript", "C#", "php"};

        listbox = new JList<>(languages);
        listbox.setVisibleRowCount(4);

        combobox = new JComboBox<>(languages);

        listbox.addListSelectionListener(this);
        combobox.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(new JScrollPane(listbox));
        this.add(combobox);
    }

    public void valueChanged(ListSelectionEvent e){
        if(e.getSource() == listbox){
            System.out.println(listbox.getSelectedValue());
            // System.out.println(listbox.getSelectedValuesList());
        }
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == combobox){
            System.out.println(combobox.getSelectedItem());
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