package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_NewTours extends BasePage{
    public HomePage_NewTours(WebDriver driver) {
        super(driver);
    }

   @FindBy(linkText = "SIGN-ON")private WebElement signOnLink;
    @FindBy(linkText = "REGISTER")private WebElement RegisterLink;
   @FindBy(linkText = "SUPPORT")private WebElement SupportLink;
   @FindBy(linkText = "CONTACT")private WebElement ContactLink;

  public void clickSignOnLink(){ signOnLink.click();}
    public void clickRegisterLink(){ RegisterLink.click();}
   public void clickSupportLink(){ SupportLink.click();}
   public void clickContactLink(){ ContactLink.click();}

}
