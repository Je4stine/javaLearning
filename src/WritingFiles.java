import java.io.IOException;
import java.io.PrintWriter;

public class WritingFiles {
    public static void main ( String [] args) throws IOException
    {
        // Create and open file
        PrintWriter ouput = new PrintWriter("MyFile.txt");

        ouput.println("I am A text file");
        ouput.println("I am A text file");
        ouput.println("I am A text file");

        ouput.close();

    }
}
