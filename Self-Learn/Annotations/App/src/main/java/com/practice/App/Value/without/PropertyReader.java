package com.practice.App.Value.without;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    private Properties properties = new Properties();

    public PropertyReader(String fileName) {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(fileName)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + fileName);
                return;
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}

/**
 * PropertyReader class is a utility to manually read properties from a properties file.

 * Constructor: PropertyReader(String fileName)
     * Loads the properties file specified by fileName.
     * Uses ClassLoader.getResourceAsStream(fileName) to locate and load the properties file from the classpath.
     * If the file is not found, it prints an error message.
     * If the file is found, it loads the properties into a Properties object.

 * Method: getProperty(String key)
     * Retrieves the value associated with the given key from the loaded properties.
 */