package com.rd.tests;

import com.rd.drivers.Driver;
import com.rd.utils.PropertyManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class ButtonDemoQATest {

    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager= new PropertyManager();
    String url =propertyManager.getProperty("APP_URL_ELM");


    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }

    @Test(priority = 1)
    public void openDemoQAPageTest() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"DEMOQA");
    }

    @Test(priority = 2)
    public void clickButtonOnDemoQA(){

        WebElement btnClk = driver.findElement(new By.ByXPath("//span[contains(text(), 'Buttons')]"));
        btnClk.click();
        WebElement btn2Click = driver.findElement(new By.ByXPath("//button[ substring (text(), 1, 5) = 'Click' ]"));
        btn2Click.click();
        WebElement errorMessage = driver.findElement(new By.ById("//*[@id=\"dynamicClickMessage\"]"));
        Assert.assertEquals(errorMessage,"You have done a dynamic click");

    }

    @AfterMethod(alwaysRun = true)
    public void  after(){
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        webDriver.quitDriver();
    }
}


//@Test
//    public void openGooglePageTest() {
//        String pageTitle = driver.getTitle();
//        Assert.assertEquals(pageTitle,"Google");
//    }


