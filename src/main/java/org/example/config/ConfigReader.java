package org.example.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static final String CONFIG_FILE_PATH = "src/main/java/resources/config.properties";
    private static Properties properties;
    public static void initialize() {
        properties = new Properties();
        try (InputStream input = new FileInputStream(CONFIG_FILE_PATH))
        {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getPropertyValue(String key) {
        if (properties == null) {
            initialize();
        }
        return properties.getProperty(key);
    }
   // public static String getBrowser() {
     //   if (properties == null) {
       //     initialize();
        //}
        //return properties.getProperty("browser");
    //}
}
