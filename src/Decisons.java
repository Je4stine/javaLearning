import javax.swing.JOptionPane;

public class Decisons {
    public static void main( String [] args){
        int number;
        String input;

        input = JOptionPane.showInputDialog("Please enter a your mark");
        number = Integer.parseInt(input);

        if (number < 50 && number >= 45)
        {
            JOptionPane.showMessageDialog(null,"You can write a reassesment");
        }

        else if ( number < 50 )
        {
            JOptionPane.showMessageDialog(null,"You failed");
        }
        else 
        {
            if (number >= 75)
            {
                JOptionPane.showMessageDialog(null,"You have distinction");
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"You passed");
            }
        }

        System.exit(0);
    }
}
