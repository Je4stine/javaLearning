import javax.swing.JOptionPane;

public class JOption {
    public static void main( String [] args){
        String name;
        String surName;

        name = JOptionPane.showInputDialog("Please enter name");
        surName = JOptionPane.showInputDialog("Please enter surname");

        JOptionPane.showMessageDialog(null, name + " " + surName);

        int firstNumber;

        String input;

        input = JOptionPane.showInputDialog("Enter First Number");
        firstNumber = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null, firstNumber );
    }
}
