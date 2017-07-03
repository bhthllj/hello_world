package InAndOut;

/**
 * Created by behat on 19/02/2017.
 */
public class FurnishedHouse {

    String s = "House";

    class Room {
        String s = "Room";

        class Chair{
            String s = "Chair";

            void output() {
                System.out.println(s);
                System.out.println(this.s);
                System.out.println(Chair.this.s);
                System.out.println(Room.this.s);
                System.out.println(FurnishedHouse.this.s);
            }
        }

    }

    public static void main(String[] args) {
        new FurnishedHouse().new Room().new Chair().output();
        /**
         * constructor call for the objects in nested classes:
          */
        FurnishedHouse h = new FurnishedHouse();
        FurnishedHouse.Room r = h.new Room();
        FurnishedHouse.Room.Chair c = r.new Chair();
        c.output();
    }
}
