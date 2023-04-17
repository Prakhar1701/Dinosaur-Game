package prakhar17.developer.dinosaurgame.components;

import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Ground implements GameConstants {
    private final BufferedImage groundImage;

    public Ground() throws IOException {
        groundImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/ground-dino.png")));
    }

    public void printGround(Graphics pen) throws IOException {
        BufferedImage groundSubImage = groundImage.getSubimage(1000, 0, 700, 24);
        pen.drawImage(groundSubImage, 0, 600, GW, 50, null);
    }
}
