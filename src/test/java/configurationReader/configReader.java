package configurationReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configReader {
    private Properties properties;

    public configReader() {
        BufferedReader reader;
        String propertyFilePath = "configuration//Config.properties";
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getPlatformName() {
        String platformName = properties.getProperty("platformName");
        if (platformName != null) return platformName;
        else throw new RuntimeException("platformName not specified in the Configuration.properties file.");
    }

    public String getPlatformVersion() {
        String platformVersion = properties.getProperty("platformVersion");
        if (platformVersion != null) return platformVersion;
        else throw new RuntimeException("platformVersion not specified in the Configuration.properties file.");
    }

    public String getDeviceName() {
        String deviceName = properties.getProperty("deviceName");
        if (deviceName != null) return deviceName;
        else throw new RuntimeException("deviceName not specified in the Configuration.properties file.");
    }

    public String getAutomationName() {
        String automationName = properties.getProperty("automationName");
        if (automationName != null) return automationName;
        else throw new RuntimeException("automationName not specified in the Configuration.properties file.");
    }
}