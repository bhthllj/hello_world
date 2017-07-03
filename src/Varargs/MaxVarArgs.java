package Varargs;

/**
 * Created by behat on 01/02/2017.
 */
public class MaxVarArgs {

    static int max(int... array){
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("Array null oder leer.");
        }
        int currMax = Integer.MIN_VALUE;

        for(int e : array) {
            if(e > currMax) {
                currMax = e;
            }
        }
        System.out.println(currMax);
        return currMax;

    }
}
