package StringsAndChars;

/**
 * Created by behat on 01/02/2017.
 */
public class Hangman1 {

    public static void main(String[] args) {
        System.out.println("What is the Hangword?");
        String hangmanWord = new java.util.Scanner(System.in).nextLine();
        String usedChars = "";

        String guessedWord = "";
        for (int i = 0; i < hangmanWord.length(); i++) {
            guessedWord += "_";
        }
        for (int guesses = 1; ; ) {
            if (guesses == 10) {
                System.out.printf("Nach 10 Versuchen ist jetzt Schluss. Zorry! " +
                        "Apropos, das Wort war '%s'.", hangmanWord);
                break;
            }
            System.out.printf("Runde %d. Bisher geraten: %s. Was wählst du für ein Zeichen?%n"
                    , guesses, guessedWord);
            char c = new java.util.Scanner(System.in).next().charAt(0);

            if(usedChars.indexOf(c) >= 0) {
                System.out.printf("%c hast Du schon mal getippt!%n", c);
                guesses++;
            } else {
                usedChars += c;
                if(hangmanWord.indexOf(c) >= 0) {
                    guessedWord = "";
                    for(int i = 0; i < hangmanWord.length(); i++){
                        guessedWord += usedChars.indexOf(hangmanWord.charAt(i)) >= 0 ?
                                hangmanWord.charAt(i) : "_";
                    }
                    if(guessedWord.contains("_")) {
                        System.out.printf("Gut geraten, %s gibt es im Wort" + "Aber es fehlt noch was%n", c);
                    } else {
                        System.out.printf("Gratulation, Du hast das Wort '%s' erraten!", hangmanWord);
                        break;
                    }
                }
                //hangmanWord.indexOf(c) == -1
                else {
                    System.out.printf("Pech gehabt, %c kommt nicht vor!%n", c);
                    guesses++;
                }
            }
        }

    }
}
