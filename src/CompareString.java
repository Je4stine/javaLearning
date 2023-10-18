import javax.swing.JOptionPane;

public class CompareString {
    public static void main ( String [] args)
    {
        String name1 = JOptionPane.showInputDialog("Enter name 1");
        String name2 = JOptionPane.showInputDialog("Enter name 2");

        if (name1.equals(name2))
        {
            System.out.println("Same");
        }
        if ( name1.compareTo(name2) < 0)
        {
            System.out.println("Name 1 is first");
        }

        else
        {
            System.out.println("Name 2 is first");
        }

        System.exit(0);
    }
}
