package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.stream.StreamSupport;

import static utilities.DriverSetup.getDriver;

public class RegistrationPage extends BasePage{

    public String email1;
    public String password1;

    public RegistrationPage(String email, String password) {
        this.email1 = email;
        this.password1 = password;
    }
    public RegistrationPage() {

    }

    public String registerPageURL = "https://demo.nopcommerce.com/register?returnUrl=%2F";
    public String registerPageTitle = "nopCommerce demo store. Register";
    public By registerText = By.xpath("//h1[normalize-space()='Register']");
    public By genderMale = By.xpath("//label[normalize-space()='Male']");
    public By genderFemale = By.xpath("//label[normalize-space()='Female']");
    public By inputFirstName = By.xpath("//input[@id='FirstName']");
    public By inputLastName = By.xpath("//input[@id='LastName']");
    public By dobDay = By.xpath("//select[@name='DateOfBirthDay']");
    public By dobMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    public By dobYear = By.xpath("//select[@name='DateOfBirthYear']");
    public By inputEmail = By.xpath("//input[@id='Email']");
    public By companyDetails = By.xpath("//input[@id='Company']");
    public By newsLetterCheckBox = By.xpath("//input[@id='Newsletter']");
    public By inputPassword = By.xpath("//input[@id='Password']");
    public By inputConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    public By registerButton = By.xpath("//button[@id='register-button']");

    public String registrationConfirmURL = "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";

    public By registrationCompleteMsg = By.xpath("//div[@class='result']");


    public void registrationTestProcesses(String email, String password){

         getDriver().get(registerPageURL);
         clickOnElement( genderMale);
         textInput( inputFirstName,"Abdul");
         textInput( inputLastName,"Tonkhgk");
         textInput( dobDay,"15");
         selectWithVisibleText( dobMonth,"July");
         selectWithVisibleText( dobYear,"1998");
         textInput( inputEmail,email);
         textInput( companyDetails,"tonu & Co.");
         textInput( inputPassword,password);
         textInput( inputConfirmPassword,password);

         clickOnElement( registerButton);

         //new RegistrationPage(email,password);

        //Assert.assertEquals(getDriver().getCurrentUrl(), registrationConfirmURL, " Not Matched!");

         assertAnything( registrationConfirmURL,  registrationCompleteMsg, "Your registration completed");
    }

}


