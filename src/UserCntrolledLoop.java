import javax.swing.JOptionPane;

public class UserCntrolledLoop {
    public static void main ( String [] args)
    {
        int nextValue;

        String input = JOptionPane.showInputDialog("How high should I go to square the number?");
        nextValue = Integer.parseInt(input);

        System.out.println(" Number                 Number Square");
        System.out.println("=======================================");

        for (int i = 1; i <= nextValue; i++)
        {
            System.out.println(i + "\t\t\t\t" + i*i);
        }
    }
}
