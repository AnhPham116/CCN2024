package com.anhtest.WebCCN;

import com.anhtest.Bai5_Locator.Base_CNN;
import com.anhtest.Locators.locator_CCN;
import com.anhtest.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validate_ThemTACN extends BaseTest {
//    public String userName = "6666688888";
//    public String passWord = "123456aA@";
    public  void loginSuccess() {
        driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys(userName);
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys(passWord);
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
    }
    public void  tab2() {
        loginSuccess();
        driver.findElement(By.xpath(locator_CCN.dangKiKiemTra)).click();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.buttonThemMoi)).click();
        sleep(2);

        driver.findElement(By.xpath(Base_CNN.btnBuocTiepTheo)).click();
        sleep(1);


        WebElement dropdownElement = driver.findElement(By.xpath(locator_CCN.inputLoaiHinhThucKiemTra));
        dropdownElement.click();

        // Tạo một đối tượng Select từ dropdown element

        //Thông tin hồ sơ

        Actions actions = new Actions(driver);
        actions.keyDown("2").keyUp("2").keyDown("c").keyUp("c").build().perform();
        actions.keyDown(Keys.ENTER).perform();
        actions.keyUp(Keys.ENTER).perform();
        sleep(1);

        //Thông tin file đính kèm
        driver.findElement(By.xpath(locator_CCN.inputHopDongMuaBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputHopDongMuaBan)).sendKeys("MF314700-1");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputHopDongMuaBanNgay)).click();
        driver.findElement(By.xpath(locator_CCN.inputHopDongMuaBanNgay)).sendKeys("01/04/2024");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputHoaDonMuaBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputHoaDonMuaBan)).sendKeys("3FMX0342");

        driver.findElement(By.xpath(locator_CCN.inputHoaDonMuaBanNgay)).click();
        driver.findElement(By.xpath(locator_CCN.inputHoaDonMuaBanNgay)).sendKeys("02/04/2024");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputPhieuDongGoi)).click();
        driver.findElement(By.xpath(locator_CCN.inputPhieuDongGoi)).sendKeys("5AMX0124");

        driver.findElement(By.xpath(locator_CCN.inputPhieuDongGoiNgay)).click();
        driver.findElement(By.xpath(locator_CCN.inputPhieuDongGoiNgay)).sendKeys("03/04/2024");
        sleep(1);


        //Bên bán hàng
        driver.findElement(By.xpath(locator_CCN.inputTenBenBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputTenBenBan)).sendKeys("NUACID NUTRITION CO., LTD vs2");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNuoc)).click();
        Actions actions1 = new Actions(driver);
        actions1.keyDown("T").keyDown("r").keyDown("u").keyDown("n").keyDown("g").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
