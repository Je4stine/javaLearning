import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Fibonnaci {
    public static void main ( String [] args)
    {
        int days;
        double sales;
        double total = 0.0;

        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String input = JOptionPane.showInputDialog("How many days do you have sales?");
        days = Integer.parseInt(input);

        for (int count = 1; count <= days; count ++)
        {
            input = JOptionPane.showInputDialog("Enter sales for day " + count);
            sales = Double.parseDouble(input);

            total += sales;
        }

        JOptionPane.showMessageDialog(null,"Total sales are Ksh." + dollar.format(total));
        System.exit(0);
    }
}
