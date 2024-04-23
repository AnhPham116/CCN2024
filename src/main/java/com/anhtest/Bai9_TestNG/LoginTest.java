package com.anhtest.Bai9_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class LoginTest {
    public String baseUrl = "https://anhtester.com";

    String driverPath = "D:\\TESTER\\SeleniumJava\\Setup\\chromedriver.exe";
    //System.setProperty("webdriver.chrome.driver", driverPath);
    public WebDriver driver ;

    @Test
    public void verifyHomepageTitle() throws InterruptedException {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to(baseUrl);
        Thread.sleep(2000);

        String expectedTitle = "Anh Tester - Automation Testing";
        String actualTitle = driver.getTitle();

        assertEquals(actualTitle, expectedTitle);

        Thread.sleep(2000);
        driver.quit();
}}
