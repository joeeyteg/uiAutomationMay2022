package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage_MoneyGaming extends BasePage{
    public SignUpPage_MoneyGaming(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//select[@name='map(title)']") private WebElement titleElement;
    @FindBy(xpath = "//*[@name='map(firstName)']") private WebElement fstNameElement;
    @FindBy(xpath = "//*[@name='map(lastName)']") private WebElement lstNameElement;
    @FindBy(xpath = "//*[@class='required checkbox terms']") private WebElement checkBoxElement;
    @FindBy(xpath = "//*[@alt='Join Now']") private WebElement joinNowElement;





    public void selectTitle(String myTitle){
        Select select = new Select(titleElement);
        select.selectByVisibleText("Mr");
    }

    public void enterFirsName(String fiName){ fstNameElement.sendKeys(fiName);}
    public void enterLasName(String laName){ lstNameElement.sendKeys(laName);}

   public void tickAcceptTnC() {checkBoxElement.click();}

    public void clickJOINNOW(){ joinNowElement.click();}

}
