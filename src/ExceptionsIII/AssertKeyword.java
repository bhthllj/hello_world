package ExceptionsIII;

/**
 * Created by behat on 19/02/2017.
 */
public class AssertKeyword {

    public static double subAndSqrt(double a, double b) {
        double result = Math.sqrt(a - b); // a and b are already defined in the scope!
        assert !Double.isNaN(result): "Berechnungsergebnis ist NaN";
        return result;
    }
}
