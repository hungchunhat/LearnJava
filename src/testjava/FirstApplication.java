package testjava;

import javax.swing.JOptionPane;

public class FirstApplication {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Put your name here: ");
        JOptionPane.showMessageDialog(null, "Hello "+result+" !!!");
        System.exit(0);
    }
}
