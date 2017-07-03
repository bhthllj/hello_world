package Imports;
import static java.lang.System.out;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.Math.min;
/**
 * Created by behat on 28/01/2017.
 */
public class StaticImport {

    public static void main(String[] args) {
        int i = parseInt( showInputDialog("Erste Zahl: "));
        int j = parseInt( showInputDialog("Zweite Zahl: "));
        out.printf("%d ist größer oder gleich als %d.%n", max(i, j), min(i, j));

        NullCheck.nullChecking();
    }
}
