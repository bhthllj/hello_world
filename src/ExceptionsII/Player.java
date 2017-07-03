package ExceptionsII;

/**
 * Created by behat on 19/02/2017.
 */
public class Player {
    public int age;

    Player(int age) {
        if(age <= 0) {
            throw new IllegalArgumentException("Kein Alter <= 0 erlaubt!");
        }
        this.age = age;
    }

}
