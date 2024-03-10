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

public class WebTablesDemoQATest {

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
    public void fillFormOnDemoQA(){

        WebElement btnClick = driver.findElement(new By.ByCssSelector("li#item-3.btn.btn-light.active"));
        btnClick.click();
        WebElement btn2Click = driver.findElement(new By.ByCssSelector("button#addNewRecordButton"));
        btn2Click.click();
        WebElement firstName = driver.findElement(new By.ByCssSelector("input#firstName"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(new By.ByCssSelector("input#lastName"));
        lastName.sendKeys("Doe");
        WebElement userEmail = driver.findElement(new By.ByCssSelector("input#userEmail"));
        userEmail.sendKeys("doejohn@gmail.com");
        WebElement userAge = driver.findElement(new By.ByCssSelector("input#age"));
        userAge.sendKeys("50");
        WebElement userSalary = driver.findElement(new By.ByCssSelector("input#salary"));
        userSalary.sendKeys("10000");
        WebElement userDept = driver.findElement(new By.ByCssSelector("input#department"));
        userDept.sendKeys("Finance");
        WebElement submitClick = driver.findElement(new By.ByCssSelector("button#submit"));
        submitClick.click();

        WebElement headerTitle = driver.findElement(new By.ByCssSelector("h1.text-center"));
        Assert.assertTrue(headerTitle.isDisplayed());
    }

    @AfterMethod(alwaysRun = true)
    public void  after(){
        webDriver.quitDriver();
    }
}
