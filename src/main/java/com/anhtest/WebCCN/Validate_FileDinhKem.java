package com.anhtest.WebCCN;

import com.anhtest.Locators.locator_CCN;
import com.anhtest.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Validate_FileDinhKem extends BaseTest {

    String userName = "6666688888";
    String passWord = "123456aA@";

    public void login(){
        driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys(userName);
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys(passWord);
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        driver.findElement(By.xpath(locator_CCN.dangKiKiemTra)).click();

        sleep(2);

        driver.findElement(By.xpath(locator_CCN.buttonThemMoi)).click();
        sleep(2);


    }

    @Test (priority = 1)
    public void TC01_btnXacNhan(){
       login();

        WebElement browseButton = driver.findElement(By.xpath("//p[@class='ml-2']"));

        // Click vào nút "Browse" để mở hộp thoại chọn tệp tin
        browseButton.click();
        sleep(2);
        String folderPath = "D:\\Test_AB\\50hoso\\BNNPTNT25230062566";
        String fileString = "\"23LM611.pdf\" \"02630QA1123.pdf.pdf\" \"coa .jpg.pdf\" \"HD_23LM611.pdf\" \"HD_02630QA1123.pdf.pdf\" \"HD_coa .jpg.pdf\" \"HD_TCCS 17  2023 VITAMIN C TIANLI .pdf.pdf\" \"ISO 9001.pdf.pdf\" \"Khac_1.pdf\" \"Khac_2.pdf\" \"Khac_3.pdf\" \"LMVC20230821.pdf\" ";


        sleep(2);
        // Sao chép đường dẫn tệp tin vào clipboard
        StringSelection stringSelection1 = new StringSelection(folderPath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_CONTROL);   //keypress đè phím giống keydown
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        sleep(1);

        //Sao chép đường dẫn tệp tin vào clipboard
        stringSelection1 = new StringSelection(fileString);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        sleep(7);

        boolean checkBtnXacNhan = driver.findElement(By.xpath(locator_CCN.buttonXacNhan)).isEnabled();
        Assert.assertTrue(checkBtnXacNhan,"Button Xác nhận không được bật");
    }

    @Test (priority = 2)
    public void TC02_PhanLoaiThanhCong(){

       login();

        WebElement browseButton = driver.findElement(By.xpath("//p[@class='ml-2']"));

        // Click vào nút "Browse" để mở hộp thoại chọn tệp tin
        browseButton.click();
        sleep(2);
        String folderPath = "D:\\Test_AB\\50hoso\\BNNPTNT25230062420";
        String fileString = "\"TCCS Threonine Xinjiang.pdf\" \"TCCS Fra Butyrin hybrid dry.pdf.pdf\" \"Packing list.pdf\" \"MF314700-1.pdf\" \"Khac_2.pdf\" \"Khac_1.pdf\" \"ISO 9001 certificate.pdf.pdf\" \"HD_FAMI QS Xinjiang Meihua.pdf.pdf\" \"HD_COA.pdf.pdf\" \"FMX0342.pdf\"  ";
        sleep(2);

        // Sao chép đường dẫn tệp tin vào clipboard
        StringSelection stringSelection = new StringSelection(folderPath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_CONTROL);   //keypress đè phím giống keydown
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        sleep(1);

        //Sao chép đường dẫn tệp tin vào clipboard
        stringSelection = new StringSelection(fileString);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        sleep(3);

        driver.findElement(By.xpath(locator_CCN.buttonXacNhan)).click();
        sleep(15);

        String filesucess = driver.findElement(By.xpath(locator_CCN.filesucess)).getText();
        Assert.assertEquals(filesucess,"Đã phân loại tài liệu thành công","Thông báo sai");
    }

    @Test (priority = 3)
    public void TC03_FileLoi(){
        login();
        WebElement browseButton = driver.findElement(By.xpath("//p[@class='ml-2']"));

        // Click vào nút "Browse" để mở hộp thoại chọn tệp tin
        browseButton.click();
        sleep(2);
        String folderPath = "D:\\Test_AB\\50hoso\\BNNPTNT25230062566";
        String fileString = "\"23LM611.pdf\" \"02630QA1123.pdf.pdf\" \"coa .jpg.pdf\" \"HD_23LM611.pdf\" \"HD_02630QA1123.pdf.pdf\" \"HD_coa .jpg.pdf\" \"HD_TCCS 17  2023 VITAMIN C TIANLI .pdf.pdf\" \"ISO 9001.pdf.pdf\" \"Khac_1.pdf\" \"Khac_2.pdf\" \"Khac_3.pdf\" \"LMVC20230821.pdf\" ";


        sleep(2);
        // Sao chép đường dẫn tệp tin vào clipboard
        StringSelection stringSelection1 = new StringSelection(folderPath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_CONTROL);   //keypress đè phím giống keydown
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        sleep(2);

        //Sao chép đường dẫn tệp tin vào clipboard
        stringSelection1 = new StringSelection(fileString);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        sleep(1);

        driver.findElement(By.xpath(locator_CCN.buttonXacNhan)).click();
        sleep(6);

        String fileLoi = driver.findElement(By.xpath(locator_CCN.fileLoi)).getText();
        Assert.assertEquals(fileLoi,"File 23LM611.pdf lỗi","Thông báo sai");

    }



}
