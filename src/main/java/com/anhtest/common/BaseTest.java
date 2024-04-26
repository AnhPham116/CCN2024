package com.anhtest.common;

import com.anhtest.Locators.locator_CCN;
import com.anhtest.WebCCN.InfoCCN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;


public class BaseTest {
    public static WebDriver driver;

    public static String userName = "6666688888";
    public static String passWord = "123456aA@";

    @BeforeMethod //Chạy trước mỗi @Test
    //@BeforeClass
    public void createBrowser() {
       //driver = new ChromeDriver();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.get(InfoCCN.URL);
//        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
//        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
//        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
    }

    public void createBrowser(String browserName) {
        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        }
        if (browserName.equals("edge")) {
            driver = new EdgeDriver();
        }
        if (browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Dành cho Junior
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }

    @AfterMethod
   // @AfterClass
    public void closeBrowser() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public Boolean checkElementExist(String xpath) {
        List<WebElement> listElement = driver.findElements(By.xpath(xpath));

        if (listElement.size() > 0) {
            System.out.println("Element " + xpath + " existing.");
            return true;
        } else {
            System.out.println("Element " + xpath + " NOT exist.");
            return false;
        }
    }


    public void sleep (double second){
        try{
            Thread.sleep((long) (1000 * second));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    public  void loginSuccess(){
//       driver.get(InfoCCN.URL);
//        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
//        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
//        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
//    }

}
