package Methods;

/**
 * Created by behat on 25/01/2017.
 */
public class RecursiveMethods {


    public static void down(int n) {
        if(n <= 0) {
            System.out.println();
            return;
        }
        System.out.print(n + ", ");

        down(n-1);

    }

    public static void up(int n) {
        if(n <= 0) {
            System.out.println();
            return;
        }
        up(n-1);

        System.out.print(n + ", ");
    }
}
