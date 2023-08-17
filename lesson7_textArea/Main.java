package lesson7_textArea;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
    JTextArea textArea;
    JButton button;

    MyFrame() {
        textArea = new JTextArea(10, 40);

        button = new JButton();
        button.setText("Add Text");

        button.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(textArea);
        this.add(button);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            // System.out.println(textArea.getText());
            // System.out.println(textArea.getSelectedText());
            // textArea.append("Hello");
            // textArea.insert("Hello", 0);
            textArea.insert("Hello", textArea.getCaretPosition()); // get cursor position
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
