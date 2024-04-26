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

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class ThemMoiSuccess extends BaseTest {

    @Test
    public void LoginSuccess() {
        driver.get(InfoCCN.URL);
        driver.findElement(By.xpath(locator_CCN.inputUsername)).sendKeys(userName);
        driver.findElement(By.xpath(locator_CCN.inputPassword)).sendKeys(passWord);
        driver.findElement(By.xpath(locator_CCN.buttonLogin)).click();
        driver.findElement(By.xpath(locator_CCN.dangKiKiemTra)).click();

        sleep(2);

        driver.findElement(By.xpath(locator_CCN.buttonThemMoi)).click();
        sleep(2);


        WebElement browseButton = driver.findElement(By.xpath("//p[@class='ml-2']"));

        // Click vào nút "Browse" để mở hộp thoại chọn tệp tin
        browseButton.click();
        sleep(2);
        String folderPath = "D:\\Test_AB\\50hoso\\BNNPTNT25230062420";
        String fileString = "\"TCCS Threonine Xinjiang.pdf\" \"TCCS Fra Butyrin hybrid dry.pdf.pdf\" \"Packing list.pdf\" \"MF314700-1.pdf\" \"Khac_2.pdf\" \"Khac_1.pdf\" \"ISO 9001 certificate.pdf.pdf\" \"HD_FAMI QS Xinjiang Meihua.pdf.pdf\" \"HD_COA.pdf.pdf\" \"FMX0342.pdf\"  ";
//        String fileString = "\"TCCS Threonine Xinjiang.pdf\" \"Packing list.pdf\" \"MF314700-1.pdf\" \"Khac_2.pdf\" \"Khac_1.pdf\" \"ISO 9001 certificate.pdf.pdf\" \"HD_TCCS Threonine Xinjiang.pdf.pdf\" \"HD_FAMI QS Xinjiang Meihua.pdf.pdf\" \"HD_COA.pdf.pdf\" \"FAMI QS Xinjiang Meihua.pdf.pdf\"  ";


        //  String fileString = "\\\"3FMX0342.pdf\\\" \\\"COA.pdf.pdf\\\" \\\"FAMI QS Xinjiang Meihua.pdf.pdf\\\" \\\"HD_COA.pdf.pdf\\\" \\\"HD_FAMI QS Xinjiang Meihua.pdf.pdf\\\" \\\"HD_TCCS Threonine Xinjiang.pdf.pdf\\\" \\\"ISO 9001 certificate.pdf.pdf\\\" \\\"Khac_1.pdf\\\" \\\"Khac_2.pdf\\\" \\\"MF314700-1.pdf\\\" \\\"Packing list.pdf\\\" \\\"TCCS Threonine Xinjiang.pdf.pdf\\\" ";


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

        sleep(1);


        driver.findElement(By.xpath(locator_CCN.buttonXacNhan)).click();
        sleep(1);


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
        actions1.keyDown("V").keyDown("i").keyDown("e").keyDown("t").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
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

        driver.findElement(By.xpath(locator_CCN.buttonTimKiemMaTACN_DVC)).click();
        sleep(1);

        //Kiểm tra check box đã được check hay chưa
        Boolean isSelected = driver.findElement(By.xpath(locator_CCN.checkBoxChonTACN1)).isSelected();

//Nếu chưa được check thì click vào ô check box đó
        if (isSelected == false) {
            driver.findElement(By.xpath(locator_CCN.checkBoxChonTACN1)).click();
        }

        sleep(1);

        driver.findElement(By.xpath(locator_CCN.buttonChonTACN)).click();
        sleep(1);


        driver.findElement(By.xpath(locator_CCN.inputNhomTACN)).click();
        sleep(1);
        Actions actionsNhom = new Actions(driver);
        actionsNhom.keyDown("T").keyDown("h").keyDown("ứ").keyDown("c").keyDown(" ").keyDown("ă").keyDown("n").keyDown(" ").keyDown("t").keyDown("r").keyDown("u").keyDown("y").keyDown("ề").keyDown("n").keyDown(" ").keyDown("t").keyDown("h").keyDown("ố").keyDown("n").keyDown("g").build().perform();
        actionsNhom.keyDown(Keys.ENTER).perform();
        actionsNhom.keyUp(Keys.ENTER).perform();
        sleep(3);

        driver.findElement(By.xpath(locator_CCN.inputPhanNhomTACN)).click();
        Actions actionsPhanNhom = new Actions(driver);
        actionsPhanNhom.keyDown("T").keyDown("A").keyDown("C").keyDown("N").keyDown(" ").keyDown("k").keyDown("h").keyDown("á").keyDown("c").build().perform();
        actionsPhanNhom.keyDown(Keys.ENTER).perform();
        actionsPhanNhom.keyUp(Keys.ENTER).perform();
        sleep(3);

        driver.findElement(By.xpath(locator_CCN.inputLoaiTACN)).click();
        Actions actionsLoai = new Actions(driver);
        actionsLoai.keyDown("U").keyDown("r").keyDown("ê").build().perform();
        actionsLoai.keyDown(Keys.ENTER).perform();
        actionsLoai.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputPhanLoaiTACN)).click();
        Actions actionsPhanLoai = new Actions(driver);
        actionsPhanLoai.keyDown("U").keyDown("r").keyUp("e").build().perform();
        actionsPhanLoai.keyDown(Keys.ENTER).perform();
        actionsPhanLoai.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputQuyChuanKyThuat)).click();
        Actions actionsQCKT = new Actions(driver);
        actionsQCKT.keyDown("Q").keyDown("C").keyDown("V").build().perform();
        actionsQCKT.keyDown(Keys.ENTER).perform();
        actionsQCKT.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.xoaChiTieuCL)).click();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputKhoiLuong)).click();
        driver.findElement(By.xpath(locator_CCN.inputKhoiLuong)).sendKeys("100");
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputDVT_KhoiLuong)).click();
        Actions actionsDVT_KL = new Actions(driver);
        actionsDVT_KL.keyDown("T").keyDown("ấ").keyDown("n").build().perform();
        actionsDVT_KL.keyDown(Keys.ENTER).perform();
        actionsDVT_KL.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputKhoiLuong_Tan)).click();
        driver.findElement(By.xpath(locator_CCN.inputKhoiLuong_Tan)).sendKeys("50");
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputSoLuong)).click();
        driver.findElement(By.xpath(locator_CCN.inputSoLuong)).sendKeys("1500");
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputDVT_SoLuong)).click();
        Actions actionsDVT_SL = new Actions(driver);
        actionsDVT_SL.keyDown("T").keyDown("ấ").keyDown("n").build().perform();
        actionsDVT_SL.keyDown(Keys.ENTER).perform();
        actionsDVT_SL.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.buttonXacNhan_SL_KL)).click();

        driver.findElement(By.xpath(locator_CCN.inputGiaTriTACN)).click();
        driver.findElement(By.xpath(locator_CCN.inputGiaTriTACN)).sendKeys("999");
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputUSD)).click();
        driver.findElement(By.xpath(locator_CCN.inputUSD)).sendKeys("90");
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.buttonThem_Sua)).click();
        sleep(3);


        //Thêm tacn2
        driver.findElement(By.xpath(locator_CCN.buttonThemTACN)).click();
        sleep(1);


        driver.findElement(By.xpath(locator_CCN.buttonTimKiemMaTACN_DVC)).click();
        sleep(2);


        //Kiểm tra check box đã được check hay chưa
        Boolean isSelected1 = driver.findElement(By.xpath(locator_CCN.checkBoxChonTACN2)).isSelected();

        //Nếu chưa được check thì click vào ô check box đó
        if (isSelected1 == false) {
            driver.findElement(By.xpath(locator_CCN.checkBoxChonTACN2)).click();
        }

        sleep(1);

        driver.findElement(By.xpath(locator_CCN.buttonChonTACN)).click();
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputNhomTACN)).click();
        sleep(1);
        Actions actionsNhom1 = new Actions(driver);
        actionsNhom1.keyDown("T").keyDown("h").keyDown("ứ").keyDown("c").keyDown(" ").keyDown("ă").keyDown("n").keyDown(" ").keyDown("t").keyDown("r").keyDown("u").keyDown("y").keyDown("ề").keyDown("n").keyDown(" ").keyDown("t").keyDown("h").keyDown("ố").keyDown("n").keyDown("g").build().perform();
        actionsNhom1.keyDown(Keys.ENTER).perform();
        actionsNhom1.keyUp(Keys.ENTER).perform();
        sleep(3);

        driver.findElement(By.xpath(locator_CCN.inputPhanNhomTACN)).click();
        Actions actionsPhanNhom1 = new Actions(driver);
        actionsPhanNhom1.keyDown("T").keyDown("A").keyDown("C").keyDown("N").keyDown(" ").keyDown("c").keyDown("ó").build().perform();
        actionsPhanNhom1.keyDown(Keys.ENTER).perform();
        actionsPhanNhom1.keyUp(Keys.ENTER).perform();
        sleep(1);

        driver.findElement(By.xpath(locator_CCN.inputLoaiTACN)).click();
        Actions actionsLoai1 = new Actions(driver);
        actionsLoai1.keyDown("K").keyDown("h").keyDown("ô").build().perform();
        actionsLoai1.keyDown(Keys.ENTER).perform();
        actionsLoai1.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputPhanLoaiTACN)).click();
        Actions actionsPhanLoai1 = new Actions(driver);
        actionsPhanLoai1.keyDown("Đ").keyDown("ậ").keyDown("u").build().perform();
        actionsPhanLoai1.keyDown(Keys.ENTER).perform();
        actionsPhanLoai1.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputQuyChuanKyThuat)).click();
        Actions actionsQCKT1 = new Actions(driver);
        actionsQCKT1.keyDown("Q").keyDown("C").keyDown("V").build().perform();
        actionsQCKT1.keyDown(Keys.ENTER).perform();
        actionsQCKT1.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.xoaChiTieuCL)).click();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputKhoiLuong)).click();
        driver.findElement(By.xpath(locator_CCN.inputKhoiLuong)).sendKeys("555");
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputDVT_KhoiLuong)).click();
        Actions actionsDVT_KL1 = new Actions(driver);
        actionsDVT_KL1.keyDown("T").keyDown("ấ").keyDown("n").build().perform();
        actionsDVT_KL1.keyDown(Keys.ENTER).perform();
        actionsDVT_KL1.keyUp(Keys.ENTER).perform();
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputKhoiLuong_Tan)).click();
        driver.findElement(By.xpath(locator_CCN.inputKhoiLuong_Tan)).sendKeys("100");
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputSoLuong)).click();
        driver.findElement(By.xpath(locator_CCN.inputSoLuong)).sendKeys("45");
        sleep(2);

        driver.findElement(By.xpath(locator_CCN.inputDVT_SoLuong)).click();
        Actions actionsDVT_SL1 = new Actions(driver);
        actionsDVT_SL1.keyDown("T").keyDown("ấ").keyDown("n").build().perform();
        actionsDVT_SL1.keyDown(Keys.ENTER).perform();
        actionsDVT_SL1.keyUp(Keys.ENTER).perform();
        sleep(2);


        driver.findElement(By.xpath(locator_CCN.buttonXacNhan_SL_KL)).click();

        driver.findElement(By.xpath(locator_CCN.inputGiaTriTACN)).click();
        driver.findElement(By.xpath(locator_CCN.inputGiaTriTACN)).sendKeys("888");
        sleep(2);


        driver.findElement(By.xpath(locator_CCN.inputUSD)).click();
        driver.findElement(By.xpath(locator_CCN.inputUSD)).sendKeys("66");
        sleep(2);


        driver.findElement(By.xpath(locator_CCN.buttonThem_Sua)).click();
        sleep(2);


        driver.findElement(By.xpath(locator_CCN.buttonLuu)).click();
        sleep(2);


        driver.findElement(By.xpath(locator_CCN.buttonCo)).click();
        sleep(3);


        String Url = driver.getCurrentUrl();

        Assert.assertNotEquals(Url, "http://dnccn.earchive.vn/dangkykiemtra", "Navigation failed");

    }


}
