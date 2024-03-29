package prakhar17.developer.dinosaurgame;

import prakhar17.developer.dinosaurgame.utils.GameConstants;

import javax.swing.*;
import java.io.IOException;

public class GameFrame extends JFrame implements GameConstants {
    public GameFrame() {
        setSize(GW, GH);
        setTitle(TITLE);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            add(new Board());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
    }
}
