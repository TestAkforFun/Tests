package pages;

import base.PageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Дмитрий on 20.03.2015.
 */
public class CardsPage extends PageBase {

    private static final By SAVE_ORDER = By.cssSelector("a[onclick*='saveOrder']");
    private static final By BACK_TO_ORDER = By.xpath("//*[text()='Назад к заказу']");

    public static void saveOrder (WebDriver driver){
        driver.findElement(SAVE_ORDER).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        waitUntilJQueryActive(driver,15);
    }

    public static void backToOrder (WebDriver driver){
        driver.findElement(BACK_TO_ORDER).click();
        waitUntilJQueryActive(driver,10);
    }

}
