package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LandingPg_ComputerDatabase extends BasePage implements iComputerDBaddAcomputerPage{
    public LandingPg_ComputerDatabase(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "name" ) private WebElement cNameElement;

    @FindBy(name = "introduced" ) private WebElement introducedDateElement;

    @FindBy(name = "discontinued" ) private WebElement discontinuedDateElement;

    @FindBy(name = "company") private WebElement companyNameElement;

    @FindBy(css = ".btn.primary")   private WebElement CreateThisComputer;


    public void enterComputerName (String cName){ cNameElement.sendKeys(cName);}

   public void enterIntroducedDate (String intDate){ introducedDateElement.sendKeys(intDate);}

    public void enterDiscontinuedDate (String disDate){ discontinuedDateElement.sendKeys(disDate);}

    public void selectCompanyName(String companyName){
        //calling from BasePage

        selectFromDropDownUsingVisibleText(companyNameElement, companyName);}

    public void clickCreateThisComputer(){CreateThisComputer.click();}

    @Override
    public void testInterface() {

    }

    public void testMethod() {

    }

    {

    }

}

