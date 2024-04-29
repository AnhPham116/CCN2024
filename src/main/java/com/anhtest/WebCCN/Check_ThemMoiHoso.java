package com.anhtest.WebCCN;

import com.anhtest.Locators.locator_CCN;
import com.anhtest.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Check_ThemMoiHoso extends BaseTest {

    public void loginSuccess() {
        driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys("6666688888");
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys("123456aA@");
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
    }

    public void donDangKy() {

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
        driver.findElement(By.xpath(locator_CCN.inputHopDongMuaBanNgay)).sendKeys("04/26/2024");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputHoaDonMuaBan)).click();
        driver.findElement(By.xpath(locator_CCN.inputHoaDonMuaBan)).sendKeys("3FMX0342");

        driver.findElement(By.xpath(locator_CCN.inputHoaDonMuaBanNgay)).click();
        driver.findElement(By.xpath(locator_CCN.inputHoaDonMuaBanNgay)).sendKeys("04/27/2024");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputPhieuDongGoi)).click();
        driver.findElement(By.xpath(locator_CCN.inputPhieuDongGoi)).sendKeys("5AMX0124");

        driver.findElement(By.xpath(locator_CCN.inputPhieuDongGoiNgay)).click();
        driver.findElement(By.xpath(locator_CCN.inputPhieuDongGoiNgay)).sendKeys("04/29/2024");
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
        driver.findElement(By.xpath(locator_CCN.inputTGNhapKhauDuKienTu)).sendKeys("04/26/2024");
        sleep(1);


        driver.findElement(By.xpath(locator_CCN.inputTGNhapKhauDuKienDen)).click();
        driver.findElement(By.xpath(locator_CCN.inputTGNhapKhauDuKienDen)).sendKeys("04/30/2024");
        sleep(1);

        //Thông tin lấy mẫu kiểm tra
        driver.findElement(By.xpath(locator_CCN.inputDiaDiem)).click();
        driver.findElement(By.xpath(locator_CCN.inputDiaDiem)).sendKeys("Cảng Hải Phòng Việt Nam");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNgayDangKyLayMauTu)).click();
        driver.findElement(By.xpath(locator_CCN.inputNgayDangKyLayMauTu)).sendKeys("04/26/2024");
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNgayDangKyLayMauDen)).click();
        driver.findElement(By.xpath(locator_CCN.inputNgayDangKyLayMauDen)).sendKeys("04/30/2024");
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
        actions3.keyDown("H").keyDown("a").keyDown("i").build().perform();
        actions3.keyDown(Keys.ENTER).perform();
        actions3.keyUp(Keys.ENTER).perform();
        sleep(1);

        //Thêm tacn
        driver.findElement(By.xpath(locator_CCN.buttonBuocTiepTheo)).click();
        sleep(1);
    }

    public void themMoi() {
        driver.findElement(By.xpath(locator_CCN.dangKiKiemTra)).click();
        sleep(1);
        driver.findElement(By.xpath(locator_CCN.buttonThemMoi)).click();
        sleep(1);
    }

    @Test(priority = 1)
    public void TC_01_validateCurrentUrlAdd() {
        loginSuccess();
        themMoi();
        String loginPageUrl = driver.getCurrentUrl();
        Assert.assertEquals(loginPageUrl, "http://10.10.10.90:3001/dangkykiemtra/themmoi");
        String textThemMoiHS = driver.findElement(By.xpath(locator_CCN.textThemMoiHS)).getText();
        Assert.assertEquals(textThemMoiHS, "THÊM MỚI HỒ SƠ", "Hiển thị sai");

        boolean checkBtnXacNhan = driver.findElement(By.xpath(locator_CCN.buttonXacNhan)).isEnabled();
        Assert.assertFalse(checkBtnXacNhan, "Button Xác nhận không được tắt");
    }

    @Test(priority = 2)
    public void TC_02_checkBtnXacNhan() {
        loginSuccess();
        themMoi();
        boolean checkBtnXacNhan = driver.findElement(By.xpath(locator_CCN.buttonXacNhan)).isEnabled();
        Assert.assertFalse(checkBtnXacNhan, "Button Xác nhận không được tắt");
    }

    //Tab Đơn đăng ký
    @Test(priority = 3)
    public void TC_03_checkThongTinHS() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String thongTinHS = driver.findElement(By.xpath(locator_CCN.txtThongTinHS)).getText();
        Assert.assertEquals(thongTinHS, "Thông tin hồ sơ", "Giá trị sai");
    }

    @Test(priority = 4)
    public void TC_04_checkMaHS() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String maHS = driver.findElement(By.xpath(locator_CCN.txtMaHS)).getText();
        Assert.assertFalse(maHS.contains("*"), "Giá trị mong muốn: " + maHS);
    }

    @Test(priority = 5)
    public void TC_05_checkTrangThaiHS() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String trangThaiHS = driver.findElement(By.xpath(locator_CCN.txtTrangThaiHS)).getText();
        Assert.assertEquals(trangThaiHS, "Trạng thái hồ sơ *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(trangThaiHS.contains("*"), "Giá trị mong muốn: " + trangThaiHS);
    }

    @Test(priority = 6)
    public void TC_06_checkNgayTaoHS() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String ngayTaoHS = driver.findElement(By.xpath(locator_CCN.txtNgayTao)).getText();
        Assert.assertEquals(ngayTaoHS, "Ngày tạo *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(ngayTaoHS.contains("*"), "Giá trị mong muốn: " + ngayTaoHS);
    }

    @Test(priority = 7)
    public void TC_07_checkLoaiHTKTHS() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtLoaiHTKT = driver.findElement(By.xpath(locator_CCN.txtLoaiHTKT)).getText();
        Assert.assertEquals(txtLoaiHTKT, "Loại hình thức kiểm tra *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtLoaiHTKT.contains("*"), "Giá trị mong muốn: " + txtLoaiHTKT);
    }

    @Test(priority = 8)
    public void TC_08_checkMaHSThayThe() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtMaHSThayThe = driver.findElement(By.xpath(locator_CCN.txtMaHSThayThe)).getText();
        Assert.assertEquals(txtMaHSThayThe, "Mã hồ sơ được thay thế", "Giá trị sai");
    }

    @Test(priority = 9)
    public void TC_09_checkSoGDKThayThe() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtGĐK = driver.findElement(By.xpath(locator_CCN.txtGĐK)).getText();
        Assert.assertEquals(txtGĐK, "Số giấy đăng ký được thay thế", "Giá trị sai");
    }

    @Test(priority = 10)
    public void TC_10_checkTepGDKThayThe() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtTepGĐK = driver.findElement(By.xpath(locator_CCN.txtTepGĐK)).getText();
        Assert.assertEquals(txtTepGĐK, "Chọn tệp giấy đăng ký được thay thế", "Giá trị sai");
    }

    @Test(priority = 11)
    public void TC_11_checkGhiChu() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtGhiChu = driver.findElement(By.xpath(locator_CCN.txtGhiChu)).getText();
        Assert.assertEquals(txtGhiChu, "Ghi chú: Loại hình thức 2a, 2b chỉ chọn nhóm hàng hóa: Thức ăn truyền thống, Thức ăn hỗn hợp hoàn chỉnh: có mã số TACN. Loại hình thức 2c chọn được 5 nhóm hàng hóa", "Giá trị sai");
    }

    @Test(priority = 12)
    public void TC_12_checkThongTinFile() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtThongTinFile = driver.findElement(By.xpath(locator_CCN.txtThongTinFile)).getText();
        Assert.assertEquals(txtThongTinFile, "Thông tin file đính kèm", "Giá trị sai");
    }

    @Test(priority = 13)
    public void TC_13_checkHopDongMBSo() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtHopDongMBSo = driver.findElement(By.xpath(locator_CCN.txtHopDongMBSo)).getText();
        Assert.assertEquals(txtHopDongMBSo, "Hợp đồng mua bán số *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtHopDongMBSo.contains("*"), "Giá trị mong muốn: " + txtHopDongMBSo);

    }

    @Test(priority = 14)
    public void TC_14_checkHopDongMBNgay() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtHopDongMBNgay = driver.findElement(By.xpath(locator_CCN.txtHopDongMBNgay)).getText();
        Assert.assertEquals(txtHopDongMBNgay, "Hợp đồng mua bán ngày *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtHopDongMBNgay.contains("*"), "Giá trị mong muốn: " + txtHopDongMBNgay);

    }

    @Test(priority = 15)
    public void TC_15_checkHoaDonMBSo() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtHoaDonMBSo = driver.findElement(By.xpath(locator_CCN.txtHoaDonMBSo)).getText();
        Assert.assertEquals(txtHoaDonMBSo, "Hóa đơn mua bán số *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtHoaDonMBSo.contains("*"), "Giá trị mong muốn: " + txtHoaDonMBSo);

    }

    @Test(priority = 16)
    public void TC_16_checkHoadonMBNgay() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtHoaDonMBNgay = driver.findElement(By.xpath(locator_CCN.txtHoaDonMBNgay)).getText();
        Assert.assertEquals(txtHoaDonMBNgay, "Hóa đơn mua bán ngày *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtHoaDonMBNgay.contains("*"), "Giá trị mong muốn: " + txtHoaDonMBNgay);

    }

    @Test(priority = 17)
    public void TC_17_checkPhieuDongGoiSo() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtPhieuDongGoiSo = driver.findElement(By.xpath(locator_CCN.txtPhieuDongGoiSo)).getText();
        Assert.assertEquals(txtPhieuDongGoiSo, "Phiếu đóng gói số *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtPhieuDongGoiSo.contains("*"), "Giá trị mong muốn: " + txtPhieuDongGoiSo);

    }

    @Test(priority = 18)
    public void TC_18_checkPhieuDongGoiNgay() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtPhieuDongGoiNgay = driver.findElement(By.xpath(locator_CCN.txtPhieuDongGoiNgay)).getText();
        Assert.assertEquals(txtPhieuDongGoiNgay, "Phiếu đóng gói ngày *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtPhieuDongGoiNgay.contains("*"), "Giá trị mong muốn: " + txtPhieuDongGoiNgay);

    }

    //BenBanHang
    @Test(priority = 19)
    public void TC_19_checkBenBanHang() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtBenBanHang = driver.findElement(By.xpath(locator_CCN.txtBenBanHang)).getText();
        Assert.assertEquals(txtBenBanHang, "Bên bán hàng", "Giá trị sai");
        //Kiểm tra có chứa hay không
        //Assert.assertTrue(txtBenBanHang.contains("*"), "Giá trị mong muốn: "+ txtBenBanHang);

    }

    @Test(priority = 20)
    public void TC_20_checkTenBenBanHang() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtTenBBH = driver.findElement(By.xpath(locator_CCN.txtTenBBH)).getText();
        Assert.assertEquals(txtTenBBH, "Tên bên bán hàng *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtTenBBH.contains("*"), "Giá trị mong muốn: " + txtTenBBH);

    }

    @Test(priority = 21)
    public void TC_21_checkNuocBenBanHang() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtNuocBenBanHang = driver.findElement(By.xpath(locator_CCN.txtNuocBenBanHang)).getText();
        Assert.assertEquals(txtNuocBenBanHang, "Nước *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtNuocBenBanHang.contains("*"), "Giá trị mong muốn: " + txtNuocBenBanHang);

    }

    @Test(priority = 22)
    public void TC_22_checkDiaChiBenBanHang() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtDiaChiBenBanHang = driver.findElement(By.xpath(locator_CCN.txtDiaChiBenBanHang)).getText();
        Assert.assertEquals(txtDiaChiBenBanHang, "Địa chỉ *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtDiaChiBenBanHang.contains("*"), "Giá trị mong muốn: " + txtDiaChiBenBanHang);

    }

    @Test(priority = 23)
    public void TC_23_checkDienThoaiBenBanHang() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtDienThoaiBenBanHang = driver.findElement(By.xpath(locator_CCN.txtDienThoaiBenBanHang)).getText();
        Assert.assertEquals(txtDienThoaiBenBanHang, "Điện thoại", "Giá trị sai");

    }


    @Test(priority = 24)
    public void TC_24_checkFaxBenBanHang() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtFaxBenBanHang = driver.findElement(By.xpath(locator_CCN.txtFaxBenBanHang)).getText();
        Assert.assertEquals(txtFaxBenBanHang, "Fax", "Giá trị sai");

    }

    @Test(priority = 25)
    public void TC_25_checkNoiXuatHangBenBanHang() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtNoiXuatHangBenBanHang = driver.findElement(By.xpath(locator_CCN.txtNoiXuatHangBenBanHang)).getText();
        Assert.assertEquals(txtNoiXuatHangBenBanHang, "Nơi xuất hàng *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtNoiXuatHangBenBanHang.contains("*"), "Giá trị mong muốn: " + txtNoiXuatHangBenBanHang);
    }

    //BenMuaHang
    @Test(priority = 26)
    public void TC_26_checkBenMuaHang() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtBenMuaHang = driver.findElement(By.xpath(locator_CCN.txtBenMuaHang)).getText();
        Assert.assertEquals(txtBenMuaHang, "Bên mua hàng", "Giá trị sai");

    }

    @Test(priority = 27)
    public void TC_27_checkTenBenMua() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtTenBenMuaHang = driver.findElement(By.xpath(locator_CCN.txtTenBenMuaHang)).getText();
        Assert.assertEquals(txtTenBenMuaHang, "Tên bên mua hàng *", "Giá trị sai");
        //Kiểm tra có chứa hay không
        Assert.assertTrue(txtTenBenMuaHang.contains("*"), "Giá trị mong muốn: " + txtTenBenMuaHang);
    }

    @Test(priority = 28)
    public void TC_28_checkDienThoaiBenMua() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtDienThoaiBenMuaHang = driver.findElement(By.xpath(locator_CCN.txtDienThoaiBenMuaHang)).getText();
        Assert.assertEquals(txtDienThoaiBenMuaHang, "Điện thoại", "Giá trị sai");

    }

    @Test(priority = 29)
    public void TC_29_checkDiaChiBenMua() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtDiaChiBenMuaHang = driver.findElement(By.xpath(locator_CCN.txtDiaChiBenMuaHang)).getText();
        Assert.assertEquals(txtDiaChiBenMuaHang, "Địa chỉ *", "Giá trị sai");
        Assert.assertTrue(txtDiaChiBenMuaHang.contains("*"), "Giá trị mong muốn: " + txtDiaChiBenMuaHang);
    }

    @Test(priority = 30)
    public void TC_30_checkNoiNhanHangBenMua() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtNoiNhanHangBenMuaHang = driver.findElement(By.xpath(locator_CCN.txtNoiNhanHangBenMuaHang)).getText();
        Assert.assertEquals(txtNoiNhanHangBenMuaHang, "Nơi nhận hàng *", "Giá trị sai");
        Assert.assertTrue(txtNoiNhanHangBenMuaHang.contains("*"), "Giá trị mong muốn: " + txtNoiNhanHangBenMuaHang);
    }

    @Test(priority = 31)
    public void TC_31_checkFaxBenMua() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtFaxBenMuaHang = driver.findElement(By.xpath(locator_CCN.txtFaxBenMuaHang)).getText();
        Assert.assertEquals(txtFaxBenMuaHang, "Fax", "Giá trị sai");
    }

    @Test(priority = 32)
    public void TC_32_checkTGNhapKhauBenMua() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtTGNhapKhauBenMuaHang = driver.findElement(By.xpath(locator_CCN.txtTGNhapKhauBenMuaHang)).getText();
        Assert.assertEquals(txtTGNhapKhauBenMuaHang, "Thời gian nhập khẩu dự kiến *", "Giá trị sai");
        Assert.assertTrue(txtTGNhapKhauBenMuaHang.contains("*"), "Giá trị mong muốn: " + txtTGNhapKhauBenMuaHang);

    }

    //Thongtinlaymau
    @Test(priority = 33)
    public void TC_33_checkThongTinLayMau() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtThongTinLayMau = driver.findElement(By.xpath(locator_CCN.txtThongTinLayMau)).getText();
        Assert.assertEquals(txtThongTinLayMau, "Thông tin lấy mẫu kiểm tra", "Giá trị sai");

    }

    @Test(priority = 34)
    public void TC_34_checkDiaDiemTapKet() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtDiaiemTapKet = driver.findElement(By.xpath(locator_CCN.txtDiaiemTapKet)).getText();
        Assert.assertEquals(txtDiaiemTapKet, "Địa điểm tập kết hàng", "Giá trị sai");
    }

    @Test(priority = 35)
    public void TC_35_checkNgayDKLayMau() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtNgayDKLayMau = driver.findElement(By.xpath(locator_CCN.txtNgayDKLayMau)).getText();
        Assert.assertEquals(txtNgayDKLayMau, "Ngày đăng ký lấy mẫu kiểm tra *", "Giá trị sai");
        Assert.assertTrue(txtNgayDKLayMau.contains("*"), "Giá trị mong muốn: " + txtNgayDKLayMau);

    }


    @Test(priority = 36)
    public void TC_36_checkDiaDiemLayMau() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtDiaDiemLayMau = driver.findElement(By.xpath(locator_CCN.txtDiaDiemLayMau)).getText();
        Assert.assertEquals(txtDiaDiemLayMau, "Địa điểm đăng ký lấy mẫu kiểm tra", "Giá trị sai");
    }

    //Thongtinlienhe
    @Test(priority = 37)
    public void TC_37_checkThongTinLH() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtTTLienHe = driver.findElement(By.xpath(locator_CCN.txtTTLienHe)).getText();
        Assert.assertEquals(txtTTLienHe, "Thông tin liên hệ", "Giá trị sai");
    }

    @Test(priority = 38)
    public void TC_38_checkNguoiLH() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtNguoiLienHe = driver.findElement(By.xpath(locator_CCN.txtNguoiLienHe)).getText();
        Assert.assertEquals(txtNguoiLienHe, "Người liên hệ *", "Giá trị sai");
        Assert.assertTrue(txtNguoiLienHe.contains("*"), "Giá trị mong muốn: " + txtNguoiLienHe);

    }

    @Test(priority = 39)
    public void TC_39_checkSDTNguoiLH() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtSDTNguoiLienHe = driver.findElement(By.xpath(locator_CCN.txtSDTNguoiLienHe)).getText();
        Assert.assertEquals(txtSDTNguoiLienHe, "Số điện thoại *", "Giá trị sai");
        Assert.assertTrue(txtSDTNguoiLienHe.contains("*"), "Giá trị mong muốn: " + txtSDTNguoiLienHe);
    }

    @Test(priority = 40)
    public void TC_40_checkDiaChiNguoiLH() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtDiaChiNguoiLienHe = driver.findElement(By.xpath(locator_CCN.txtDiaChiNguoiLienHe)).getText();
        Assert.assertEquals(txtDiaChiNguoiLienHe, "Địa chỉ", "Giá trị sai");
    }

    @Test(priority = 41)
    public void TC_41_checkEmailNguoiLH() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtEmailNguoiLienHe = driver.findElement(By.xpath(locator_CCN.txtEmailNguoiLienHe)).getText();
        Assert.assertEquals(txtEmailNguoiLienHe, "Email", "Giá trị sai");
    }

    //Thong tin ky
    @Test(priority = 42)
    public void TC_44_checkTTKy() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtThongtinKyHS = driver.findElement(By.xpath(locator_CCN.txtThongtinKyHS)).getText();
        Assert.assertEquals(txtThongtinKyHS, "Thông tin ký hồ sơ (cá nhân, tổ chức)", "Giá trị sai");
    }

    @Test(priority = 43)
    public void TC_43_checkTenNguoiKy() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtTenNguoiKy = driver.findElement(By.xpath(locator_CCN.txtTenNguoiKy)).getText();
        Assert.assertEquals(txtTenNguoiKy, "Tên người ký *", "Giá trị sai");
        Assert.assertTrue(txtTenNguoiKy.contains("*"), "Giá trị mong muốn: " + txtTenNguoiKy);
    }

    @Test(priority = 44)
    public void TC_44_checkChucVuKy() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtChucVuNguoiKy = driver.findElement(By.xpath(locator_CCN.txtChucVuNguoiKy)).getText();
        Assert.assertEquals(txtChucVuNguoiKy, "Chức vụ ký *", "Giá trị sai");
        Assert.assertTrue(txtChucVuNguoiKy.contains("*"), "Giá trị mong muốn: " + txtChucVuNguoiKy);
    }

    @Test(priority = 45)
    public void TC_45_checkNoiKy() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        String txtNoiKy = driver.findElement(By.xpath(locator_CCN.txtNoiKy)).getText();
        Assert.assertEquals(txtNoiKy, "Thông tin nơi ký *", "Giá trị sai");
        Assert.assertTrue(txtNoiKy.contains("*"), "Giá trị mong muốn: " + txtNoiKy);
    }

    //Check tab3
    @Test(priority = 46)
    public void TC_46_checkDanhSachTACN() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        donDangKy();

        String txtDSTACN = driver.findElement(By.xpath(locator_CCN.txtDSTACN)).getText();
        Assert.assertEquals(txtDSTACN, "Danh sách thức ăn chăn nuôi", "Giá trị sai");

    }

    @Test(priority = 47)
    public void TC_47_checkbuttonThemTACN() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        donDangKy();

        //Kiểm tra nút thêm tacn có được bật không
        boolean checkButtonLogin = driver.findElement(By.xpath(locator_CCN.buttonThemTACN)).isEnabled();
        Assert.assertTrue(checkButtonLogin, "Button ThêmTACN không được bật");
    }

    @Test(priority = 48)
    public void TC_48_checkbuttonLuu() {
        loginSuccess();
        themMoi();
        driver.findElement(By.xpath(locator_CCN.btnBuocTiepTheo1)).click();

        donDangKy();

        //Kiểm tra nút lưu có được bật không
        boolean buttonLuu = driver.findElement(By.xpath(locator_CCN.buttonLuu1)).isDisplayed();
        Assert.assertTrue(buttonLuu, "Button Lưu không được tắt");
    }

}
