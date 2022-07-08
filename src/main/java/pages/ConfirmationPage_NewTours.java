package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ConfirmationPage_NewTours extends BasePage {
    public ConfirmationPage_NewTours(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//b") private List<WebElement> messages;

    public String getAcknowledgementMessage(){ return messages.get(1).getText(); }

}
