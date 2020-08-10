package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

class Collections_PropertiesTest {

    private final static String filePath = "/Users/matusek/Downloads/configuration.properties";

    @Test
    void When_FileIsWritten_Then_DataReturnedWhenRead() {
        Properties properties = new Properties();
        properties.put("email", "tomas.matusek@hotmail.co.uk");
        properties.put("name", "Tomas Matusek");
        Collections_Properties.writeProperties(properties, filePath);

        Properties readProperties = Collections_Properties.readProperties(filePath);
        Assertions.assertEquals("tomas.matusek@hotmail.co.uk", readProperties.getProperty("email"));
        Assertions.assertEquals("Tomas Matusek", readProperties.getProperty("name"));
    }
}