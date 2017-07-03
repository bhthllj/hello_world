package ExceptionsII;

/**
 * Created by behat on 19/02/2017.
 */
public class PlayerException extends RuntimeException {


    /**
     * default constructor w/out parameters
     */
    public PlayerException() {}

    /**
     * parametrized costructor
     * @param s String name
     */
    public PlayerException(String s) {
        super(s);
    }




}
