package StringsAndChars;

/**
 * Created by behat on 03/02/2017.
 */
public class StringBuilding {

    public static String join(Object... strings) {
        StringBuilder result = new StringBuilder();

        for(Object string : strings) {
            result.append(strings);
        }
        System.out.println(result.toString());
        return result.toString();
    }
}
