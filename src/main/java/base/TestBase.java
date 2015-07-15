package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Дмитрий on 12.02.2015.
 */
public class TestBase {
    protected static WebDriver driver;

    @BeforeTest
    public static void setup(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://betaconst.andersenlab.com/");
    }

    @AfterTest
    public static  void tearDown(){
        driver.quit();
    }
}
