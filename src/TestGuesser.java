public class TestGuesser {

    public static void main(String[] args) {


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

    }

}
