import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadingFile {
    public static void main (String [] args) throws IOException
    {
        File file = new File("MyFile.txt");

        if (file.exists())
        {
            Scanner inpuFile = new Scanner(file);
            
             while (inpuFile.hasNext())
             {
                System.out.println(inpuFile.nextLine());
             }

            inpuFile.close();

        }
        else{
            JOptionPane.showMessageDialog(null,"The file does not exist");
        }
    }
}
