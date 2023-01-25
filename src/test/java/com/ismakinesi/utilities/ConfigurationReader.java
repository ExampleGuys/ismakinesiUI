package com.ismakinesi.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;
    static {

        try {
            String path = "configuration.properties";

            FileInputStream file = new FileInputStream(path);

            properties= new Properties();
            properties.load(file);

            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    This method accepts the key and returns the value
    public static String get(String key){

        return properties.getProperty(key);
    }

}
