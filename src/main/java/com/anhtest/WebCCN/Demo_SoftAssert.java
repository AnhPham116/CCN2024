package com.anhtest.WebCCN;

import com.anhtest.Bai5_Locator.Base_CNN;
import com.anhtest.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo_SoftAssert extends BaseTest {
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
