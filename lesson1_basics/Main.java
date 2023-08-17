package lesson1_basics;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        // create a frame
        JFrame frame = new JFrame();

        frame.setTitle("Application");

        // frame.setResizable(false);

        // Default - HIDE ON CLOSE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // X dimension, Y dimension
        frame.setSize(420, 420);

        // make frame visible
        frame.setVisible(true);

        // frame.getContentPane().setBackground(Color.ORANGE);
        frame.getContentPane().setBackground(new Color(255, 54, 123));
    }
}