package Recursion;
import java.util.Scanner;

/**
 * Created by behat on 24.04.17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an integer value...");
        int i = new Scanner(System.in).nextInt();
        new Sum().summarize(i);
        System.out.println(i);
    }
}
