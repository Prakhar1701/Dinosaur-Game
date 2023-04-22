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
    private int y;
    private boolean isJumping;

    public boolean isJumping() {
        return isJumping;
    }

    public Dinosaur() throws IOException {
        spriteImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/sprite-dino.png")));
        dinosaurRunImages = new BufferedImage[4];
        loadRunImages();
        index = 0;
        y = GROUND; //On Ground
        isJumping = false;
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
        pen.drawImage(currentRunImage, GW - 1100, y, currentRunImage.getWidth(), currentRunImage.getHeight(), null);
        index++;
    }

    public void jump() {
        if (isJumping) return;
        int jumpForce = 250;
        y = y - jumpForce;
        isJumping = true;
    }

    public void fall() {
        if (y < GROUND) {
            y = y - GRAVITY;
        } else if (y == GROUND) {
            isJumping = false;
        }
    }
}