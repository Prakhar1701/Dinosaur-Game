package prakhar17.developer.dinosaurgame.components;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Cloud {
    private final BufferedImage spriteImage;
    private final BufferedImage cloud;
    private int index;

    public Cloud() throws IOException {
        spriteImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/sprite-dino.png")));
        cloud = spriteImage.getSubimage(164, 0, 96, 31);
        index = 0;
    }

    public void printCloud(Graphics pen) {
        pen.drawImage(cloud, 300, 300, cloud.getWidth(), cloud.getHeight(), null);
        pen.drawImage(cloud, 600, 350, cloud.getWidth(), cloud.getHeight(), null);
        pen.drawImage(cloud, 1000, 250, cloud.getWidth(), cloud.getHeight(), null);
    }
}
