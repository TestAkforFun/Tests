package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Дмитрий on 19.03.2015.
 */
public class ISD02TypeOfPanelsAndColorShieldFrame extends CalculationPage {

    public enum ShieldCombination{
        AllPanoramic,
        LowSandwich,
        MiddleSandwich,
        HighSandwich
    }

    public enum NumberOfGaps{
        One,
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven
    }

    public enum Wickets{
        Yes,
        No
    }

    /*private final By ALUMINIUM_CLADDING;
    private final By ALUMINIUM_CLADDING_2010;
    private final By TYPE_OF_PANEL;
    private final By DESIGN_OF_PANEL;
    private final By SECOND_DESIGN_OF_PANEL;
    private final By STRUCTURE_OF_PANEL;
    private final By EXTERNAL_COLOR_PANELS;
    private final By SIZES;
    private final By OTHER_OPTIONS_FOR_CALCULATING;
    private final By TRIM_AS;
    private final By PAINTING_OUTSIDE;
    private final By COLOR_OUTSIDE;
    private final By PAINTING_INSIDE;
    private final By COLOR_INSIDE;*/

    private static final By PANORAMIC_PANELS = By.id("TypePanelsColorShieldMI_PanoramicPanel");
    private static final By BUTTON_ACCEPT = By.xpath("//button[1]");
    private static final By SHIELD_COMBINATION = By.id("PanoramicParametersMI_PanShieldType");
    private static final By NUMBER_OF_GAPS = By.id("PanoramicParametersMI_InitialPanNumberOfGaps");
    private static final By WICKETS = By.id("PanoramicParametersMI_InitialPanWicketInstalled");
    private static final By COUNT = By.id("SandwichParametersMI_PanPanelParameter");

    public static void addPanoramicPanels (WebDriver driver){
        driver.findElement(PANORAMIC_PANELS).click();
    }

    public static void acceptPanoramicPanels(WebDriver driver){
        driver.findElement(BUTTON_ACCEPT).click();
    }

    public static void acceptPanoramicPanelsAdditional (WebDriver driver){
        List<WebElement> x = driver.findElements(BUTTON_ACCEPT);
        x.get(1).click();
    }

    public static  void selectShieldCombination (WebDriver driver,ShieldCombination shieldCombination) {
        WebElement selectElem = driver.findElement(SHIELD_COMBINATION);
        Select select = new Select(selectElem);
        switch (shieldCombination) {
            case AllPanoramic:
                select.selectByValue("Полностью из панорамных");
                break;
            case LowSandwich:
                select.selectByValue("Низ из сэндвич");
                break;
            case MiddleSandwich:
                select.selectByValue("Середина из панорамных");
                break;
            case HighSandwich:
                select.selectByValue("Верх из сэндвич");
        }
    }

    public static void selectNumberOfGaps (WebDriver driver,NumberOfGaps numberOfGaps) {
        WebElement selectElem = driver.findElement(NUMBER_OF_GAPS);
        Select select = new Select(selectElem);
        switch (numberOfGaps) {
            case One:
                select.selectByValue("1");
                break;
            case Two:
                select.selectByValue("2");
                break;
            case Three:
                select.selectByValue("3");
                break;
            case Four:
                select.selectByValue("4");
                break;
            case Five:
                select.selectByValue("5");
                break;
            case Six:
                select.selectByValue("6");
                break;
            case Seven:
                select.selectByValue("7");
        }
    }

    public static void installWicket (WebDriver driver,Wickets wickets){
        WebElement selectElem = driver.findElement(WICKETS);
        Select select = new Select(selectElem);
        switch (wickets){
            case Yes:select.selectByValue("Есть");
                break;
            case No:select.selectByValue("Нет");
        }

    }

    public static void inputCountOfPanels (WebDriver driver,String s){
        driver.findElement(COUNT).clear();
        driver.findElement(COUNT).sendKeys(s);
    }


}
