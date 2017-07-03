package Varargs;


import StringsAndChars.StringBuilding;

/**
 * Created by behat on 01/02/2017.
 */
public class Main {

    public static void main(String[] args) {
        MaxVarArgs.max(1,3,5,7,8);
        int[] feld = {1,6,8,22,4,32};
        MaxVarArgs.max(feld);
        System.out.println( "PI : \u03C0");
        javax.swing.JOptionPane.showMessageDialog(null, "\u263A");

        System.out.println( isNumeric.isNumeric("12345795"));
        System.out.println( isNumeric.isNumeric("23inof90"));
        System.out.println( isNumeric.isNumeric ("-12345"));

        System.out.println(StringsAndChars.Enumerate.enumerate("Aufstehen", "Frühstücken", "Arbeiten gehen"));

        StringBuilding.join("Das ist ", "nur ein Test", "!");
    }
}
