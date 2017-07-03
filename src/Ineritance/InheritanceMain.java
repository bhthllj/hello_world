package Ineritance;

import java.awt.*;

/**
 * Created by behat on 15/02/2017.
 */
public class InheritanceMain {

    public static void main(String[] args){
        ColoredLabel l = new ColoredLabel();
        ColoredLabel c = new ColoredLabel("Black");
        ColoredLabel b = new ColoredLabel ("Black", Color.BLACK);
        /**
         * usesless call, but checks validity
         */
        System.out.println(l);
        System.out.println(c);
        System.out.println(b);

        Room winterfield = new Room("Dios Mio", 55000);
        winterfield.setName("Winterfield");
        winterfield.setSize(20400);
        System.out.println(winterfield);

        new ToStringFromSuper();

        Room rr = new Room();
        rr.setName("Affenhausen");
        rr.setSize(765432);
        System.out.println(rr.toString());

        GameObject rg = new Room();
        rg.name = "Irrenhaus";
        System.out.println(rg.toString());

        Object ro = new Room();
        System.out.println(ro.toString());



    }
}
