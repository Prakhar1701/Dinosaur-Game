package prakhar17.developer.dinosaurgame.components;

import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Ground implements GameConstants {
    private final BufferedImage groundImage;
    private int x;

    public Ground() throws IOException {
        groundImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/ground-dino.png")));
    }

    public void moveGroundBySpeed(int speed) {
        x = x + speed;
        if (groundImage.getWidth() - x < GW) {
            x = 0;
        }
    }

    public void printGround(Graphics pen) throws IOException {
        BufferedImage groundSubImage = groundImage.getSubimage(x, 0, GW, 24);
        pen.drawImage(groundSubImage, 0, GH - 100, GW, 50, null);
    }
}
