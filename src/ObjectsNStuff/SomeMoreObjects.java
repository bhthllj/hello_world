package ObjectsNStuff;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by behat on 28/01/2017.
 */
public class SomeMoreObjects {

    Point p = new Point();
    Polygon t = new Polygon();

    public Polygon addEdge(Polygon t) {
        System.out.println("Koordinaten eingeben, mit ENTER trennen (x / y):_");
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        t.addPoint(x, y);
        System.out.println("Möchten Sie weitere Koordinaten eingeben (j / n)?");
        char a = new Scanner(System.in).next().charAt(0);

        if(a != 'j' || a != 'n') {
            System.out.println("Bitte gültige Antwort eingeben (j / n):");
            a = new Scanner(System.in).next().charAt(0);
        } else if(a == 'n') {
            return t;
        } else if(a == 'j') {
            addEdge(t);
        }

        System.out.println(t);
        return t;
    }





}
