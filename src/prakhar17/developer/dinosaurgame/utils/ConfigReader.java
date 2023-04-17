package prakhar17.developer.dinosaurgame.utils;

import java.util.ResourceBundle;

public class ConfigReader {
    private static final ResourceBundle rb = ResourceBundle.getBundle("resource/config");

    public static String getValue(String key) {
        return rb.getString(key);
    }
}
