package com.anhtest.WebCCN;

import com.anhtest.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.anhtest.Locators.locator_CCN;

public class LoginTest extends BaseTest {


    @Test(priority = 1)
    public void TC_01_validateCurrentUrl(){
        String loginPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(loginPageUrl,"http://10.10.10.90:3001/auth/login");
    }

    @Test (priority = 2)
    public void TC_02_checkHeader_ButtonLogin(){
      //  driver.get(InfoCCN.URL);
        String header1 = driver.findElement(By.xpath(locator_CCN.headerLogin1)).getText();
        Assert.assertEquals(header1,"ĐĂNG NHẬP HỆ THỐNG","Giá trị sai");

        String header2 = driver.findElement(By.xpath(locator_CCN.headerLogin2)).getText();
        Assert.assertEquals(header2,"Hệ thống đăng ký thủ tục Cục chăn nuôi dành cho doanh nghiệp.","Giá trị sai");
    }

    @Test (priority = 3)
    public void TC_03_checkbuttonLogin(){
        //Kiểm tra nút Login có được bật không
        boolean checkButtonLogin = driver.findElement(By.xpath(locator_CCN.buttonLogin)).isEnabled();
        Assert.assertTrue(checkButtonLogin,"Button Login không được bật");
    }

    @Test (priority = 4)
    public void TC_04_checkLinkQuenMK(){

        driver.findElement(By.xpath(locator_CCN.linkForgotPassword)).click();
        // Kiểm tra xem đã điều hướng đến trang khác hay chưa
        String currentUrl1 = driver.getCurrentUrl();
        Assert.assertNotEquals(currentUrl1, "http://10.10.10.90:3001/auth/forgotpassword", "Navigation failed");
    }

    @Test (priority = 5)
    public void TC_05_checkLinkDangKy(){

        driver.findElement(By.xpath(locator_CCN.linkDangKy)).click();
        // Kiểm tra xem đã điều hướng đến trang khác hay chưa
        String currentUrlcheck = driver.getCurrentUrl();
        Assert.assertNotEquals(currentUrlcheck, "http://10.10.10.90:3001/auth/register", "Navigation failed");
    }

    @Test (priority = 6)
    public void TC_06_trongTenDangNhap(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        String errorTenDangNhap = driver.findElement(By.xpath(locator_CCN.errorTenDangNhap)).getText();
        Assert.assertEquals(errorTenDangNhap,"Tên đăng nhập không được bỏ trống.","Thông báo sai");

    }

    @Test (priority = 7)
    public void TC_07_trongMatKhau(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        String errorMatKhau = driver.findElement(By.xpath(locator_CCN.errorMatKhau)).getText();
        Assert.assertEquals(errorMatKhau,"Mật khẩu không được bỏ trống.","Thông báo sai");
    }

    @Test (priority = 8)
    public void TC_08_saiTenDangNhap(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("666668888899");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);

        Assert.assertTrue(checkElementExist(locator_CCN.alertMessage),"Fail. Alert messenge display");

        String alertMessage = driver.findElement(By.xpath(locator_CCN.alertMessage)).getText();
        Assert.assertEquals(alertMessage,"Tài khoản hoặc mật khẩu không chính xác","Thông báo sai");
    }

    @Test (priority = 9)
    public void TC_09_tenDNNhoHon10KyTu(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("66");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(checkElementExist(locator_CCN.alertMessage),"Fail. Alert messenge display");
        String alertMessage = driver.findElement(By.xpath(locator_CCN.alertMessage)).getText();
        Assert.assertEquals(alertMessage,"Tài khoản hoặc mật khẩu không chính xác","Thông báo sai");
    }

    @Test (priority = 10)
    public void TC_10_tenDNLonHon10KyTu(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("66666888888123456");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(checkElementExist(locator_CCN.alertMessage),"Fail. Alert messenge display");
        String alertMessage = driver.findElement(By.xpath(locator_CCN.alertMessage)).getText();
        Assert.assertEquals(alertMessage,"Tài khoản hoặc mật khẩu không chính xác","Thông báo sai");
    }

    @Test (priority = 11)
    public void TC_11_tenDNKyTuKhac(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("abc@#$#");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(checkElementExist(locator_CCN.alertMessage),"Fail. Alert messenge display");
        String alertMessage = driver.findElement(By.xpath(locator_CCN.alertMessage)).getText();
        Assert.assertEquals(alertMessage,"Tài khoản hoặc mật khẩu không chính xác","Thông báo sai");
    }



    @Test (priority = 12)
    public void TC_12_loginSuccess(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(driver.findElement(By.xpath(locator_CCN.dangKiKiemTra)).isDisplayed(),"Không đến được trang chủ");
        boolean checkURL = driver.getCurrentUrl().contains("login");
        Assert.assertFalse(checkURL);
    }

    @Test (priority = 13)
    public void TC_13_MKSai(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(checkElementExist(locator_CCN.alertMessage),"Fail. Alert messenge display");
        String alertMessage = driver.findElement(By.xpath(locator_CCN.alertMessage)).getText();
        Assert.assertEquals(alertMessage,"Tài khoản hoặc mật khẩu không chính xác","Thông báo sai");
    }

    @Test (priority = 14)
    public void TC_14_MKThieuChuHoaKyTuDacBiet(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("12345");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(checkElementExist(locator_CCN.alertMessage),"Fail. Alert messenge display");
        String alertMessage = driver.findElement(By.xpath(locator_CCN.alertMessage)).getText();
        Assert.assertEquals(alertMessage,"Tài khoản hoặc mật khẩu không chính xác","Thông báo sai");
    }

    @Test (priority = 15)
    public void TC_15_MKThieuChuHoa(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456a@@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(checkElementExist(locator_CCN.alertMessage),"Fail. Alert messenge display");
        String alertMessage = driver.findElement(By.xpath(locator_CCN.alertMessage)).getText();
        Assert.assertEquals(alertMessage,"Tài khoản hoặc mật khẩu không chính xác","Thông báo sai");
    }


    @Test (priority = 16)
    public void TC_16_MKThieuChuThuong(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456AA@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(checkElementExist(locator_CCN.alertMessage),"Fail. Alert messenge display");
        String alertMessage = driver.findElement(By.xpath(locator_CCN.alertMessage)).getText();
        Assert.assertEquals(alertMessage,"Tài khoản hoặc mật khẩu không chính xác","Thông báo sai");
    }


    @Test (priority = 17)
    public void TC_17_MKThieuKyTuDacBiet(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456AAa");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        //Assert.assertTrue(checkElementExist(locator_CCN.alertMessageVoHieuHoa),"Fail. Alert messenge display");
        String alertMessageVoHieuHoa = driver.findElement(By.xpath(locator_CCN.alertMessageVoHieuHoa)).getText();
        Assert.assertEquals(alertMessageVoHieuHoa,"Đăng nhập thất bại quá 5 lần, tài khoản đã bị vô hiệu hóa","Thông báo sai");
    }

    @Test (priority = 18)
    public void TC_18_validateMatkhau(){
        // driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456AAa");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        sleep(1);
        Assert.assertTrue(checkElementExist(locator_CCN.alertMessageVoHieuHoa1),"Fail. Alert messenge display");
        String alertMessageVoHieuHoa1 = driver.findElement(By.xpath(locator_CCN.alertMessageVoHieuHoa1)).getText();
        Assert.assertEquals(alertMessageVoHieuHoa1,"Tài khoản đã bị vô hiệu hóa","Thông báo sai");
    }








}

