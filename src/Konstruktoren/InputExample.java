package Konstruktoren;

/**
 * Created by behat on 15/02/2017.
 */
public class InputExample {

    public static final int HOWEASY;
    public static  String lyric = "Nothing";

    static {
        HOWEASY = new java.util.Scanner(InputExample.class.getResourceAsStream(
                "abc.txt")).nextInt();
    }

    static {
        lyric = new java.util.Scanner(InputExample.class.getResourceAsStream(
                "abc.txt")).next();
    }

    public InputExample(String lyric) {
        this.lyric = lyric;
        System.out.println(lyric);
    }
}
