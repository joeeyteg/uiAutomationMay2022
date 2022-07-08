package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage_BBCweather;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

public class BBCweather_StepDef extends BaseUtil {
    private BaseUtil base;

    public BBCweather_StepDef(BaseUtil base) {
        this.base = base;
    }


    //BBC
    @Given("I am the BBC weather homepage,")
    public void i_am_the_bbc_weather_homepage() {
        // Write code here that turns the phrase above into concrete actions
        base.driver.navigate().to("https://www.bbc.co.uk/weather");
    }

    @When("I enter the city {string},")
    public void iEnterTheCity(String myCity) throws InterruptedException {

        HomePage_BBCweather homePage_bbCweather = new HomePage_BBCweather(base.driver);
        homePage_bbCweather.enterOnSearchField(myCity);

    }

    @And("I click the on search icon, I should be able to see the current weather results.")
    public void iClickTheOnSearchIconIShouldBeAbleToSeeTheCurrentWeatherResults() {

        HomePage_BBCweather homePage_bbCweather = new HomePage_BBCweather(base.driver);
        homePage_bbCweather.clickSearchIcon();
    }


    //with assertion

    @Then("I should be able to ascertain that tomorrows {string} is greater than tomorrows {string}")
    public void iShouldBeAbleToAscertainThatTomorrowsIsGreaterThanTomorrows(String High, String Low) {

        HomePage_BBCweather homePage_bbCweather = new HomePage_BBCweather(base.driver);


 //assertThat((homePage_bbCweather.tomorrowHighs(High)), greaterThan(homePage_bbCweather.tomorrowLows(Low)));
    }

}