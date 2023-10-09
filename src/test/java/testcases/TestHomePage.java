package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.DriverSetup;

import java.time.Duration;

public class TestHomePage extends DriverSetup {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void testHomePageTitle(){
        getDriver().get(homePage.homePageURL);
        Assert.assertEquals(getDriver().getTitle(), homePage.homePageTitle, "Title Not Matched!");
    }

    @Test
    public void testRegistrationPageURL(){
        getDriver().get(homePage.homePageURL);

        homePage.clickOnElement(homePage.registerPageButton);
        Assert.assertTrue(homePage.isElementVisible(homePage.registerPageButton));
        Assert.assertEquals(getDriver().getCurrentUrl(),registrationPage.registerPageURL, " Not Matched!");

    }

    @Test
    public void testLoginPageURL(){
        getDriver().get(homePage.homePageURL);
        homePage.clickOnElement(homePage.loginPageButton);
        Assert.assertTrue(homePage.isElementVisible(homePage.loginPageButton));
        Assert.assertEquals(getDriver().getCurrentUrl(),loginPage.loginPageURL, " Not Matched!");

    }

    public void waitForElementToBeClickable(By locator){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}
