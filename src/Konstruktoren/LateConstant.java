package Konstruktoren;

/**
 * Created by behat on 15/02/2017.
 */
public class LateConstant {

    public static final int HUBBLE;
    public final String ISBN;

    static
    {
        HUBBLE = new java.util.Scanner(LateConstant.class.getResourceAsStream(
                "hubble-constant.txt")).nextInt();
    }

    public LateConstant() {
        ISBN = "3572100100";
    }
}
