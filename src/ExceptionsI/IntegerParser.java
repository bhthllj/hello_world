package ExceptionsI;

/**
 * Created by behat on 17/02/2017.
 */
public class IntegerParser {


    public static String vatRate1 = "19";
    public static String vatRate2 = "19%";

    public static int getVarRate(String s) throws NumberFormatException{
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            System.out.printf("'%s' kann nicht in eine Zahl konvertiert werden!%n", s);
        }

        System.out.println("Weiter gehts");
        return -1;
    }
}
