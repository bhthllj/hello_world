package Ineritance;

/**
 * Created by behat on 15/02/2017.
 */
public class Garage extends Room {
    private static final int MAX_SIZE = 40;

    @Override public void setSize(int size) throws IllegalArgumentException {
        if(size <= MAX_SIZE) {
            super.setSize(size);
        } else throw new IllegalArgumentException("Size must be lower than or equal to 40.");
    }
}
