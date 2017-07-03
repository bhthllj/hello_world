package Konstruktoren;

/**
 * Created by behat on 14/02/2017.
 */
public class Dungeon {

    public Dungeon() {
        System.out.println("2. Konstruktor");
    }

    public void play() {
        System.out.println("4. Spielen");
    }


    public static void main(String[] args) {
        System.out.println("1. Vor dem Konstruktor");
        Dungeon d = new Dungeon();
        System.out.println("3. Nach dem Konstruktor");
        d.play();

        Player patrick = new Player();
        patrick.name = "Patrick Starfish";
        patrick.item = "Knot";

        Player tryck = new Player(patrick);
        System.out.println(tryck.name);
        System.out.println(tryck.item);

        Logger.getInstance().log("Log me ya filthy animal!");

        System.out.println(LateConstant.HUBBLE);
        System.out.println(new LateConstant().ISBN);

        System.out.println(InputExample.HOWEASY);
        System.out.println(InputExample.lyric);
        System.out.println(new InputExample("How High?").lyric);


    }



}
