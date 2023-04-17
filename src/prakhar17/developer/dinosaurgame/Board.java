package prakhar17.developer.dinosaurgame;

import prakhar17.developer.dinosaurgame.components.Ground;
import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Board extends JPanel implements GameConstants {

    Board() {
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        printBackground(pen);

        try {
            new Ground().printGround(pen);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void printBackground(Graphics pen) {
        pen.setColor(new Color(GB_RED, GB_GREEN, GB_BLUE));
        pen.fillRect(0, 0, GW, GH);
    }
}
