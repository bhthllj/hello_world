package MoreObjects_Snake;
import java.awt.Point;


/**
 * Created by behat on 27/01/2017.
 */
public class PlaySnake {

    public static void main(String[] args) {

        Point playerPosition = new Point(10, 9);
        Point snakePosition = new Point(30, 2);
        Point doorPosition = new Point(0,5);
        Point goldPosition = new Point(6, 6);

        boolean rich = false;

        while( true ) {
            //Raster mit Figuren zeichnen

            for(int y = 0; y < 10; y++) {

                for(int x = 0; x < 40; x++ ){

                    Point p = new Point(x, y);

                    if(playerPosition.equals(p)) {
                        System.out.print('&');
                    } else if(snakePosition.equals(p)) {
                        System.out.print('S');
                    } else if(goldPosition.equals(p)) {
                        System.out.print('$');
                    } else if(doorPosition.equals(p)) {
                        System.out.print('#');
                    } else System.out.print('.');
                }
                System.out.println();
            }
            //Status feststellen

            if(rich && playerPosition.equals(doorPosition)){
                System.out.println("Gewonnen!");
                break;
            }
            if(playerPosition.equals(snakePosition)) {
                System.out.println("ZZZZZZ. Die SChlange hat Dich!");
                break;
            }
            if(playerPosition.equals(goldPosition)) {
                rich =true;
                goldPosition.setLocation(-1,-1);
            }

            //Konsoleneingaben und Soielerposition verändern

            switch(new java.util.Scanner(System.in).next().charAt(0)) {
                case 'h'    :   playerPosition.y = Math.max( 0, playerPosition.y-1);
                    break;
                case 't'    :   playerPosition.y = Math.min( 9, playerPosition.y+1);
                    break;
                case 'l'    :   playerPosition.x = Math.max( 0, playerPosition.x-1);
                    break;
                case 'r'    :   playerPosition.x = Math.min( 39, playerPosition.x+1);
                    break;
            }
            //Schlange bewegt sich

            if(playerPosition.x < snakePosition.x) {
                snakePosition.x--;
            } else if(playerPosition.x > snakePosition.x) {
                snakePosition.x++;
            }

            if(playerPosition.y < snakePosition.y) {
                snakePosition.y--;
            } else if(playerPosition.y > snakePosition.y) {
                snakePosition.y++;
            }
        } // end while

    }
}
