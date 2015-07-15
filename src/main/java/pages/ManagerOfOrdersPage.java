package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by Дмитрий on 12.02.2015.
 */
public class ManagerOfOrdersPage extends PageBase {

    private static final By REGION = By.className("regionTitle");
    private static final By CREATE_ORDER = By.cssSelector("div > a[href='/constructor/order/create']");
    private static final By DELETE_BUTTON = By.id("listSubmit");
    private static final By DEPLOY_BUTTON = By.id("deploySubmit");
    private static final By FOUNDED_ORDER = By.id("yw0_c0_0");

    public static void  goToPageCreationOrder (WebDriver driver) {
        driver.findElement(CREATE_ORDER).click();
    }

    public static void searchOrder(WebDriver driver,String s){
        List<WebElement> x = driver.findElements(By.id("OrderModel_number"));
        x.get(0).clear();
        x.get(0).sendKeys(s);
        driver.findElement(By.xpath(".//a[text()='поиск']")).click();
        waitUntilJQueryActive(driver,3);
    }

    public static void deploySubmit (WebDriver driver,String s){
        searchOrder(driver,s);
        driver.findElement(FOUNDED_ORDER).click();
        driver.findElement(DEPLOY_BUTTON).click();
        waitUntilJQueryActive(driver,5);
        driver.findElement(By.cssSelector("div[class='flash-success']")).isDisplayed();
        driver.findElement(By.xpath("//a[text()='"+ s +"']")).click();
    }

    public static void deleteOrder (WebDriver driver,String s){
        searchOrder(driver,s);
        driver.findElement(FOUNDED_ORDER).click();
        driver.findElement(DELETE_BUTTON).click();
    }

    public static void checkRegion(WebDriver driver,String s){
        assertTrue(driver.findElement(REGION).getText().equals("Регион: "+s));
    }
}
