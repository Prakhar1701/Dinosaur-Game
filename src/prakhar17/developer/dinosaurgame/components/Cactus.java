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

    public Cactus() throws IOException {
        spriteImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/sprite-dino.png")));
        cactus = new BufferedImage[6];
        loadObstacleCactus();
    }

    private void loadObstacleCactus() {
        cactus[0] = spriteImage.getSubimage(445, 1, 35, 72);
        cactus[1] = spriteImage.getSubimage(480, 1, 68, 72);
        cactus[2] = spriteImage.getSubimage(548, 1, 103, 72);
        cactus[3] = spriteImage.getSubimage(651, 1, 51, 98);
        cactus[4] = spriteImage.getSubimage(702, 1, 100, 98);
        cactus[5] = spriteImage.getSubimage(802, 1, 151, 98);
    }

    public void printObstacleCactus(Graphics pen, int obsNo) {
        BufferedImage obstacle = cactus[obsNo - 1];
        switch (obsNo) {
            case 1, 2, 3 -> pen.drawImage(obstacle, 1000, GROUND + 22, obstacle.getWidth(), obstacle.getHeight(), null);
            case 4, 5 -> pen.drawImage(obstacle, 1000, GROUND - 2, obstacle.getWidth(), obstacle.getHeight(), null);
            case 6 -> pen.drawImage(obstacle, 1000, GROUND - 4, obstacle.getWidth(), obstacle.getHeight(), null);
        }
    }
}
