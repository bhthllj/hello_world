package Loops;

/**
 * Created by behat on 25/01/2017.
 */
public class Loops_1 {

    /** while loop **/
    /** Hier sind zwei Möglichkeiten implementiert; eine als hard-wired Variante,
     * die andere mit preset Strings im printf-Format**/
    public static void loopingOne() {
        int cnt = 100;
        String s = "Ich erblicke das Licht der Welt";
        String t = " in Frorm einer %d Watt-Birne%n";
        while (cnt >= 40) {
            //System.out.printf("ich erblicke das Licht der Welt in Form einer %d Glühbirne.%n", cnt);
            System.out.printf(s + t, cnt);
            cnt -= 10;
        }

    }


}
