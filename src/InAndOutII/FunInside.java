package InAndOutII;

/**
 * Created by behat on 19/02/2017.
 */
public class FunInside {

    public static void main(String[] args) {

        int i = 2;
        final int j = 3;

        class In {

            In() {
                System.out.println(j);
                System.out.println(i);
            }
        }

        new In();
    }
}
