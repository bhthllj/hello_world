package StringsAndChars;

/**
 * Created by behat on 01/02/2017.
 */
public class Enumerate {

    public static String enumerate(String... lines) {
        if(lines == null || lines.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < lines.length; i++) {
            sb.append( i + 1 );
            sb.append( ". ");
            sb.append( lines[i]);
            sb.append("\n");
        }
        return sb.toString().trim();

    }
}