//        actions.keyDown(Keys.ENTER).perform();
//        actions.keyUp(Keys.ENTER).perform();
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).sendKeys("No.3 Guangyi road, Guangzhou-Quingyuam Industrial park, Shijao town Qingcheng District, Qingyuan city, Guangdong China");
        sleep(1);
        driver.findElement(By.xpath(locator_CCN.inputDienThoaiBenBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputDienThoaiBenBan)).sendKeys("0973056888");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputFaxBenBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputFaxBenBan)).sendKeys("999999999");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNoiXuatHang)).click();
        driver.findElement(By.xpath(locator_CCN.inputNoiXuatHang)).sendKeys("Cảng Hàng Châu");
        sleep(1);

        //Bên mua hàng
        driver.findElement(By.xpath(locator_CCN.inputFaxBenMua)).click();
        driver.findElement(By.xpath(locator_CCN.inputFaxBenMua)).sendKeys("66668888");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNoiNhanHang)).click();
        driver.findElement(By.xpath(locator_CCN.inputNoiNhanHang)).sendKeys("Cảng Hải Phòng Việt Nam");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputTGNhapKhauDuKienTu)).click();
        driver.findElement(By.xpath(locator_CCN.inputTGNhapKhauDuKienTu)).sendKeys("04/04/2024");
        sleep(1);


        driver.findElement(By.xpath(locator_CCN.inputTGNhapKhauDuKienDen)).click();
        driver.findElement(By.xpath(locator_CCN.inputTGNhapKhauDuKienDen)).sendKeys("04/05/2024");
        sleep(1);

        //Thông tin lấy mẫu kiểm tra
        driver.findElement(By.xpath(locator_CCN.inputDiaDiem)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaDiem)).sendKeys("Cảng Hải Phòng Việt Nam");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNgayDangKyLayMauTu)).click();
        driver.findElement(By.xpath(locator_CCN.inputNgayDangKyLayMauTu)).sendKeys("01/20/2024");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNgayDangKyLayMauDen)).click();
        driver.findElement(By.xpath(locator_CCN.inputNgayDangKyLayMauDen)).sendKeys("02/04/2024");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputDiaDiemDangKy)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaDiemDangKy)).sendKeys("Cảng Hải Phòng Việt Nam");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNguoiLienHe)).click();
        driver.findElement(By.xpath(locator_CCN.inputNguoiLienHe)).sendKeys("Lê Thị Nhung");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputSoDienThoai)).click();
        driver.findElement(By.xpath(locator_CCN.inputSoDienThoai)).sendKeys("0989888777");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputDiaChi)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaChi)).sendKeys("Hải Dương");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputEmail)).click();
        driver.findElement(By.xpath(locator_CCN.inputEmail)).sendKeys("nhung123@gmail.com");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputTenNguoiKy)).click();
        driver.findElement(By.xpath(locator_CCN.inputTenNguoiKy)).sendKeys("Đinh Đức Thiện");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputChucVuKy)).click();
        driver.findElement(By.xpath(locator_CCN.inputChucVuKy)).sendKeys("Phó giám đốc cục chăn nuôi tỉnh Hải Dương");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputThongTinNoiKy)).click();

        Actions actions3 = new Actions(driver);
        actions3.keyDown("H").keyDown("a").build().perform();
        actions3.keyDown(Keys.ENTER).perform();
        actions3.keyUp(Keys.ENTER).perform();
        sleep(1);

        //Thêm tacn
        driver.findElement(By.xpath(locator_CCN.buttonBuocTiepTheo)).click();
        sleep(1);

        //Thêm tacn1
        driver.findElement(By.xpath(locator_CCN.buttonThemTACN)).click();
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.buttonThem_Sua)).click();
        sleep(1);
    }


    @Test(priority = 1)
    public void detrong() {
        tab2();

        String msgTenTA = driver.findElement(By.xpath(locator_CCN.msgTenTA)).getText();
        Assert.assertEquals(msgTenTA, "Thông tin bắt buộc nhập", "Giá trị sai");

        String msgNhomTA = driver.findElement(By.xpath(locator_CCN.msgNhomTA)).getText();
        Assert.assertEquals(msgNhomTA, "Thông tin bắt buộc nhập", "Giá trị sai");

        String msgPhanNhomTA = driver.findElement(By.xpath(locator_CCN.msgPhanNhomTA)).getText();
        Assert.assertEquals(msgPhanNhomTA, "Thông tin bắt buộc nhập", "Giá trị sai");

        String msgLoaiTA = driver.findElement(By.xpath(locator_CCN.msgLoaiTA)).getText();
        Assert.assertEquals(msgLoaiTA, "Thông tin bắt buộc nhập", "Giá trị sai");
    }

    @Test(priority = 2)
    public void TC02_hangSXLonHon255kt() {
        tab2();

        driver.findElement(By.xpath(locator_CCN.inputHangSX)).sendKeys("demkytuuuuuuuuuuuuuuuuuuuuuuuuuuuuuukidcfsdcdcccccccccccssssssssssssssssssssssssssssssssssssfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");

        String msgHangSX = driver.findElement(By.xpath(locator_CCN.msgHangSX)).getText();
        Assert.assertEquals(msgHangSX, "Tối đa 255 ký tự", "Giá trị sai");
    }

    @Test(priority = 3)
    public void TC03_dangMauLonHon255kt() {
        tab2();

        driver.findElement(By.xpath(locator_CCN.inputDangMau)).sendKeys("demkytuuuuuuuuuuuuuuuuuuuuuuuuuuuuuukidcfsdcdcccccccccccssssssssssssssssssssssssssssssssssssfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");

        String msgDangMau = driver.findElement(By.xpath(locator_CCN.msgDangMau)).getText();
        Assert.assertEquals(msgDangMau, "Tối đa 255 ký tự", "Giá trị sai");

    }

    @Test(priority = 4)
    public void TC04_soHieuTCCSLonHon255kt() {
        tab2();

        driver.findElement(By.xpath(locator_CCN.inputSoHieuTCCS)).sendKeys("demkytuuuuuuuuuuuuuuuuuuuuuuuuuuuuuukidcfsdcdcccccccccccssssssssssssssssssssssssssssssssssssfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");

        String msgSoHieu = driver.findElement(By.xpath(locator_CCN.msgSoHieu)).getText();
        Assert.assertEquals(msgSoHieu, "Tối đa 255 ký tự", "Giá trị sai");

    }

    @Test(priority = 5)
    public void TC05_giaTriTACNQua255kt() {
        tab2();

        driver.findElement(By.xpath(locator_CCN.inputGiaTriTACN)).sendKeys("1234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891544");

        String msgGiaTriTACN = driver.findElement(By.xpath(locator_CCN.msgGiaTriTACN)).getText();
        Assert.assertEquals(msgGiaTriTACN, "Giá trị không hợp lệ", "Giá trị sai");

    }

    @Test(priority = 6)
    public void TC06_giaTriTACNQua255kt() {
        tab2();

        driver.findElement(By.xpath(locator_CCN.inputGiaTriTACN)).sendKeys("1234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891234567891544");

        String msgGiaTriTACN = driver.findElement(By.xpath(locator_CCN.msgGiaTriTACN)).getText();
        Assert.assertEquals(msgGiaTriTACN, "Giá trị không hợp lệ", "Giá trị sai");

    }

    @Test(priority = 7)
    public void TC07_giaTriTACNKhacSo() {
        tab2();

        driver.findElement(By.xpath(locator_CCN.inputGiaTriTACN)).sendKeys("anhpham");

        String msgGiaTriTACN1 = driver.findElement(By.xpath(locator_CCN.msgGiaTriTACN)).getText();
        Assert.assertEquals(msgGiaTriTACN1, "Giá trị không hợp lệ", "Giá trị sai");

    }

    @Test(priority = 8)
    public void TC08_giaTriUSDKhacSo() {
        tab2();

        driver.findElement(By.xpath(locator_CCN.inputUSD)).sendKeys("anhpham");

        String msgGiaTriUSD = driver.findElement(By.xpath(locator_CCN.msgGiaTriUSD)).getText();
        Assert.assertEquals(msgGiaTriUSD, "Giá trị không hợp lệ", "Giá trị sai");

    }





}
