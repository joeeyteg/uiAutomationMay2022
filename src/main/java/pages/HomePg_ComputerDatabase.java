package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePg_ComputerDatabase extends BasePage{
    public HomePg_ComputerDatabase(WebDriver driver) {super(driver);}
    @FindBy(linkText = "Add a new computer") private WebElement AddAnewComputer;

public void clickAddAnewComputer(){AddAnewComputer.click();}



}
