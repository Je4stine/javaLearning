import javax.swing.JOptionPane;

public class InputValidation {
    public static void main ( String [] args)
    {
        String input = JOptionPane.showInputDialog("Enter number between 1 -100");

        int number = Integer.parseInt(input);

        while (number < 1 || number > 100)
        {
            JOptionPane.showMessageDialog(null, "Invalid number");

            input = JOptionPane.showInputDialog("Enter number between 1 -100");
            number = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null, "Correct");
    }
}
