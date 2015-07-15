package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Дмитрий on 19.03.2015.
 */
public class ISD02FrameForm extends CalculationPage {

    //FRAME Form Selectors
    public enum LiftType{
        Standard,
        StandardSloping,
        High,
        HighSloping,
        HighShaftBottom,
        HighSlopingShaftBottom,
        Vertical,
        VerticalShaftBottom,
        LowDrumFront,
        LowDrumBack,
        LowSlopingDrumBack

    }

    public enum WicketFutureInstallation {
        WithoutWicket,
        Wicket,
        WicketV2,
        WicketV3,
        WicketV4,
        WicketV4Standard,
        WicketV5
    }

    public enum ProfileType{
        Usual,
        WarmProfile,
        WithMoldings
    }

    private static final By B_H = By.id("GateFrameMI_Bh");
    private static final By H_H = By.id("GateFrameMI_Hh");
    private static final By H = By.id("GateFrameMI_h");
    private static final By B_1 = By.id("GateFrameMI_b1");
    private static final By B_2 = By.id("GateFrameMI_b2");
    private static final By L = By.id("GateFrameMI_L");
    private static final By MAX_H = By.id("GateFrameMI_Maxh");
    private static final By LIFT_TYPE = By.id("GateFrameMI_LiftType");
    private static final By WICKET_FUTURE_INSTALLATION = By.id("GateFrameMI_WicketFutureInstallation");
    private static final By PROFILE_TYPE = By.id("GateFrameMI_ProfileType");
    private static final By ANTICORROSION_PACKAGE = By.id("GateFrameMI_AntiCorrosionPackageEnabled");
    private static final By DELTA_PROFILE = By.id("GateFrameMI_UseDeltaProfile");

    public static void inputBh (WebDriver driver, String x){
        driver.findElement(B_H).sendKeys(x);
    }

    public static void inputHh (WebDriver driver, String x){
        driver.findElement(H_H).sendKeys(x);
    }

    public static void inputH (WebDriver driver, String x){
        driver.findElement(H).sendKeys(x);
    }

    public static void inputB1 (WebDriver driver, String x){
        driver.findElement(B_1).sendKeys(x);
    }

    public static void inputB2 (WebDriver driver, String x){
        driver.findElement(B_2).sendKeys(x);
    }

    public static void inputL (WebDriver driver, String x){
        driver.findElement(L).sendKeys(x);
    }

    public static void inputMaxH (WebDriver driver, String x){
        driver.findElement(MAX_H).sendKeys(x);
    }

    public static void anticorrosionPackageCheckBoxClick (WebDriver driver){
        driver.findElement(ANTICORROSION_PACKAGE).click();
    }

    public static void deltaProfileCheckBoxClick (WebDriver driver){
        driver.findElement(DELTA_PROFILE).click();
    }
    public static void chooseLiftType (WebDriver driver, LiftType liftType){
        WebElement selectElem = driver.findElement(LIFT_TYPE);
        Select select = new Select(selectElem);
        switch (liftType){
            case Standard:select.selectByValue("Стандартный");
                break;
            case StandardSloping:select.selectByValue("Стандартный наклонный");
                break;
            case High:select.selectByValue("Высокий");
                break;
            case HighSloping:select.selectByValue("Высокий наклонный");
                break;
            case HighShaftBottom:select.selectByValue("Высокий (вал снизу)");
                break;
            case HighSlopingShaftBottom:select.selectByValue("Высокий наклонный (вал снизу)");
                break;
            case Vertical:select.selectByValue("Вертикальный");
                break;
            case VerticalShaftBottom:select.selectByValue("Вертикальный (вал снизу)");
                break;
            case LowDrumFront:select.selectByValue("Низкий (барабан впереди)");
                break;
            case LowDrumBack:select.selectByValue("Низкий (барабан сзади)");
                break;
            case LowSlopingDrumBack:select.selectByValue("Низкий наклонный (барабан сзади)");
        }
    }

    public static void chooseWicketFutureInstallation (WebDriver driver, WicketFutureInstallation profileType){
        WebElement selectElem = driver.findElement(WICKET_FUTURE_INSTALLATION);
        Select select = new Select(selectElem);
        switch (profileType){
            case Wicket:select.selectByValue("Калитка");
                break;
            case WithoutWicket:select.selectByValue("Без калитки");
                break;
            case WicketV2:select.selectByValue("Калитка v2");
                break;
            case WicketV3:select.selectByValue("Калитка v3");
                break;
            case WicketV4:select.selectByValue("Калитка v4");
                break;
            case WicketV4Standard:select.selectByValue("Калитка v4 стандарт");
                break;
            case WicketV5:select.selectByValue("Калитка v5");
        }
    }

    public static void chooseProfileType (WebDriver driver, ProfileType profileType) {
        WebElement selectElem = driver.findElement(PROFILE_TYPE);
        Select select = new Select(selectElem);
        switch (profileType) {
            case Usual:select.selectByValue("Стандартный");
                break;
            case WarmProfile:select.selectByValue("Теплые профиля");
                break;
            case WithMoldings:select.selectByValue("Со штапиками");
        }
    }
}
