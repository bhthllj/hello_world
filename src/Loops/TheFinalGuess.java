package Loops;

/**
 * Created by behat on 25/01/2017.
 */
public class TheFinalGuess {
    /** Java Insel Beispiel Siete 195 **/

    static String s1 = "Welche Zahl denke ich mir zwischen 1 und 5?";
    static String s2 = "Super getippt!";
    static String s3 = "Nee, meine Zahl ist größer als Deine!";
    static String s4 = "Meine Zahl ist kleiner als Deine!";
    static String s5 = "Nur Zahlen zwischen 1 und 5!";

    public static void guessing() {
        int guess;
        int number = (int) (Math.random()* 5 + 1);
        do {
            System.out.println(s1);
            guess = new java.util.Scanner (System.in).nextInt();
            if (number == guess) {
                System.out.println(s2);
            }
            else if (number > guess) {
                System.out.println(s3);
            }
            else if (number < guess) {
                System.out.println(s4);
            }
        } while (number != guess);
    }


    public static void guessWhat() {
        /**
         * mit break und continue Anweisung
         */

        int number = (int) (Math.random() *5 +1);
        System.out.println(s1);

        while (true ) {

            int guess = new java.util.Scanner(System.in).nextInt();

            if(guess <1 || guess > 5) {
                System.out.println(s5);
                continue;
            }
            if( number == guess ) {
                System.out.println(s2);
                break;

            } else if( number > guess ) {
                System.out.println(s3);

            } else if (number < guess ) {
                System.out.println(s4);
            }
        }
    }

}
