package base;
import configurationReader.configReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class appFactory {

    public static AppiumDriver driver;
    public static DesiredCapabilities capabilities;
    public static configReader configReader;
    ;

    public static void initializer() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        configReader = new configReader();
        capabilities.setCapability("platformName", configReader.getPlatformName());
        capabilities.setCapability("platformVersion", configReader.getPlatformVersion());
        capabilities.setCapability("deviceName", configReader.getDeviceName());
        capabilities.setCapability("automationName", configReader.getAutomationName());
        capabilities.setCapability("app", System.getProperty("user.dir") + "/app/33.8.1-19611.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
        appDriver.setDriver(driver);
        System.out.println("Android driver is set");
    }

    public static void quitDriver() {
        if (null != driver) {
            driver.quit();
        }
    }
}
