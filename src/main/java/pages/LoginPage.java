package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Created by Дмитрий on 12.02.2015.
 */
public class LoginPage extends PageBase {

    private static final By LOGIN = By.id("LoginForm_username");
    private static final By PASSWORD = By.id("LoginForm_password");
    private static final By REGION_MOSCOW = By.cssSelector("option[value='66']");
    private static final By BUTTON_SUBMIT = By.cssSelector("div[class='btn btn-lorange']");


    public static void goToManagerOfOrders (WebDriver driver){
        driver.findElement(LOGIN).sendKeys("Anders");
        driver.findElement(PASSWORD).sendKeys("Anders");
        driver.findElement(REGION_MOSCOW).click();
        driver.findElement(BUTTON_SUBMIT).click();
    }

    public static void checkErrorMessagesEnable (WebDriver driver){
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class='errorMessage']"));
        for (WebElement element : elements){
            assertTrue(element.isDisplayed());
            System.out.println(element.isDisplayed());
        }
    }

    public static void failAuthorization (WebDriver driver){
        driver.findElement(BUTTON_SUBMIT).submit();
        checkErrorMessagesEnable(driver);
    }


}
