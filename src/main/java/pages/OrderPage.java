package pages;

import base.PageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Дмитрий on 12.02.2015.
 */
public class OrderPage extends PageBase {

    private static final By ADD_PRODUCT = By.cssSelector("a[href*='addProduct']");
    private static final By EXIT_ORDER = By.xpath("//*[text()='Выйти из заказа']");
    private static final By BUTTON_YES = By.xpath("//button[1]");
    private static final By DELETE_PRODUCT = By.xpath("//*[text()='Удалить изделие']");
    private static final By MENU_PRODUCT = By.className("popup-list-link");
    private static final By SAVE_ORDER = By.cssSelector("a[onclick*='saveOrder']");

    public static void goToChooseProduct(WebDriver driver){
        waitUntilEltmentIsVisible(driver,ADD_PRODUCT);
        driver.findElement(ADD_PRODUCT).click();
    }

    public static void exitFromOrder (WebDriver driver) throws InterruptedException {
        driver.findElement(EXIT_ORDER).click();
        List<WebElement> x = driver.findElements(BUTTON_YES);
        x.get(1).click();
        waitUntilJQueryActive(driver,10);
    }

    public static void deleteProduct (WebDriver driver){
        driver.findElement(MENU_PRODUCT).click();
        driver.findElement(DELETE_PRODUCT).click();
        List<WebElement> x = driver.findElements(BUTTON_YES);
        x.get(1).click();
        waitUntilJQueryActive(driver,5);
    }

    public static void saveOrder (WebDriver driver){
        waitUntilEltmentIsVisible(driver,SAVE_ORDER);
        driver.findElement(SAVE_ORDER).click();
        List<WebElement> x = driver.findElements(BUTTON_YES);
        x.get(1).click();
        waitUntilJQueryActive(driver,5);
    }
}
