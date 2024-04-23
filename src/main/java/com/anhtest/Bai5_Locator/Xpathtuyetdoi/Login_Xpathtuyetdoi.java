package com.anhtest.Bai5_Locator.Xpathtuyetdoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Login_Xpathtuyetdoi {
    public static void main(String[] args) throws InterruptedException {
        //khởi tạo driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //time tìm 1 element tối đa 10s

        //open web
        driver.get("http://10.10.10.90:3001/auth/login");

        //tuyệt đối: Chọn vào thẻ đó -> chuột phải copy xpath
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/form/div[1]/input")).sendKeys("0303020092");
        //driver.findElement(By.name("username")).sendKeys("0303020092");

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/form/div[2]/input")).sendKeys("123456aA@");

        //driver.findElement(By.linkText("Quên mật khẩu?")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div/form/div[4]/button")).click();

        Thread.sleep(3000); //ngủ 3s

        //tắt Brower
        driver.quit();



    }
}
