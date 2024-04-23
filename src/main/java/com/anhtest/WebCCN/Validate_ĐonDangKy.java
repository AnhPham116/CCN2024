package com.anhtest.WebCCN;

import com.anhtest.Locators.locator_CCN;
import com.anhtest.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Validate_ĐonDangKy extends BaseTest {
    public String userName = "6666688888";
    public String passWord = "123456aA@";

    public void loginSuccess() {
        driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys(userName);
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys(passWord);
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
    }

    public void themMoi() {
        driver.findElement(By.xpath(locator_CCN.dangKiKiemTra)).click();
        sleep(1);
        driver.findElement(By.xpath(locator_CCN.buttonThemMoi)).click();
        sleep(1);

    }

    @Test(priority = 1)
    public void TC_01_deTrong(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        String loaiBatBuocChon = driver.findElement(By.xpath(locator_CCN.loaiBatBuocChon)).getText();
        Assert.assertEquals(loaiBatBuocChon,"Thông tin bắt buộc chọn","Giá trị sai");

        String hopDongBatBuoc = driver.findElement(By.xpath(locator_CCN.hopDongBatBuoc)).getText();
        Assert.assertEquals(hopDongBatBuoc,"Thông tin bắt buộc nhập","Giá trị sai");

    }

    //valTenbenban
    @Test(priority = 2)
    public void TC_02_tenBenBanLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputTenBenBan)).sendKeys("demkytuuuuuuuuuuuuuuuuuuuuuuuuuuuuuukidcfsdcdcccccccccccssssssssssssssssssssssssssssssssssssfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");

        String msgTenBB = driver.findElement(By.xpath(locator_CCN.msgTenBB)).getText();
        Assert.assertEquals(msgTenBB,"Tối đa 255 ký tự","Giá trị sai");
    }

    @Test(priority = 3)
    public void TC_03_diaChiBenBanLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).sendKeys("anhphammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmanhphammmmmmmmaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaddddddddddddddddwwwwwwwwwwwwwwwwwwwwwwwwwwwwcccccccccccccccccsssssssssssssssaaaaaaaaaaaaaaawwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwxxxxxxxxxxxxxxxxxxxxxdasa");

        String msgDiaChiBB = driver.findElement(By.xpath(locator_CCN.msgDiaChiBB)).getText();
        Assert.assertEquals(msgDiaChiBB,"Tối đa 255 kí tự","Giá trị sai");
    }

    @Test(priority = 4)
    public void TC_04_dienthoaiBenBanLonHon20kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        WebElement dropdownElement = driver.findElement(By.xpath(locator_CCN.inputLoaiHinhThucKiemTra));
        dropdownElement.click();
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
        actions1.keyDown("V").keyDown("i").keyDown("e").keyDown("t").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).sendKeys("No.3 Guangyi road, Guangzhou-Quingyuam Industrial park, Shijao town Qingcheng District, Qingyuan city, Guangdong China");
        sleep(1);

        //khi k chạy tc1 thì phải run cau lenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputDienThoaiBenBan)).sendKeys("098765432543254321433");
        String msgDienThoaiBB = driver.findElement(By.xpath(locator_CCN.msgDienThoaiBB)).getText();
        Assert.assertEquals(msgDienThoaiBB,"Số điện thoại không hợp lệ","Giá trị sai");
    }

    @Test(priority = 5)
    public void TC_05_dienthoaiNhapKTKhac(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        WebElement dropdownElement = driver.findElement(By.xpath(locator_CCN.inputLoaiHinhThucKiemTra));
        dropdownElement.click();
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
        actions1.keyDown("V").keyDown("i").keyDown("e").keyDown("t").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        sleep(1);
        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).sendKeys("No.3 Guangyi road, Guangzhou-Quingyuam Industrial park, Shijao town Qingcheng District, Qingyuan city, Guangdong China");
        sleep(1);

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputDienThoaiBenBan)).sendKeys("anhpham");
        String msgDienThoaiBB = driver.findElement(By.xpath(locator_CCN.msgDienThoaiBB)).getText();
        Assert.assertEquals(msgDienThoaiBB,"Số điện thoại không hợp lệ","Giá trị sai");
    }

    @Test(priority = 6)
    public void TC_06_noiXuatHangBenBanLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        WebElement dropdownElement = driver.findElement(By.xpath(locator_CCN.inputLoaiHinhThucKiemTra));
        dropdownElement.click();
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
        actions1.keyDown("V").keyDown("i").keyDown("e").keyDown("t").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        sleep(1);
        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaChiBenBan)).sendKeys("No.3 Guangyi road, Guangzhou-Quingyuam Industrial park, Shijao town Qingcheng District, Qingyuan city, Guangdong China");
        sleep(1);
        driver.findElement(By.xpath(locator_CCN.inputDienThoaiBenBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputDienThoaiBenBan)).sendKeys("0973056888");
        sleep(1);

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputNoiXuatHang)).sendKeys("HaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhongggg");
        String msgNoiXuatHangBB = driver.findElement(By.xpath(locator_CCN.msgNoiXuatHangBB)).getText();
        Assert.assertEquals(msgNoiXuatHangBB,"Tối đa 255 ký tự","Giá trị sai");
    }

    @Test(priority = 7)
    public void TC_07_noiNhanHangBenMuaLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        WebElement dropdownElement = driver.findElement(By.xpath(locator_CCN.inputLoaiHinhThucKiemTra));
        dropdownElement.click();
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
        actions1.keyDown("V").keyDown("i").keyDown("e").keyDown("t").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
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

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputNoiNhanHang)).sendKeys("HaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhongggg");
        String msgNoiNhanHangBM = driver.findElement(By.xpath(locator_CCN.msgNoiXuatHangBB)).getText();
        Assert.assertEquals(msgNoiNhanHangBM,"Tối đa 255 ký tự","Giá trị sai");
    }

    @Test(priority = 8)
    public void TC_08_diaDiemTapKetHangLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        WebElement dropdownElement = driver.findElement(By.xpath(locator_CCN.inputLoaiHinhThucKiemTra));
        dropdownElement.click();
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
        actions1.keyDown("V").keyDown("i").keyDown("e").keyDown("t").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
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
        driver.findElement(By.xpath(locator_CCN.inputTGNhapKhauDuKienDen)).sendKeys("05/05/2024");
        sleep(1);

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputDiaDiem)).sendKeys("HaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhongggg");
        String msgDiaDiemTapKet = driver.findElement(By.xpath(locator_CCN.msgDiaDiemTapKet)).getText();
        Assert.assertEquals(msgDiaDiemTapKet,"Tối đa 255 kí tự","Giá trị sai");
    }

    @Test(priority = 9)
    public void TC_09_diaDiemDKLayMauLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputDiaDiemDangKy)).sendKeys("HaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhongggg");
        String msgDiaDiemDK = driver.findElement(By.xpath(locator_CCN.msgDiaDiemTapKet)).getText();
        Assert.assertEquals(msgDiaDiemDK,"Tối đa 255 kí tự","Giá trị sai");
    }

    @Test(priority = 10)
    public void TC_10_thongTinLienHeLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();


        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputNguoiLienHe)).sendKeys("HaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhongggg");
        String msgNguoiLienHe = driver.findElement(By.xpath(locator_CCN.msgDiaDiemTapKet)).getText();
        Assert.assertEquals(msgNguoiLienHe,"Tối đa 255 kí tự","Giá trị sai");
    }

    @Test(priority = 11)
    public void TC_11_dienthoaiNguoiKyLonHon20kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        //khi k chạy tc1 thì phải run cau lenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputSoDienThoai)).sendKeys("098765432543254321433");
        String msgDienThoai = driver.findElement(By.xpath(locator_CCN.msgDienThoaiBB)).getText();
        Assert.assertEquals(msgDienThoai,"Số điện thoại không hợp lệ","Giá trị sai");
    }

    @Test(priority = 12)
    public void TC_12_dienthoaiNhapKTKhac(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputSoDienThoai)).sendKeys("anhpham");
        String msgDienThoai1 = driver.findElement(By.xpath(locator_CCN.msgDienThoaiBB)).getText();
        Assert.assertEquals(msgDienThoai1,"Số điện thoại không hợp lệ","Giá trị sai");
    }

    @Test(priority = 13)
    public void TC_13_diaChiNguoiLHLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputDiaChi)).sendKeys("HaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhongggg");
        String msgDiaChiNguoiLienHe = driver.findElement(By.xpath(locator_CCN.msgDiaDiemTapKet)).getText();
        Assert.assertEquals(msgDiaChiNguoiLienHe,"Tối đa 255 kí tự","Giá trị sai");
    }

    @Test(priority = 14)
    public void TC_14_emailsaidinhdang(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputEmail)).sendKeys("anh1106");
        String msgemail = driver.findElement(By.xpath(locator_CCN.msgemail)).getText();
        Assert.assertEquals(msgemail,"Sai định dạng email","Giá trị sai");
    }

    @Test(priority = 15)
    public void TC_15_tenNguoiKyLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();


        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputTenNguoiKy)).sendKeys("HaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhongggg");
        String msgTenNguoiKy = driver.findElement(By.xpath(locator_CCN.msgDiaDiemTapKet)).getText();
        Assert.assertEquals(msgTenNguoiKy,"Tối đa 255 kí tự","Giá trị sai");
    }

    @Test(priority = 16)
    public void TC_16_chucVuKyLonHon255kt(){
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();


        //khi k chạy tc1 thì phải run caulenh duoi
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheoChiTiet)).click();

        driver.findElement(By.xpath(locator_CCN.inputChucVuKy)).sendKeys("HaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhonggggggggggggggggggggggggggggggggggggggggggHaiPhongggg");
        String msgChucVuKy = driver.findElement(By.xpath(locator_CCN.msgDiaDiemTapKet)).getText();
        Assert.assertEquals(msgChucVuKy,"Tối đa 255 kí tự","Giá trị sai");
    }
}

