package Konstruktoren;

/**
 * Created by behat on 15/02/2017.
 */
public final class Logger {

    private static Logger logger;

    private Logger(){}

    /**
     * @object singleton logger is singleton;
     * @method getInstance checks whether logger object already exists
     */
    public static synchronized Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String s) {
        System.out.println(s);
    }
}
