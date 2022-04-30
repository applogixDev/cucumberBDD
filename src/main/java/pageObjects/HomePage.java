package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
   WebDriver driver;
   //locators
   @FindBy(linkText = "Log in") public WebElement loginLink;

   @FindBy(linkText = "Register") public WebElement registerLink;

   @FindBy(id="small-searchterms") public WebElement searchTextBox;

   @FindBy(className = "search-box-button") public WebElement searchButton;

   @FindBy(linkText = "Log out") public WebElement logoutLink;




   //constructor
   public HomePage(WebDriver driver)
   {
      this.driver = driver;
      PageFactory.initElements(driver,this);
   }




   //actions - methods
   public void clickLoginLink()
   {
      loginLink.click();
   }

   public void clickRegisterLink()
   {
      registerLink.click();
   }

   public void enterSearchText(String item)
   {
      searchTextBox.sendKeys(item);
   }


   public void clickSearchButton()
   {
      searchButton.click();
   }


   public boolean verifyLogout()
   {
      return logoutLink.isDisplayed();
   }





}
