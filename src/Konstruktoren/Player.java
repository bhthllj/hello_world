package Konstruktoren;

/**
 * Created by behat on 14/02/2017.
 */
public class Player {

    public String name;
    public String item;

    public Player(){};

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String item) {
        this.name = name;
        this.item = item;
    }

    public Player(Player player) {
        name = player.name;
        item = player.item;
    }

    //Player spoderman = new Player("Spoderman");

    //Player ironman = new Player("Ironman", "Suit");
}

