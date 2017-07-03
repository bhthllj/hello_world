package Ineritance;

/**
 * Created by behat on 15/02/2017.
 * parent class to class.Player, class.Item, class.Room
 */
public class GameObject {

    public String name;

    /**
     * @abstract useOn method cannot have a body and are finished with a semicolon
     * @param object
     * @return
     */
    public boolean oseOn(GameObject object) {
        return false;
    };

    @Override
    public String toString() {
        return String.format("GameObject[name = %s]", name);
    }

}
