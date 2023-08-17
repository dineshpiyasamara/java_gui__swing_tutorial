package lesson14_dialogbox;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // String name = JOptionPane.showInputDialog("What is your name?");
        // if(name != null){
        // JOptionPane.showMessageDialog(null, "Your name is "+name);
        // }

        // JOptionPane.showMessageDialog(null, "This is Message", "This is Title",
        // JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is Message", "This is Title",
        // JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is Message", "This is Title",
        // JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is Message", "This is Title",
        // JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is Message", "This is Title",
        // JOptionPane.ERROR_MESSAGE);

        // int result = JOptionPane.showConfirmDialog(null, "This is message", "Title",
        // JOptionPane.YES_NO_CANCEL_OPTION);
        // System.out.println(result);

        String[] languages = { "Java", "Python", "JavaScript" };
        int lang = JOptionPane.showOptionDialog(null, "What is your favourite programming language?", "Select language",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, languages, languages[0]);
        // System.out.println(lang);

        if (lang != -1) {
            JOptionPane.showMessageDialog(null, "Your language is " + languages[lang]);
        }
    }
}