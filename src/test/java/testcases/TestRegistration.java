package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.DriverSetup;

import java.time.Duration;

public class TestRegistration extends DriverSetup {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void testUserRegistrationProcess(){
        getDriver().get(registrationPage.registerPageURL);
        registrationPage.clickOnElement(registrationPage.genderMale);

    }

    @Test
    public void testRegisterText(){
        getDriver().get(registrationPage.registerPageURL);
        Assert.assertTrue(registrationPage.isElementVisible(registrationPage.registerText),"Register Text Ashe nai!!");
    }

    @Test
    public void fillUpRegistration() throws InterruptedException {

        String email = "abcd@efg.com";
        String password= "1234kkghh";

        RegistrationPage r1 = new RegistrationPage (email, password);
        r1.registrationTestProcesses(email,password);

        /*TestLogin l1 = new TestLogin(email,password);*/

        System.out.println(r1.email1);
        System.out.println(r1.password1);


























        /*getDriver().get(registrationPage.registerPageURL);

        registrationPage.clickOnElement(registrationPage.genderMale);
        registrationPage.textInput(registrationPage.inputFirstName,"Abdul");
        registrationPage.textInput(registrationPage.inputLastName,"Tonkhgk");
        registrationPage.textInput(registrationPage.dobDay,"15");
        registrationPage.selectWithVisibleText(registrationPage.dobMonth,"July");
        registrationPage.selectWithVisibleText(registrationPage.dobYear,"1998");
        registrationPage.textInput(registrationPage.inputEmail,"abdul.tonu@chikichikk.com");
        registrationPage.textInput(registrationPage.companyDetails,"tonu & Co.");
        registrationPage.textInput(registrationPage.inputPassword,"1234abcd");
        registrationPage.textInput(registrationPage.inputConfirmPassword,"1234abcd");

        registrationPage.clickOnElement(registrationPage.registerButton);

        //Assert.assertEquals(getDriver().getCurrentUrl(),registrationPage.registrationConfirmURL, " Not Matched!");

        System.out.println(getDriver().getCurrentUrl());

        registrationPage.assertAnything(registrationPage.registrationConfirmURL, registrationPage.registrationCompleteMsg, "Your registration completed");*/


    }
}
