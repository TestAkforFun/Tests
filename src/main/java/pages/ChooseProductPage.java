package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Дмитрий on 11.03.2015.
 */
public class ChooseProductPage extends PageBase {

    private static final By PRODUCT = By.xpath("//a[text() = 'ISD02']");
    private static final By ORDER_TYPE = By.xpath("//span[text() = 'Гаражные']");
    private static final By ORDER_SUB_TYPE = By.xpath("//span[text() = 'Секционные']");
    private static final By BUTTON_NEXT = By.id("next");

    public static void goToCalculationISD02(WebDriver driver){
        waitUntilEltmentIsVisible(driver,ORDER_TYPE);
        driver.findElement(ORDER_TYPE).click();
        waitUntilEltmentIsVisible(driver,ORDER_SUB_TYPE);
        driver.findElement(ORDER_SUB_TYPE).click();
        waitUntilEltmentIsVisible(driver,PRODUCT);
        driver.findElement(PRODUCT).click();
        driver.findElement(BUTTON_NEXT).click();
    }
}
