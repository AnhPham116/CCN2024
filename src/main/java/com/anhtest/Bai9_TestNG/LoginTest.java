package com.anhtest.Bai9_TestNG;

import com.anhtest.Bai5_Locator.Base_CNN;
import com.anhtest.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

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
}

    public static class Demo_SoftAssert extends BaseTest {
        @Test
        public void LoginCNN(){
            driver.get("http://10.10.10.90:3001/auth/login");

            SoftAssert softAssert = new SoftAssert();

            driver.findElement(By.xpath(Base_CNN.inputUsername)).clear();
            driver.findElement(By.xpath(Base_CNN.inputPassword)).clear();

            //Assert cái header với cái text của nó
            String hearder = driver.findElement(By.xpath("//h3[contains(text(),'Đăng nhập hệ thống')]")).getText();
            softAssert.assertEquals(hearder,"ĐĂNG NHẬP HỆ THỐNG","Giá trị sai");

            //Kiểm tra nút Login có được bật không
            boolean checkButtonLogin = driver.findElement(By.xpath(Base_CNN.buttonLogin)).isEnabled();
            softAssert.assertTrue(checkButtonLogin,"Button Login không được bật");


            driver.findElement(By.xpath(Base_CNN.inputUsername)).sendKeys("6666688888");
            driver.findElement(By.xpath(Base_CNN.inputPassword)).sendKeys("123456aA@");
            driver.findElement(By.xpath(Base_CNN.buttonLogin)).click();

            //Kiểm tra có chứa hay không
            String menuName = driver.findElement(By.xpath("//p[contains(text(),'Thủ tục đăng ký kiểm tra xác nhận thức ăn chăn nuô')]")).getText();
            softAssert.assertTrue(menuName.contains("123"), "Giá trị mong muốn: "+ menuName);  //so sánh chứa thông qua java

            softAssert.assertAll();
        }}

    public static class Demo_Assert extends BaseTest {
        @Test
        public void LoginCNN(){
            driver.get("http://10.10.10.90:3001/auth/login");

            driver.findElement(By.xpath(Base_CNN.inputUsername)).clear();
            driver.findElement(By.xpath(Base_CNN.inputPassword)).clear();

            //Assert cái header với cái text của nó
            String hearder = driver.findElement(By.xpath("//h3[contains(text(),'Đăng nhập hệ thống')]")).getText();
            assertEquals(hearder,"ĐĂNG NHẬP HỆ THỐNG","Giá trị sai");

            //Kiểm tra nút Login có được bật không
            boolean checkButtonLogin = driver.findElement(By.xpath(Base_CNN.buttonLogin)).isEnabled();
            Assert.assertTrue(checkButtonLogin,"Button Login không được bật");


            driver.findElement(By.xpath(Base_CNN.inputUsername)).sendKeys("6666688888");
            driver.findElement(By.xpath(Base_CNN.inputPassword)).sendKeys("123456aA@");
            driver.findElement(By.xpath(Base_CNN.buttonLogin)).click();

            //Kiểm tra có chứa hay không
            String menuName = driver.findElement(By.xpath("//p[contains(text(),'Thủ tục đăng ký kiểm tra xác nhận thức ăn chăn nuô')]")).getText();
            Assert.assertTrue(menuName.contains("123"), "Giá trị mong muốn: "+ menuName);  //so sánh chứa thông qua java

        }
    }
}
