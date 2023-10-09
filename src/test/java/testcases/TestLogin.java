package testcases;

import org.testng.annotations.Test;
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

        getDriver().get(loginPage.loginPageURL);

        loginPage.textInput(loginPage.inputEmail,"abcd@efg.com");
        loginPage.textInput(loginPage.inputPassword,"1234kkghh");
        loginPage.clickOnElement(loginPage.loginButton);

        loginPage.assertAnything(getDriver().getCurrentUrl(), loginPage.afterLoginPage,"My account");
        loginPage.assertAnything(getDriver().getCurrentUrl(),loginPage.logOutButton,"Log out");

        loginPage.clickOnElement(loginPage.logOutButton);



    }



}
