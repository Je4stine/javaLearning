public class Method {
    public static void main ( String [] args)
    {
       double average = getAverage(200, 20);
        System.out.println("The average is: " + average);
    }

    public static void printAverage (int val1, int val2)
    {
        double average = (val1 + val2)/ 2.0;
        System.out.println("The average is: " + average);
    }

    public static double getAverage ( int val1, int val2)
    {
        double average = (val1 + val2)/ 2.0;

        return average;
    }
}
