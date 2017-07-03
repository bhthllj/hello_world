package Recursion;
import java.util.Scanner;

/**
 * Created by behat on 24.04.17.
 */
public class Sum {

    public int summarize(int i) {
        if(i == 0)
            return 0;
        else
            return i + summarize(i-1);

    }

}
