package Ineritance;

/**
 * Created by behat on 15/02/2017.
 */
public class Room extends GameObject {

    private int size;
    private String name;

    public Room() {
        //Room clinic = new Room();
        //clinic.name = "Clinic";
        //clinic.size = 15800;
    }

    public Room(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
    @Override public String toString() {
        return String.format("Room[name=%s, size=%d]", name, size);
    }


}
