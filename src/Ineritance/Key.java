package Ineritance;

/**
 * Created by behat on 16/02/2017.
 */
public class Key extends GameObject {
    int id;

    public boolean useOn(GameObject object) {
        if(object instanceof Door)
            if(id == ((Door) object).id )
                return((Door) object ).isOpen = true;

        return false;
    }
}
