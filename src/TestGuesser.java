public class TestGuesser {

    public static void main(String[] args) {


        // Below are four tests of the constructor in the class Guesser.

        System.out.println("Test of Guesser with arguments: low = 0, high = 1000");

        Guesser guesser1 = new Guesser(0, 1000);
        System.out.println(guesser1 + "\n");

        //-------------------------------------------------------------------------------------------------------

        System.out.println("Test of Guesser with arguments: low = 500, high = 5000");

        Guesser guesser2 = new Guesser(500, 5000);
        System.out.println(guesser2 + "\n");

        //-------------------------------------------------------------------------------------------------------

        System.out.println("Test of Guesser with arguments: low = 1000, high = 0, This shall result in an exception being thrown.");

        try {
            Guesser guesser3 = new Guesser(1000, 0);
            System.out.println("Fail, no exception was thrown!\n");
        }
        catch (Exception e) {
            System.out.println("Success, an exception was thrown, with the message: " + e.getMessage() + "\n");
        }

        //-------------------------------------------------------------------------------------------------------

        System.out.println("Test of Guesser with arguments: low = 1000, high = 1000, This shall result in an exception being thrown.");

        try {
            Guesser guesser4 = new Guesser(1000, 1000);
            System.out.println("Fail, no exception was thrown!\n");
        }
        catch (Exception e) {
            System.out.println("Success, an exception was thrown, with the message: " + e.getMessage() + "\n");
        }

        //-------------------------------------------------------------------------------------------------------

        // Test of String comparison with equals, where one of the strings is null. This shall result in NullPointerException.
        // This code segment was copied from the assignment text, from the chapter "Stuff to think about (for Task 3)".


        String s = null;

        if(s.equals("Barcelona")){
            System.out.println("Ay, caramba");
        }


       /*

       This works as intended, I get the message:

        Exception in thread "main" java.lang.NullPointerException
        at TestGuesser.main(TestGuesser.java:52)

        */


    }

}
