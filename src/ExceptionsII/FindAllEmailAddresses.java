package ExceptionsII;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.*;

/**
 * Created by behat on 17/02/2017.
 */
public class FindAllEmailAddresses {

    public static void main(String[] args)
        throws FileNotFoundException, IOException{

        /**
         * USING RandomAccessFile, we access a gif on the local machine and inspect its size
         */
        RandomAccessFile f = new RandomAccessFile("/Users/behat/Downloads/Archer.gif", "r");
        f.seek(6);
        System.out.printf("%s x %s Pixel%n", f.read() + f.read() * 256,
                                            f.read() + f.read() * 256);

        /////////////////////////////////////////////////////////////////////
        /**
         *
         */
        try{
            String urlInput = javax.swing.JOptionPane.showInputDialog("Bitte die URL eingeben: ");
            FinderClass.printAllEMailAddresses(urlInput);
        } catch (MalformedURLException e) {
            System.err.println("URL ist falsch aufgebaut!");
        } catch (IOException e) {
            System.err.println("URL konnte nicht geöffnet werden!");
        } finally {
            if( f != null) {
                try {f.close();} catch (IOException e) {}
            }
        }
        /////////////////////////////////////////////////////////////////////
        ReadColorTable.readColorTable("/Users/behat/OneDrive/Programming/src/ExceptionsII/baseColors.txt");
        /////////////////////////////////////////////////////////////////////
        try{
            Player d = new Player(20);
            System.out.println(d);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }



}
