package com.anhtest.Bai5_Locator.Xpathtuongdoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Login_Xpathtuongdoi {
    public static void main(String[] args) throws InterruptedException {
        //khởi tạo driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //time tìm 1 element tối đa 10s

        //open web
        driver.get("http://10.10.10.90:3001/auth/login");

        driver.findElement(By.xpath("//input[@placeholder='Tên đăng nhập']")).sendKeys("0303020092");
        driver.findElement(By.xpath("//input[@placeholder='Mật khẩu']")).sendKeys("123456aA@");
        driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();

        driver.findElement(By.xpath("//a[@href='/dangkykiemtra']//div[@class='p-4 md:p-5']")).click();

        Thread.sleep(3000); //ngủ 3s

        //tắt Brower
        driver.quit();



    }
}
