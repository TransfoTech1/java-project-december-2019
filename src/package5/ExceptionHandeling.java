package package5;

public class ExceptionHandeling {


    public static void main(String[] args) {

        String[] states = new String[5];
        states[0] = "NY";
        states[1] = "NJ";
        states[2] = "VA";
        states[3] = "FL";
        states[4] = "MA";

        System.out.println(states[4]);

        // System.out.println(states[5]);
        // try the try body
        // if exception occured execute catch body
        // and no matter what finally block gets executed

        try {
            System.out.println(states[4]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("There's somethin wrong with the array");
        } finally {
            System.out.println("finally block executed");
        }

    }
}
