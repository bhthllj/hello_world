package ExceptionsI;

/**
 * Created by behat on 17/02/2017.
 */
public class ExceptionsMain {

    public static void main(String[] args) {
       // System.out.println(IntegerParser.getVarRate(IntegerParser.vatRate1));
       // System.out.println(IntegerParser.getVarRate(IntegerParser.vatRate2));

        int number;

        while(true) {
            try {
                String s = javax.swing.JOptionPane.showInputDialog(
                        "Bitte Zahl eingeben");
                number = Integer.parseInt(s);
                break;
            }
            catch (NumberFormatException ó_ò){
                System.err.println("Das war keine Zehl!");
            }
        }
        System.out.println("Danke für die Zahl '" + number + "'!");
        System.exit(0);



    }
}
