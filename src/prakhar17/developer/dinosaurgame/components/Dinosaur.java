package prakhar17.developer.dinosaurgame.components;

import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Dinosaur implements GameConstants {
    private final BufferedImage spriteImage;
    private final BufferedImage[] dinosaurRunImages;
    private int index;

    public Dinosaur() throws IOException {
        spriteImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/sprite-dino.png")));
        dinosaurRunImages = new BufferedImage[4];
        loadRunImages();
        index = 0;
    }

    private void loadRunImages() {
        dinosaurRunImages[0] = spriteImage.getSubimage(1338, 1, 89, 96);
        dinosaurRunImages[1] = spriteImage.getSubimage(1425, 1, 89, 96);
        dinosaurRunImages[2] = spriteImage.getSubimage(1513, 1, 89, 96);
        dinosaurRunImages[3] = spriteImage.getSubimage(1601, 1, 89, 96);
    }

    public void printRun(Graphics pen) {
        if (index > 3) {
            index = 0;
        }
        BufferedImage currentRunImage = dinosaurRunImages[index];
        pen.drawImage(currentRunImage, GW - 1100, GH - 174, currentRunImage.getWidth(), currentRunImage.getHeight(), null);
        index++;
    }
}
