package com.juaracoding.selenium.pageobject;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import com.juaracoding.selenium.pageobject.pages.Dashboard;
import com.juaracoding.selenium.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDashboard {
    public static WebDriver driver;
    private Dashboard dashboard;

    //private Dashboard tambahBenefit = new Dashboard();

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROME);
        driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);
    }
    @BeforeMethod
    public void pageObject() {
        //login = new Login();
        dashboard = new Dashboard();
    }


    @AfterClass
    public void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    @Test()
    public void testDashboardPage() {
        delay(Constants.DETIK);
        // PreCondition

        dashboard.searchdong("Gel Pen / Pulpen / Pena Joyko GP-265 / Q Gel / 0.5 mm - Red");

        dashboard.kliksearch();

        dashboard.btnpilih();

       // Assert.assertEquals(dashboard.txtjumlahstok(), "Atur jumlah dan catatan");

        // Step
       // dashboard.menuDashboard();
       // Assert.assertEquals(dashboard.getTxtDashboard(), "Launching Soon");
        System.out.println("Test Case Dashboard Page");
    }


    static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
