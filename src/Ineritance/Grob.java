package Ineritance;

/**
 * Created by behat on 15/02/2017.
 */
public class Grob extends Alien {

    /**
     * Hier muss mit super(String planet) der Konstruktor aufgerufen werden, da es in der Elter-Klasse keinen
     * Standard-Konstruktor gibt.
     */
    public Grob() {
        super("Locutus");
    }
    public Grob(String planet) {
        super(planet);
    }

}
