import base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;


import java.util.concurrent.TimeUnit;

/**
 * Created by Дмитрий on 12.02.2015.
 */
public class TestLogin extends TestBase {

    @Test
    public static void failAuthorization (){
        LoginPage.failAuthorization(driver);
    }

    @Test
    public static void successfulAuthorization (){
        LoginPage.goToManagerOfOrders(driver);
        ManagerOfOrdersPage.checkRegion(driver,"Москва");
    }

    @Test
    public static void createOrder () throws InterruptedException {
        LoginPage.goToManagerOfOrders(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ManagerOfOrdersPage.goToPageCreationOrder(driver);
        CreationOrderPage.goToOrderPage(driver, "MyFirstAOrder1");
        OrderPage.saveOrder(driver);
        OrderPage.exitFromOrder(driver);
        ManagerOfOrdersPage.searchOrder(driver,"MyFirstAOrder1");
        driver.findElement(By.xpath("//a[text()='MyFirstAOrder1']")).click();
    }

    /*@Ignore
    @Test
    public static void calculation () throws InterruptedException {
        LoginPage.goToManagerOfOrders(driver);
        ManagerOfOrdersPage.goToPageCreationOrder(driver);
        CreationOrderPage.goToOrderPage(driver, "MyFirstAOrder1");
        OrderPage.goToChooseProduct(driver);
        ChooseProductPage.goToCalculationISD02(driver);
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        ISD02FrameForm.inputBh(driver, "4600");
        ISD02FrameForm.inputHh(driver, "3000");
        ISD02FrameForm.inputH(driver, "450");
        ISD02FrameForm.inputB1(driver, "400");
        ISD02FrameForm.inputB2(driver, "400");
        ISD02FrameForm.inputL(driver, "10000");
        //ISD02FrameForm.inputMaxH(driver, "1100");
        ISD02FrameForm.chooseLiftType(driver, ISD02FrameForm.LiftType.Standard);
        ISD02FrameForm.chooseWicketFutureInstallation(driver, ISD02FrameForm.WicketFutureInstallation.WithoutWicket);
        ISD02FrameForm.chooseProfileType(driver, ISD02FrameForm.ProfileType.WarmProfile);
        ISD02FrameForm.anticorrosionPackageCheckBoxClick(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02TypeOfPanelsAndColorShieldFrame.addPanoramicPanels(driver);
        ISD02TypeOfPanelsAndColorShieldFrame.selectShieldCombination(driver, ISD02TypeOfPanelsAndColorShieldFrame.ShieldCombination.LowSandwich);
        ISD02TypeOfPanelsAndColorShieldFrame.inputCountOfPanels(driver, "2");
        ISD02TypeOfPanelsAndColorShieldFrame.acceptPanoramicPanelsAdditional(driver);
        ISD02TypeOfPanelsAndColorShieldFrame.selectNumberOfGaps(driver, ISD02TypeOfPanelsAndColorShieldFrame.NumberOfGaps.Six);
        ISD02TypeOfPanelsAndColorShieldFrame.installWicket(driver, ISD02TypeOfPanelsAndColorShieldFrame.Wickets.Yes);
        Thread.sleep(5000);
        ISD02TypeOfPanelsAndColorShieldFrame.pressYes(driver);
        Thread.sleep(5000);
        ISD02TypeOfPanelsAndColorShieldFrame.acceptPanoramicPanels(driver);
        ISD02TypeOfPanelsAndColorShieldFrame.pressYes(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.pressYes(driver);
        ISD02FrameForm.pressYes(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        ISD02FrameForm.goToNextForm(driver);
        CardsPage.saveOrder(driver);
        CardsPage.backToOrder(driver);
        OrderPage.exitFromOrder(driver);
        System.out.println("VICTORY !!!!!!!!!!");
    }*/

    /*@Test
    public static void deleteOrder () throws InterruptedException {
        LoginPage.goToManagerOfOrders(driver);
        ManagerOfOrdersPage.deploySubmit(driver,"MyFirstAOrder");
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        OrderPage.deleteProduct(driver);
        OrderPage.saveOrder(driver);
        OrderPage.exitFromOrder(driver);
        ManagerOfOrdersPage.deleteOrder(driver,"MyFirstAOrder");
    }*/

    @Test
    public static void unlock() {
        LoginPage.goToManagerOfOrders(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ManagerOfOrdersPage.deploySubmit(driver, "MyFirstAOrder1");
    }





}
