package lesson13_menubar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu fileMenu, helpMenu;
    JMenuItem newItem, openItem, closeItem;

    MyFrame(){
        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        closeItem = new JMenuItem("Close");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        closeItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H

        newItem.setMnemonic(KeyEvent.VK_N); // N
        openItem.setMnemonic(KeyEvent.VK_O); // O
        closeItem.setMnemonic(KeyEvent.VK_C); // C

        fileMenu.add(newItem);
        fileMenu.addSeparator();
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(closeItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == newItem){
            System.out.println("Click New Menu Item");
        }
        if(e.getSource() == openItem){
            System.out.println("Click Open Menu Item");
        }
        if(e.getSource() == closeItem){
            System.exit(0);
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