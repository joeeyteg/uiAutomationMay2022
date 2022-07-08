package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ConfirmationPage_ComputerDatabase;
import pages.HomePg_ComputerDatabase;
import pages.LandingPg_ComputerDatabase;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GapPurchase_StepDef extends BaseUtil {
    private BaseUtil base;

    public GapPurchase_StepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the GAP homepage,")
    public void i_am_on_the_gap_homepage() {
        base.driver.get("https://www.gap.co.uk/");

    }

    @When("I pick one item from the Summer Essentials under the {string} category,")
    public void i_pick_one_item_from_the_summer_essentials_under_the_category(String women) throws InterruptedException {

        WebElement womenSection = base.driver.findElement(By.xpath("//div['navigation__category-name']/div[contains(text(),'Women')]"));
        //mouse actions tricks
        Actions actionProvider = new Actions(base.driver);
        actionProvider.moveToElement(womenSection).build().perform();
        Thread.sleep(4000);
        List<WebElement> womenSummerEssentials = base.driver.findElements(By.xpath("//div[contains(text(),'Summer Essentials')]"));

        womenSummerEssentials.get(0).click();
    }

    @When("I choose the first item from the list,")
    public void i_choose_the_first_item_from_the_list() {

        //close pop up
        base.driver.findElement(By.cssSelector("svg.email-popup-close")).click();

        //click on the first item

        base.driver.findElements(By.xpath("//div[@class='product-promo']")).get(0).click();
    }
    @When("I click on the {string} button")
    public void i_click_on_the_button(String string) {

        base.driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
    }
    @Then("I should see an error message displayed as {string}")
    public void i_should_see_an_error_message_displayed_as(String errorMessage) {

      assertThat(base.driver.findElement(By.xpath("//div[@class='cart-error-container']")).isDisplayed(), equalTo(true));



    }



}
