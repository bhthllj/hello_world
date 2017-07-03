package InAndOut;

/**
 * Created by behat on 19/02/2017.
 */
public class Lamp {
    static String s = "Huhu";
    int i = 1;

    static class Bulb {
        void output() {
            System.out.println(s);
            //* Non-static field cannot be referneced whithin an static scope *//
            //System.out.println(i);

        }
    }

    //public static void main (String[] args) {
    //    Bulb bulb = new Lamp.Bulb();
    //    bulb.output();
    //}
}
