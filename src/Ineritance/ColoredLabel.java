package Ineritance;
import java.awt.Color;
import javax.swing.JLabel;

/**
 * Created by behat on 15/02/2017.
 */
public class ColoredLabel extends JLabel {

    private String label;

    public ColoredLabel() {
        initialize(Color.BLACK);
    }

    public ColoredLabel(String label) {
        super(label);
        initialize(Color.BLACK);
    }

    public ColoredLabel (String label, Color color) {
        setForeground(color);
    }

    private void initialize(Color color) {
        setForeground(color);
    }
}
