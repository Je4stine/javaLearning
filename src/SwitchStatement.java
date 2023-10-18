import javax.swing.JOptionPane;

public class SwitchStatement {
    public static void main (String [] args)
    {
        int number;


        String input = JOptionPane.showInputDialog("Please enter 1,2 or 3");
        number = Integer.parseInt(input);

        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"Number is 1");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Number is 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Number is 3");
                break;
            default:
                JOptionPane.showMessageDialog(null,"You did not enter the required numbers");
        }

        char letter;
        String input2 = JOptionPane.showInputDialog("Please enter a,b or c");
        letter = input2.charAt(0);

        switch (letter)
        {
            case 'A':
            case 'a':
            JOptionPane.showMessageDialog(null,"Entered a");
            break;

            case 'B':
            case 'b':
            JOptionPane.showMessageDialog(null,"Entered b");
            break;
            
            case 'C':
            case 'c':
            JOptionPane.showMessageDialog(null,"Entered c");
            break;

            default:
            JOptionPane.showMessageDialog(null,"You did not enter the required letter");
        }

        System.exit(0);
    }
}
