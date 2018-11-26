public class GuessingGame {

    public static void main(String[] args) {

        try {

            int args0 = Integer.parseInt(args[0]);
            int args1 = Integer.parseInt(args[1]);

            Guesser guesser = new Guesser(args0, args1);
            guesser.start();

        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {

            System.err.println("Invalid arguments, or too few arguments. The arguments shall be two integers. The program will now terminate.");

        }
        catch (IllegalArgumentException e) {

            System.err.println("Invalid arguments. The first integer shall be lower than the second integer. The program will now terminate.");

        }

    }

}
