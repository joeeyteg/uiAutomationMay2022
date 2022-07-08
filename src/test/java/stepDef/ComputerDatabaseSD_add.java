package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ConfirmationPage_ComputerDatabase;
import pages.HomePg_ComputerDatabase;
import pages.LandingPg_ComputerDatabase;

import java.util.List;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ComputerDatabaseSD_add extends BaseUtil {

    private BaseUtil base;


    public ComputerDatabaseSD_add(BaseUtil base) {
        this.base = base;
    }



    //new snippets
    @Given("I am on the Play sample application home page")
    public void i_am_on_the_play_sample_application_home_page() {
        base.driver.navigate().to("http://computer-database.herokuapp.com/computers");
    }
    @When("I click on {string} button")
    public void i_click_on_button(String string) {
        HomePg_ComputerDatabase homePg_computerDatabase = new HomePg_ComputerDatabase(base.driver);
        homePg_computerDatabase.clickAddAnewComputer();
    }
    @When("I enter information as follows")
    public void i_enter_information_as_follows(List<List<String>> data) {

        LandingPg_ComputerDatabase landingPg_computerDatabase = new LandingPg_ComputerDatabase(base.driver);
        landingPg_computerDatabase.enterComputerName(data.get(1).get(1));
        landingPg_computerDatabase.enterIntroducedDate(data.get(2).get(1));
        landingPg_computerDatabase.enterDiscontinuedDate(data.get(3).get(1));
        landingPg_computerDatabase.selectCompanyName(data.get(4).get(1));

    }

    @When("I click on the Create this computer button,")
    public void i_click_on_the_create_this_computer_button() {
        // Write code here that turns the phrase above into concrete actions

        LandingPg_ComputerDatabase landingPg_computerDatabase = new LandingPg_ComputerDatabase(base.driver);
        landingPg_computerDatabase.clickCreateThisComputer();

    }

    @Then("I should be able to add the computer name to the database and acknowledged as {string} computer added.")
    public void iShouldBeAbleToAddTheComputerNameToTheDatabaseAndAcknowledgedAsComputerAdded(String computerCreated) {

        ConfirmationPage_ComputerDatabase confirmationPage_computerDatabase = new ConfirmationPage_ComputerDatabase(base.driver);

        assertThat(confirmationPage_computerDatabase.getDoneAcknowledgement().contains(computerCreated), equalTo(true));

    }
}
