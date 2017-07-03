package Arrays;
import java.util.Scanner;

/**
 * Created by behat on 28/01/2017.
 */
public class UserInputStringArray {

    public static void main(String[] args) {

        String[] validInputs = { "Banane", "Apfel", "Kirsche"};

        userInputLoop:
        while(true) {

            String input = new Scanner(System.in).nextLine();

            for(String s : validInputs) {
                if(s.equals(input)) {
                    break userInputLoop;
                }

            }
        }
        System.out.println("Gültiges Früchtchen eingeben: ");
    }
}
