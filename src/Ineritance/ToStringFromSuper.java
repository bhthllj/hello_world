package Ineritance;

/**
 * Created by behat on 15/02/2017.
 */
public class ToStringFromSuper {

    public ToStringFromSuper() {
        System.out.println(super.toString());
    }

    @Override public String toString() {
        return "nein";
    }

}
