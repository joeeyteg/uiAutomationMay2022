package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage_NewTours extends BasePage{
    public RegisterPage_NewTours(WebDriver driver) {
        super(driver);
    }

    //finding elements below
@FindBy(name = "firstName" ) private WebElement firstNameElement;
    @FindBy(name = "lastName") private WebElement lastNameElement;
    @FindBy(name = "phone") private WebElement phoneElement;
    @FindBy(name = "userName") private WebElement emailElement;
    @FindBy(name = "address1") private WebElement addressElement;
    @FindBy(name = "city") private WebElement cityElement;
    @FindBy(name = "state") private WebElement stateProvinceElement;
    @FindBy(name = "postalCode") private WebElement postalCodeElement;
    @FindBy(name = "country") private WebElement countryElement;
    @FindBy(id = "email")  private WebElement userNameElement;
    @FindBy(xpath = "//input[@name='password']") private WebElement passWordElement;
    @FindBy(css = "input[name='confirmPassword']")private WebElement confirmPasswordElement;
    @FindBy(name = "submit") private WebElement submitButtonElement;

    //creating methods below
    public void enterFirstName(String fstName){ firstNameElement.sendKeys(fstName);}
    public void enterLastName(String lstName){ lastNameElement.sendKeys(lstName);}
    public void enterPhoneNumber(String pNumber){ phoneElement.sendKeys(pNumber);}
    public void enterEmail(String myEmail){ emailElement.sendKeys(myEmail);}
    public void enterAddress(String myAddress){ addressElement.sendKeys(myAddress);}
    public void enterCity(String myCity){ cityElement.sendKeys(myCity);}
    public void enterState(String myState){ stateProvinceElement.sendKeys(myState);}
    public void enterPostCode(String myPostCode){ postalCodeElement.sendKeys(myPostCode);}

    public void selectCountry(String myCountry){
            //make Select an object below
        Select select = new Select(countryElement);
        select.selectByVisibleText(myCountry);
    }

    public void enterUserName(String userName){ userNameElement.sendKeys(userName);}
    public void enterPassword(String passWord){ passWordElement.sendKeys(passWord);}
    public void confirmPassword(String confirmPassword){ confirmPasswordElement.sendKeys(confirmPassword);}
    public void clickSubmitButton(){ submitButtonElement.click();}



}
