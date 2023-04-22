package prakhar17.developer.dinosaurgame.components;

import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class GameOver implements GameConstants {
    private final BufferedImage spriteImage;
    private final BufferedImage gameOverImage;

    public GameOver() throws IOException {
        spriteImage = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/sprite-dino.png")));
        gameOverImage = spriteImage.getSubimage(953, 27, 385, 24);
    }

    public void printGameOver(Graphics pen) {
        int x = (GW - gameOverImage.getWidth()) / 2;
        pen.drawImage(gameOverImage, x, 300, gameOverImage.getWidth(), gameOverImage.getHeight(), null);
    }
}
