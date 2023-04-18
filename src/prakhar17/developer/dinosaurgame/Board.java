package prakhar17.developer.dinosaurgame;

import prakhar17.developer.dinosaurgame.components.Ground;
import prakhar17.developer.dinosaurgame.components.Top;
import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Board extends JPanel implements GameConstants {
    private final Ground ground;
    private Top top;
    private int gameSpeed;

    protected Board() {
        gameLoop();
        gameSpeed = 50;

        top = new Top();

        try {
            ground = new Ground();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        printBackground(pen);

        try {
            top.printTop(pen);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            ground.printGround(pen);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void printBackground(Graphics pen) {
        pen.setColor(new Color(GB_RED, GB_GREEN, GB_BLUE));
        pen.fillRect(0, 0, GW, GH);
    }

    private void gameLoop() {
        new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ground.moveGroundBySpeed(gameSpeed);
                repaint();
            }
        }).start();
    }
}
