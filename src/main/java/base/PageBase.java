package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Created by Дмитрий on 12.02.2015.
 */
public class PageBase {

    protected static void checkExceptedElements (List<WebElement> elements){
        for (WebElement element : elements){
            assertTrue(element.isDisplayed());
        }
    }

    protected static void waitUntilEltmentIsVisible(WebDriver driver, By element){
        WebElement dynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(element));
    }

    protected static void waitUntilJQueryActive (WebDriver driver,int n){
        Boolean element = (new WebDriverWait(driver, n)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                JavascriptExecutor js = (JavascriptExecutor) d;
                return (Boolean) js.executeScript("return jQuery.active == 0");
            }
        });
    }
}
