package Imports;

/**
 * Created by behat on 28/01/2017.
 */
public class NullCheck {

    public static void nullChecking(){
        String s = javax.swing.JOptionPane.showInputDialog("Eingabe");
        if(s != null && ! s.isEmpty()) {
            System.out.println("Eingabe: " + s);
        } else {
            System.out.println("Abbruch oder keine Eingabe");
        }
    }
}
