package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Дмитрий on 12.02.2015.
 */
public class CalculationPage extends PageBase{

    private static final By BUTTON_NEXT = By.id("bNext");
    private static final By BUTTON_YES = By.xpath("//button[2]");
    private static final By BUTTON_NO = By.xpath("//button[1]");

    public static void pressYes(WebDriver driver){
        List<WebElement> x = driver.findElements(BUTTON_YES);
        x.get(0).click();
        waitUntilJQueryActive(driver,20);
    }

    public static void pressNo(WebDriver driver){
        driver.findElement(BUTTON_NO).click();
        waitUntilJQueryActive(driver,20);
    }

    public static void goToNextForm(WebDriver driver){
        driver.findElement(BUTTON_NEXT).click();
        waitUntilJQueryActive(driver,30);
    }



}
