package prakhar17.developer.dinosaurgame.components;

import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Cactus implements GameConstants {
    private final BufferedImage spriteImage;
    private final BufferedImage[] cactus;
    private final int randomObsNo;
    private int x;

    public Cactus() throws IOException {
        spriteImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/sprite-dino.png")));
        cactus = new BufferedImage[6];
        loadObstacleCactus();
        randomObsNo = (int) (Math.random() * 10);
        x = GW;
    }

    private void loadObstacleCactus() {
        cactus[0] = spriteImage.getSubimage(445, 1, 35, 72);
        cactus[1] = spriteImage.getSubimage(480, 1, 68, 72);
        cactus[2] = spriteImage.getSubimage(548, 1, 103, 72);
        cactus[3] = spriteImage.getSubimage(651, 1, 51, 98);
        cactus[4] = spriteImage.getSubimage(702, 1, 100, 98);
        cactus[5] = spriteImage.getSubimage(802, 1, 151, 98);
    }

    private void printObstacleCactus(Graphics pen, int obsNo) {
        BufferedImage obstacle = cactus[obsNo - 1];
        switch (obsNo) {
            case 1, 2, 3 -> pen.drawImage(obstacle, x, GROUND + 22, obstacle.getWidth(), obstacle.getHeight(), null);
            case 4, 5 -> pen.drawImage(obstacle, x, GROUND - 2, obstacle.getWidth(), obstacle.getHeight(), null);
            case 6 -> pen.drawImage(obstacle, x, GROUND - 4, obstacle.getWidth(), obstacle.getHeight(), null);
        }
    }

    public void printRandomObstacleCactus(Graphics pen) {
        switch (randomObsNo) {
            case 0, 1 -> printObstacleCactus(pen, 1);
            case 2, 3 -> printObstacleCactus(pen, 2);
            case 4, 5 -> printObstacleCactus(pen, 3);
            case 6, 7 -> printObstacleCactus(pen, 4);
            case 8 -> printObstacleCactus(pen, 5);
            case 9 -> printObstacleCactus(pen, 6);
        }
    }

    public void moveObstacleCactusBySpeed(int speed) {
        x = x - speed;
    }
}
