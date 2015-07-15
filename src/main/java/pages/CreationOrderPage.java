package pages;

import base.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

/**
 * Created by Дмитрий on 11.03.2015.
 */
public class CreationOrderPage extends PageBase {


    private static final By CONSTRUCTOR = By.xpath("//span[contains(text(),'Менеджер')]/..//div[@class='minict_wrapper']");
    private static final By MANAGER = By.cssSelector("input[placeholder='Выбрать']");
    private static final By ORDER_NUMBER = By.id("OrderModel_number");
    private static final By CUSTOMERS_SURNAME = By.id("CustomerModel_name");
    private static final By MEASUREMENT_DATE = By.id("OrderModel_measurementDate");
    private static final By PRODUCTION_DATE = By.id("OrderModel_productionDate");
    private static final By INSTALLATION_DATE = By.id("OrderModel_installationDate");
    private static final By DAY = By.cssSelector(".ui-datepicker-calendar tr:nth-of-type(2) td:nth-of-type(4)");
    private static final By BUTTON_ADD = By.id("submit");

    public static void goToOrderPage(WebDriver driver,String s){
        //driver.findElement(CONSTRUCTOR).click();
        driver.findElement(MANAGER).click();
        driver.findElement(By.cssSelector("li[data-value='37']")).click();
        driver.findElement(ORDER_NUMBER).sendKeys(s);
        driver.findElement(CUSTOMERS_SURNAME).sendKeys("dsfdfsdf");
        driver.findElement(MEASUREMENT_DATE).click();
        driver.findElement(DAY).click();
        driver.findElement(PRODUCTION_DATE).click();
        driver.findElement(DAY).click();
        driver.findElement(INSTALLATION_DATE).click();
        driver.findElement(DAY).click();
        driver.findElement(BUTTON_ADD).click();
    }

}
