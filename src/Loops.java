public class Loops {
    public static void main (String [] args)
    {
        //Loop control variable Pretest
        int x = 0;

        while( x < 5 )
        {
            System.out.println(x);
            x++;
        }

        System.out.println("=======================================================================================");

        // DO while  post test

        int y=0;

        do 
        {
            System.out.println(y);
            y++;

        } while ( y < 5);

            System.out.println("=======================================================================================");


         // For loop

            

         for ( int i = 0 ; i<5 ; i++)
         {
           System.out.println(i);

         }
    }
}
