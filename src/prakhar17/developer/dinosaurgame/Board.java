package prakhar17.developer.dinosaurgame;

import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel implements GameConstants {

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        printBackground(pen);
    }

    private void printBackground(Graphics pen) {
        pen.setColor(new Color(GB_RED, GB_GREEN, GB_BLUE));
        pen.fillRect(0, 0, GW, GH);
    }
}
