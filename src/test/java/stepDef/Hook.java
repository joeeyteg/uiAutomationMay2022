package stepDef;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Hook extends BaseUtil {
    private BaseUtil base;

    // create constructor below
    public Hook(BaseUtil base) {
        this.base = base;
    }

    //open browser
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        base.driver = new FirefoxDriver();
    }

    //close browser
//    @After
//    public void TearDown() throws IOException {
//        takeScreenShot();
//        base.driver.close();
//        base.driver.quit();
//    }
//
//    private void takeScreenShot() throws IOException {
//        TakesScreenshot scrShot = ((TakesScreenshot) base.driver);
//        File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
//
//        FileUtils.copyFile(ScrFile, new File("target/screenshot" + System.currentTimeMillis() + ".jpeg"));
//
//
//    }

}
