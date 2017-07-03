package DigitalPlayground;

/**
 * Created by behat on 03/02/2017.
 */
public class Player {

    String name;
    String item;

    void clearName() {
        name = "";
    }

    boolean hasCompoundName() {
        return(name == null) ? false : name.contains("");
    }
}
