package ExceptionsII;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by behat on 17/02/2017.
 */
public class ReadColorTable {
    /**
     * @param filename
     * @return colors[]
     */
    public static int[] readColorTable(String filename) {
        int[] colors = new int[256];
        Scanner input = null;
        try{
            input = new Scanner(new File(filename));
            while(input.hasNextLine()) {
                int index = input.nextInt();
                int rgb = input.nextInt(16);
                colors[index] = rgb;
            }
            return colors;
        } catch (IOException e) {
            System.err.printf("Dateioperation fehlgeschlagen%n%s%n", e);
        } catch ( InputMismatchException | ArrayIndexOutOfBoundsException e ) {
            System.err.printf("Dateiformat falsch%n%s%n", e);
        } finally {
            input.close();
        }
        return colors;
    }
}
