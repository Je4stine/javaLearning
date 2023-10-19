import javax.swing.JOptionPane;

public class SentinalValue {
    public static void main ( String [] args)
    {

        int value;
        int doubleValue;

        String input = JOptionPane.showInputDialog("Enter a value to double" + " (Enter 0 to stop)");
        value = Integer.parseInt(input);

        while (value != 0)
        {
            doubleValue = value * 2;
            JOptionPane.showMessageDialog(null, value + " double is" + " " + doubleValue);

            input = JOptionPane.showInputDialog("Enter a value to double" + " (Enter 0 to stop)");
            value = Integer.parseInt(input);
        }

        System.exit(0);
    }
}
