package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String homePageURL = "https://demo.nopcommerce.com/";
    public String homePageTitle = "nopCommerce demo store";
    public By registerPageButton = By.xpath("//a[normalize-space()='Register']");
    public By loginPageButton = By.xpath("//a[normalize-space()='Log in']");
    public By wishListButton = By.xpath("//span[@class='wishlist-label']");
    public By shoppingCartButton = By.xpath("//span[@class='cart-label']");
    public By searchBox = By.xpath("//input[@id='small-searchterms']");
    public By searchButton = By.xpath("//button[normalize-space()='Search']");
    public By subMenuCellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

}
