import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class first_android_test {
    AppiumDriver driver;

    @BeforeTest
    public void initializer() throws MalformedURLException{
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","11");
        dc.setCapability("deviceName","emulator-5554");
        dc.setCapability("automationName","Appium");
        dc.setCapability("app",System.getProperty("user.dir")+ "/app/33.8.1-19611.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),dc);
        System.out.println("Opening Appium Server");
    }
    @Test
    public void clickAppButton(){
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView")).click();
    }

    @AfterTest
    public void tearDown(){
        if(null != driver){
            driver.quit();
        }
    }
    }

