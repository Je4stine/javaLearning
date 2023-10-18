import java.util.Scanner;

public class ReadingInput {
    public static void main (String[] args)
    {
        int firstNumber;
        int secondNumber;
        String name;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the fist number");
        firstNumber = keyboard.nextInt();

        System.out.println("Please enter the second number ");
        secondNumber = keyboard.nextInt();

        keyboard.nextLine();
        
        System.out.println("Enter name");
        name = keyboard.nextLine();
        
        double average = (firstNumber + secondNumber) / 2.0;
        System.out.println("The average is: " + average + " " + name);
    }
}
