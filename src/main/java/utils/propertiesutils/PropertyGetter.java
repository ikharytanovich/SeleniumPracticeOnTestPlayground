package utils.propertiesutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyGetter {
    private static final String PROPERTIES_SRC = "src/main/resources/configuration.properties";
    private static final Properties properties = new Properties();

    private PropertyGetter() {
    }

    public static void setUp() {
        try (InputStream inputStream = new FileInputStream(PROPERTIES_SRC)) {
            properties.load(inputStream);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyByName(PropertyName name) {
        return properties.getProperty(name.getValue());
    }
}
