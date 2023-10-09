package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static utilities.DriverSetup.getDriver;

public class BasePage {

    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void clickOnElement(By locator){
        getElement(locator).click();
    }

    public void textInput(By locator, String text){
        getElement(locator).sendKeys(text);
    }

    public boolean isElementVisible(By locator){
        return getElement(locator).isDisplayed();

    }

    public void selectWithVisibleText(By selectLocator, String visibleText){
        Select select = new Select(getElement(selectLocator));
        select.selectByVisibleText(visibleText);
    }

    public void assertAnything(String URL, By locator, String text){

        Assert.assertEquals(getDriver().getCurrentUrl(),URL," Not Matched!!");
        Assert.assertEquals(text,getElement(locator).getText()," Not Matched!!");
    }

}
