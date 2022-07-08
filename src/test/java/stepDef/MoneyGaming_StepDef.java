package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.HomePage_BBCweather;
import pages.SignUpPage_MoneyGaming;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class MoneyGaming_StepDef extends BaseUtil {
    private BaseUtil base;

    public MoneyGaming_StepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("I am on the MoneyGaming website")
    public void i_am_on_the_money_gaming_website() {
        base.driver.navigate().to("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
    }

    @When("I select a title value from the dropdown as {string},")
    public void i_select_a_title_value_from_the_dropdown_as(String myTitle) {

        SignUpPage_MoneyGaming signUpPage_moneyGaming = new SignUpPage_MoneyGaming(base.driver);

        signUpPage_moneyGaming.selectTitle(myTitle);

    }

    @When("I enter my first name as {string} and surname as {string} in the form")
    public void i_enter_my_first_name_as_and_surname_as_in_the_form(String fiName, String laName) {

        SignUpPage_MoneyGaming signUpPage_moneyGaming = new SignUpPage_MoneyGaming(base.driver);
        signUpPage_moneyGaming.enterFirsName(fiName);
        signUpPage_moneyGaming.enterLasName(laName);

    }

    @When("I check the tickbox with text {string}")
    public void i_check_the_tickbox_with_text(String string) {

        SignUpPage_MoneyGaming signUpPage_moneyGaming = new SignUpPage_MoneyGaming(base.driver);
        signUpPage_moneyGaming.tickAcceptTnC();

    }

    @When("Submit the form by clicking the  JOIN NOW button")
    public void submit_the_form_by_clicking_the_join_now_button() {
        SignUpPage_MoneyGaming signUpPage_moneyGaming = new SignUpPage_MoneyGaming(base.driver);
        signUpPage_moneyGaming.clickJOINNOW();

    }

    @Then("A validation message with text {string} should appears under the date of birth box")
    public void a_validation_message_with_text_should_appears_under_the_date_of_birth_box(String restrictionERROR) {

        assertThat(By.xpath("//label[@for='dob']").findElement(base.driver).isDisplayed(), equalTo(true));

    }


}


