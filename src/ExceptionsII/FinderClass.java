package ExceptionsII;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by behat on 17/02/2017.
 * contains the method that is utilized in FindAllEMailAdresses.main()
 * to single out e mail addresses from a given URL
 */
public class FinderClass {

    static void printAllEMailAddresses(String urlString)
            throws MalformedURLException, IOException {


        Scanner scanner = new Scanner(new URL (urlString).openStream());
        Pattern pattern = Pattern.compile("[\\w|-]+@\\w[\\w|-]*\\.[a-z]{2,3}");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (Matcher m = pattern.matcher(line); m.find(); ) {
                System.out.println(line.substring(m.start(), m.end()));
            }
        }

    }
}
