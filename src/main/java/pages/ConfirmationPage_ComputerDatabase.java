package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ConfirmationPage_ComputerDatabase extends BasePage {
    public ConfirmationPage_ComputerDatabase(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='alert-message warning']") private List<WebElement> messages;

    public String getDoneAcknowledgement(){ return messages.get(0).getText(); }

}
