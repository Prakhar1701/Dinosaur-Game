package prakhar17.developer.dinosaurgame.components;

import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Top implements GameConstants {

    public void printTop(Graphics pen) throws Exception {
        printLineDivider(pen);
        printGameLogo(pen);
    }

    private void printLineDivider(Graphics pen) {
        Graphics2D pen2D = (Graphics2D) pen;
        pen2D.setColor(new Color(83, 83, 83));
        pen2D.setStroke(new BasicStroke(5));
        pen2D.drawLine(0, GH - 500, GW, GH - 500);
    }

    private void printGameLogo(Graphics pen) throws IOException {
        BufferedImage gameLogo = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resource/logo-dino.png")));
        pen.drawImage(gameLogo, 100, 25, gameLogo.getWidth(), gameLogo.getHeight(), null);
    }

}
