package testCases;

import base.appFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;
import java.net.MalformedURLException;

public class LoginTest {

    private LoginPage loginPage;

    @BeforeTest
    public void setup() throws MalformedURLException {
        appFactory.initializer();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void verifyUserCreation() throws InterruptedException {
        String email = "appTest"+ RandomStringUtils.randomNumeric(10)+"@gmail.com";
        loginPage.clickCreateAccountButton();
        Assert.assertTrue(loginPage.pageHeader.isDisplayed());
        System.out.println("Email Address Page is Displayed");
        loginPage.enterValidEmailAddress(email);
        System.out.println("Email used: " + email);
        loginPage.clickContinueButton();
        Assert.assertTrue((loginPage.createPasswordHeader.isDisplayed()));
        System.out.println("Password Page is Displayed");
        loginPage.enterPassword();
        loginPage.enterConfirmPassword();
        loginPage.clickSignInButton();
        System.out.println("Creating New User Account");
//        Assert.assertTrue(loginPage.ignoreAdvertisement.isDisplayed());
//        loginPage.skipStartingAdvertisement();
//        System.out.println("skipped adv after login");
        //have to add assertion here
        loginPage.clickOnUserProfileBtn();
        System.out.println("user profile page opened up");
        loginPage.clickSignOutBtn();
        loginPage.clickConfirmLogout();
        Assert.assertTrue((loginPage.signInButton.isDisplayed()));
        System.out.println("Logged out");

    }

    @AfterTest
    public void tearDown() {
        appFactory.quitDriver();
    }
}