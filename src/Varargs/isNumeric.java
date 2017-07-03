package Varargs;

/**
 * Created by behat on 01/02/2017.
 * Returns {@code true} if the String contains only unicode digits
 * An empty string or {@code null} leads to {@code false}.
 *
 * @param string Input String
 * @return {@code true} if string is numeric, {@code false} otherwise.
 */
public class isNumeric {

    public static boolean isNumeric(String string) {
        if( string == null || string.length() == 0){
            return false;
        }
        for(int i = 0; i < string.length(); i++) {
            if( ! Character.isDigit( string.charAt(i) )) {
                return false;
            }
        }
        return true;
    }
}
