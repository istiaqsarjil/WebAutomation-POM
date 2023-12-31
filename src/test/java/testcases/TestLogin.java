package testcases;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import utilities.DriverSetup;


public class TestLogin extends DriverSetup {

    LoginPage loginPage = new LoginPage();

    /*public String email2, password2;

    public TestLogin(String email2, String password2) {
        this.email2 = email2;
        this.password2 = password2;
    }*/

   @Test
    public void testLoginProcess(){

       RegistrationPage registrationpage = new RegistrationPage();
       HomePage homePage = new HomePage();

       /*String emailFromReg = testRegistration.getEmail();
       String passwordFromReg = testRegistration.getPassword();*/

        getDriver().get(loginPage.loginPageURL);

        loginPage.textInput(loginPage.inputEmail,registrationpage.email);
        loginPage.textInput(loginPage.inputPassword,registrationpage.password);
        loginPage.clickOnElement(loginPage.loginButton);

        loginPage.assertAnything(homePage.homePageURL, loginPage.afterLoginPage,"My account");
        loginPage.assertAnything(homePage.homePageURL, loginPage.logOutButton,"Log out");

        loginPage.clickOnElement(loginPage.logOutButton);

    }



}
