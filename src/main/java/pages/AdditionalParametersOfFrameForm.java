package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Дмитрий on 19.03.2015.
 */
public class AdditionalParametersOfFrameForm extends CalculationPage {

    public enum Parameter {
        Angle,
        Size,
    }

    private static final By H_L = By.id("GateFrameAdditionalMI_HL");
    private static final By Alpha = By.id("GateFrameAdditionalMI_OriginalAlpha");
    private static final By L_1 = By.id("GateFrameAdditionalMI_L1");
    private static final By H_1 = By.id("GateFrameAdditionalMI_H1");
    private static final By PARAMETER = By.id("GateFrameAdditionalMI_AngleSpecificationMode");

    public static void inputHl (WebDriver driver,String h_l){
        driver.findElement(H_L).sendKeys(h_l);
    }

    public static void selectParameter(WebDriver driver, Parameter parameter) {
        WebElement selectElem = driver.findElement(PARAMETER);
        Select select = new Select(selectElem);
        switch (parameter) {
            case Angle:
                select.selectByValue("Угла");
                break;
            case Size:
                select.selectByValue("Размера");
        }
    }

    public static void inputL1 (WebDriver driver, String l1){
        driver.findElement(L_1).sendKeys(l1);
    }

    public static void inputH1 (WebDriver driver, String h1){
        driver.findElement(H_1).sendKeys(h1);
    }

}
