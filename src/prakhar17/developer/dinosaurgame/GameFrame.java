package prakhar17.developer.dinosaurgame;

import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setSize(1300, 700);
        setTitle("Dinosaur Game");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
    }
}
