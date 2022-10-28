package pages;

import base.appDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(appDriver.getDriver()), this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    public WebElement createAccountButton;

    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement pageHeader;

    @FindBy(id = "com.booking:id/identity_text_input_edit_text")
    public WebElement emailAddress;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement continueButton;

    @FindBy(id = "com.booking:id/identity_header_title")
    public WebElement createPasswordHeader;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    public WebElement password;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText")
    public WebElement confirmPassword;

    @FindBy(id = "com.booking:id/identity_landing_social_button_text")
    public WebElement signInButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.Button")
    public WebElement ignoreAdvertisement;

    @FindBy(xpath = "/android.widget.FrameLayout[@content-desc='Profile']/android.widget.ImageView")
    public WebElement userProfileButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView")
    public WebElement logOutButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[11]/android.widget.TextView")
    public WebElement confirmLogOut;

    @FindBy(xpath = "/android.widget.FrameLayout[@content-desc='Profile']/android.widget.ImageView")
    public WebElement getSignOutTitle;

    By by_createAccountButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView");
    By by_pageHeader = By.id("com.booking:id/identity_header_title");
    By by_confirmPasswordField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    By by_passwordField = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
    By by_userProfileButton = By.xpath("/android.widget.FrameLayout[@content-desc='Profile']/android.widget.ImageView");

    public void clickCreateAccountButton() {
        new WebDriverWait(appDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_createAccountButton));
        createAccountButton.click();
    }

    public void enterValidEmailAddress(String email) {
        new WebDriverWait(appDriver.getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(by_pageHeader));
        emailAddress.sendKeys(email);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void enterPassword() {
        new WebDriverWait(appDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_passwordField));
        password.sendKeys("Thunder27$");
    }

    public void enterConfirmPassword() {
        new WebDriverWait(appDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_confirmPasswordField));
        confirmPassword.sendKeys("Thunder27$");
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickOnUserProfileBtn() {
        new WebDriverWait(appDriver.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(by_userProfileButton));
        userProfileButton.click();
    }
    public void clickSignOutBtn() {
        logOutButton.click();
    }
    public void clickConfirmLogout() {
        confirmLogOut.click();
    }

}