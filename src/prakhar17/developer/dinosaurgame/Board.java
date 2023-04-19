package prakhar17.developer.dinosaurgame;

import prakhar17.developer.dinosaurgame.components.*;
import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Board extends JPanel implements GameConstants {
    private final Ground ground;
    private final Top top;
    private final Dinosaur dino;
    private final Cloud cloud;
    private final Cactus obstacle;
    private final int speed;


    protected Board() throws IOException {
        gameLoop();
        speed = 50;

        top = new Top();
        dino = new Dinosaur();
        ground = new Ground();
        cloud = new Cloud();
        obstacle = new Cactus();

        setFocusable(true);
        bindEvents();
    }

    @Override
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        printBackground(pen);
        cloud.printCloud(pen);
        dino.printRun(pen);
        ground.moveGroundBySpeed(speed);
        obstacle.printRandomObstacleCactus(pen);
        obstacle.moveObstacleCactusBySpeed(speed);

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

        dino.fall();
    }

    private void printBackground(Graphics pen) {
        pen.setColor(new Color(GB_RED, GB_GREEN, GB_BLUE));
        pen.fillRect(0, 0, GW, GH);
    }

    private void gameLoop() {
        new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        }).start();
    }

    private void bindEvents() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    dino.jump();
                }
            }
        });
    }
}