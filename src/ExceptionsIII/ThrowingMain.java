package ExceptionsIII;
import java.net.*;
import javax.swing.*;


/**
 * Created by behat on 19/02/2017.
 */
public class ThrowingMain {


    public static void main(String[] args) {
        try {
            Rethrow.createURIFromHost("youtube.com");
            Rethrow.createURIFromHost(JOptionPane.showInputDialog("Insert host name"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
     /////////////////////////////////////////////////////
        GetStackTrace.recM(2);
     //////////////////////////////////////////////////////

        AssertKeyword.subAndSqrt(9.0, 98.0);

    }
}
