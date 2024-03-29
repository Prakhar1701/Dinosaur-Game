package prakhar17.developer.dinosaurgame.utils;

public interface GameConstants {
    String TITLE = ConfigReader.getValue("game.title");
    int GW = Integer.parseInt(ConfigReader.getValue("game.width"));
    int GH = Integer.parseInt(ConfigReader.getValue("game.height"));
    int GB_RED = Integer.parseInt(ConfigReader.getValue("background.colour.red"));
    int GB_GREEN = Integer.parseInt(ConfigReader.getValue("background.colour.green"));
    int GB_BLUE = Integer.parseInt(ConfigReader.getValue("background.colour.blue"));
    int DELAY = 100;
    int GROUND = GH - 174;
    int GRAVITY = -25;
}
