package Ineritance;

/**
 * Created by behat on 16/02/2017.
 */
public class Door extends GameObject {
    int id;
    boolean isOpen;

    public boolean useOn(GameObject object) {
        return false;
    }
}
