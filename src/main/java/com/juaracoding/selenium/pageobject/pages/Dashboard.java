package com.juaracoding.selenium.pageobject.pages;

import com.juaracoding.selenium.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class Dashboard {
    private WebDriver driver;

    public Dashboard() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")
    WebElement txtsearch;

    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/button")
    WebElement kliksearch;
    @FindBy(xpath = "//img[@alt='Gel Pen / Pulpen / Pena Joyko GP-265 / Q Gel / 0.5 mm - Red']")
    WebElement pilihbarang;

//*[@id="2046442724"]/div/div/div/div/div[1]/a/div/img
    @FindBy(xpath = "//*[@id=\"pdpFloatingActions\"]/div[1]/p/b")
    WebElement jumlahstok;
    //*[@id="pdpFloatingActions"]/h6
    //*[@id="pdpFloatingActions"]/div[1]/p
    public void searchdong(String search)
    {
        this.txtsearch.sendKeys(search);


    }

    public void kliksearch()
    {
        //this.search.sendKeys(search);
        kliksearch.click();

    }

    public void btnpilih()
    {

        pilihbarang.click();

    }

    public String txtjumlahstok()
    {

        return jumlahstok.getText();

    }


   // public String getTxtDashboard()
    //{
     //   pilihbarang.click();
    //}
    
}
