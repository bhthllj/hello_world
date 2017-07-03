package NothingComparesToYou;
import java.util.*;

/**
 * Created by behat on 28/03/2017.
 */
public class RoomComparator implements Comparator<Room> {

    @Override public int compare(Room room1, Room room2) {
        return room1.sm - room2.sm;
    }
}
