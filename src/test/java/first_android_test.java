import configurationReader.configReader;
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

    configReader configReader;

    public first_android_test() {
        configReader = new configReader();
    }

    @BeforeTest
    public void initializer() throws MalformedURLException{
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName",configReader.getPlatformName());
        dc.setCapability("platformVersion",configReader.getPlatformVersion());
        dc.setCapability("deviceName",configReader.getDeviceName());
        dc.setCapability("automationName",configReader.getAutomationName());
        dc.setCapability("app",System.getProperty("user.dir")+ "/app/33.8.1-19611.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),dc);
        System.out.println("Opening Appium Server");
    }
    @Test
    public void clickAppButton(){
        // create your account button click
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView")).click();
        // enter new email address
        driver.findElement(By.id("com.booking:id/identity_text_input_edit_text")).sendKeys("hz@gmail.com");
        //click on continue button
        driver.findElement(By.id("com.booking:id/identity_landing_social_button_text")).click();
        //enter new password
        driver.findElement(By.id("com.booking:id/identity_text_input_edit_text")).sendKeys("123456Test");
        //click on sign in button
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")).click();

    }

//    @AfterTest
//    public void tearDown(){
//        if(null != driver){
//            driver.quit();
//        }
//    }
    }

