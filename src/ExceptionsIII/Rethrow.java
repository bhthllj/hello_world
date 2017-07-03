package ExceptionsIII;
import java.net.*;

/**
 * Created by behat on 19/02/2017.
 */
public class Rethrow {

    public static URI createURIFromHost(String host) throws URISyntaxException{
        try{
            return new URI("http://" + host);
        } catch (URISyntaxException e) {
            System.err.println("Hilfe!" + e.getMessage());

            throw e;
        }

    }
}
