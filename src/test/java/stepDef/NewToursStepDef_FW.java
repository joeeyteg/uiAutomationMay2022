package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.ConfirmationPage_NewTours;
import pages.HomePage_NewTours;
import pages.RegisterPage_NewTours;
import utilities.EncapsulationCLASS;
import utilities.PropertiesReader;
import utilities.Utility;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewToursStepDef_FW extends BaseUtil {
    private BaseUtil base;

    public NewToursStepDef_FW(BaseUtil base) {
        this.base = base;
    }


    @Given("I am on the NewTours homepage,")
    public void i_am_on_the_new_tours_homepage() throws IOException {
     //   base.driver.navigate().to("https://demo.guru99.com/selenium/newtours");
        PropertiesReader propertiesReader=new PropertiesReader();
        base.driver.get(propertiesReader.getNewToursURL());

    }

    @When("I click on the Register link,")
    public void i_click_on_the_register_link() {
        HomePage_NewTours homePage_newTours = new HomePage_NewTours(base.driver);
        homePage_newTours.clickRegisterLink();


    }
    @When("I enter contact information of {string}, {string},{string},{string},")
    @When("I enter firstname as {string}, lastname as {string}, phone as {string}, email as {string},")
    public void i_enter_firstname_as_lastname_as_phone_as_email_as(String fstName, String lstName, String pNumber, String myEmail) {

        //using setter
        EncapsulationCLASS.setRandomNumbers(Utility.generateFiveRandomNumbers());


        //creating object of class
        RegisterPage_NewTours registerPage_newTours = new RegisterPage_NewTours(base.driver);
        //calling methods for actions
        registerPage_newTours.enterFirstName(fstName);
        registerPage_newTours.enterLastName(lstName);
        registerPage_newTours.enterPhoneNumber(pNumber);
        registerPage_newTours.enterEmail(myEmail);


    }

    @When("I enter mailing information of {string},{string},{string},{string},{string}")
    @When("I enter address as {string}, city as {string}, state as {string}, postal code as {string}, select country as {string}")
    public void i_enter_address_as_city_as_state_as_postal_code_as_select_country_as(String myAddress, String myCity, String myState, String myPostCode, String myCountry) {

        //using Getter
        System.out.println("Random Numbers:"+ EncapsulationCLASS.getRandomNumber());


        //creating object of class
        RegisterPage_NewTours registerPage_newTours = new RegisterPage_NewTours(base.driver);

        //calling actions
        registerPage_newTours.enterAddress(myAddress + EncapsulationCLASS.getRandomNumber());
        registerPage_newTours.enterCity(myCity);
        registerPage_newTours.enterState(myState);
        registerPage_newTours.enterPostCode(myPostCode);
        registerPage_newTours.selectCountry(myCountry);




    }
    @And("I enter User information as {string} and {string},")
    public void iEnterUserInformationAsAnd(String userName, String passWord) {

        RegisterPage_NewTours registerPage_newTours = new RegisterPage_NewTours(base.driver);

        registerPage_newTours.enterUserName(userName);
        registerPage_newTours.enterPassword(passWord);
        registerPage_newTours.confirmPassword(passWord);
    }

    @When("I click on the submit button,")
    public void i_click_on_the_submit_button() {
        RegisterPage_NewTours registerPage_newTours = new RegisterPage_NewTours(base.driver);

        registerPage_newTours.clickSubmitButton();
    }

    @Then("the acknowledgement page is displayed with the username as {string},")
    public void the_acknowledgement_page_is_displayed_with_the_username_as(String userName) {

        ConfirmationPage_NewTours confirmationPage_newTours = new ConfirmationPage_NewTours(base.driver);

        assertThat(confirmationPage_newTours.getAcknowledgementMessage().contains(userName), equalTo(true));


    }



}
