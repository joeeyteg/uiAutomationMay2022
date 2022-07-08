package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_BBCweather extends BasePage {
    public HomePage_BBCweather(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@type='text']")
    private WebElement searchFieldElement;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement searchIconElement;


    @FindBy(xpath = "//span[@class='wr-day-temperature__high-value']")
    private WebElement highTempElement;

    @FindBy(xpath = "//span[@class='wr-day-temperature__low-value']")
    private WebElement lowTempElement;


    //////////////////actions//////////

    public void enterOnSearchField(String myCity) {searchFieldElement.sendKeys(myCity);}

    public void clickSearchIcon() {searchIconElement.click();}


    public void tomorrowHighs(String High) {highTempElement.getDomAttribute(High);}

    public void tomorrowLows(String Low) {lowTempElement.getDomAttribute(Low);}


}




