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
    String url =propertyManager.getProperty("APP_URL");



    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }

    @Test
    public void openDemoQAPageTest() {
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle,"DEMOQA");
    }

    @Test
    public void clickButtonOnDemoQA(){

        WebElement btnClick = driver.findElement(new By.ByCssSelector("li#item-4.btn.btn-light.active"));
        btnClick.click();
        WebElement btn2Click = driver.findElement(new By.ByCssSelector("button.btn.btn-primary"));
        btn2Click.click();

        WebElement textSearch = driver.findElement(new By.ById("p#dynamicClickMessage"));
        Assert.assertTrue(textSearch.isDisplayed());
    }

    @AfterMethod(alwaysRun = true)
    public void  after(){
        webDriver.quitDriver();
    }
}
