package practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;

public class Collections_Properties {

    public static void writeProperties(Properties properties, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            properties.store(writer, "Stored properties");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Properties readProperties(String filePath) {
        Properties properties = new Properties();
        try (FileReader reader = new FileReader(filePath)) {
            properties.load(reader);
        } catch (IOException e) {
            System.out.println(e);
        }
        return properties;
    }
}
