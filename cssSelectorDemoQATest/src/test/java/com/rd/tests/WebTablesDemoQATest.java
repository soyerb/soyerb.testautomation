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
    String url =propertyManager.getProperty("APP_URL_TBL");



    @BeforeMethod(alwaysRun = true)
    public void before() throws MalformedURLException {
        driver = webDriver.initializeDriver();
        driver.get(url);
    }

//    @Test(priority = 1)
//    public void openDemoQAPageTest() {
//        String pageTitle = driver.getTitle();
//        Assert.assertEquals(pageTitle,"DEMOQA");
//    }

    @Test(priority = 1)
    public void fillFormOnDemoQA(){

        WebElement addClick = driver.findElement(new By.ByCssSelector("button#addNewRecordButton"));
        addClick.click();
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


//        WebElement headerTitle = driver.findElement(new By.ByXPath("h1.text-center"));
//        Assert.assertTrue(headerTitle.isDisplayed());
    }

    @Test(priority = 2)
    public void editFormOnDemoQA(){

        WebElement editButton = driver.findElement(new By.ByXPath("//*[@id=\"edit-record-4\"]"));
        editButton.click();
        WebElement firstName = driver.findElement(new By.ByCssSelector("input#firstName"));        firstName.clear();
        firstName.sendKeys("Mehmet");
        WebElement lastName = driver.findElement(new By.ByCssSelector("input#lastName"));
        lastName.clear();
        lastName.sendKeys("John");
        WebElement userEmail = driver.findElement(new By.ByCssSelector("input#userEmail"));
        userEmail.clear();
        userEmail.sendKeys("mehmetjohn@gmail.com");
        WebElement userAge = driver.findElement(new By.ByCssSelector("input#age"));
        userAge.clear();
        userAge.sendKeys("12");
        WebElement userSalary = driver.findElement(new By.ByCssSelector("input#salary"));
        userSalary.clear();
        userSalary.sendKeys("99");
        WebElement userDept = driver.findElement(new By.ByCssSelector("input#department"));
        userDept.clear();
        userDept.sendKeys("ART");
        WebElement submitClick = driver.findElement(new By.ByCssSelector("button#submit"));
        submitClick.click();

//        WebElement headerTitle = driver.findElement(new By.ByCssSelector(""));
//        Assert.assertTrue(headerTitle.isDisplayed());
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
