package References;
import java.awt.Point;

/**
 * Created by behat on 28/01/2017.
 */
public class DrawPlayerAndSnake {

    private static int alpha;
    private static int beta;

    private static void startParameters() {
        System.out.println("Declare two parameters for construction: ( x / y )");
        alpha = new java.util.Scanner(System.in).nextInt();
        beta = new java.util.Scanner(System.in).nextInt();
        System.out.printf("Your chosen parameters are %d and %d%n",alpha, beta );
    }


    private static void initializeToken(Point p) {

        int randomX = (int) (Math.random() * alpha);
        int randomY = (int) (Math.random() * beta);
        p.setLocation(randomX, randomY);

    }

    private static void printScreen(Point playerPosition, Point snakePosition) {
        for(int y = 0; y < beta; y++) {

            for(int x = 0; x < alpha; x++) {
                if( playerPosition.distanceSq( x, y) == 0){
                    System.out.print('&');
                } else if( snakePosition.distanceSq( x, y ) == 0) {
                    System.out.print('S');
                } else {
                    System.out.print('.');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Point playerPosition = new Point();
        Point snakePosition = new Point();
        System.out.println(playerPosition);
        System.out.println(snakePosition);
        startParameters();
        initializeToken(playerPosition);
        initializeToken(snakePosition);
        System.out.println(playerPosition);
        System.out.println(snakePosition);
        printScreen(playerPosition, snakePosition);

    }
}
