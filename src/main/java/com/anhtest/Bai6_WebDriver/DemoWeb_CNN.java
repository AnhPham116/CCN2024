package com.anhtest.Bai6_WebDriver;

import com.anhtest.Bai5_Locator.Base_CNN;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class DemoWeb_CNN {
    public static void main(String[] args) throws InterruptedException, AWTException {
        //khơir tạo Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //time tìm 1 element tối đa 10s

        driver.get("http://10.10.10.90:3001/auth/login");

        driver.findElement(By.xpath(Base_CNN.inputUsername)).clear();
        driver.findElement(By.xpath(Base_CNN.inputPassword)).clear();
        driver.findElement(By.xpath(Base_CNN.inputUsername)).sendKeys("0303020092");
        driver.findElement(By.xpath(Base_CNN.inputPassword)).sendKeys("123456aA@");
        driver.findElement(By.xpath(Base_CNN.buttonLogin)).submit();

        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.dangKiKiemTra)).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.buttonThemMoi)).click();
        Thread.sleep(2000);


        WebElement browseButton = driver.findElement(By.xpath("//p[@class='ml-2']"));

        // Click vào nút "Browse" để mở hộp thoại chọn tệp tin
        browseButton.click();
        Thread.sleep(2000);
        String folderPath = "D:\\Test_AB\\50hoso\\BNNPTNT25230062420";
        String fileString = "\"TCCS Threonine Xinjiang.pdf\" \"TCCS Fra Butyrin hybrid dry.pdf.pdf\" \"Packing list.pdf\" \"MF314700-1.pdf\" \"Khac_2.pdf\" \"Khac_1.pdf\" \"ISO 9001 certificate.pdf.pdf\" \"HD_FAMI QS Xinjiang Meihua.pdf.pdf\" \"HD_COA.pdf.pdf\" \"FMX0342.pdf\"  ";
//        String fileString = "\"TCCS Threonine Xinjiang.pdf\" \"Packing list.pdf\" \"MF314700-1.pdf\" \"Khac_2.pdf\" \"Khac_1.pdf\" \"ISO 9001 certificate.pdf.pdf\" \"HD_TCCS Threonine Xinjiang.pdf.pdf\" \"HD_FAMI QS Xinjiang Meihua.pdf.pdf\" \"HD_COA.pdf.pdf\" \"FAMI QS Xinjiang Meihua.pdf.pdf\"  ";


        //  String fileString = "\\\"3FMX0342.pdf\\\" \\\"COA.pdf.pdf\\\" \\\"FAMI QS Xinjiang Meihua.pdf.pdf\\\" \\\"HD_COA.pdf.pdf\\\" \\\"HD_FAMI QS Xinjiang Meihua.pdf.pdf\\\" \\\"HD_TCCS Threonine Xinjiang.pdf.pdf\\\" \\\"ISO 9001 certificate.pdf.pdf\\\" \\\"Khac_1.pdf\\\" \\\"Khac_2.pdf\\\" \\\"MF314700-1.pdf\\\" \\\"Packing list.pdf\\\" \\\"TCCS Threonine Xinjiang.pdf.pdf\\\" ";


        Thread.sleep(1000);
        // Sao chép đường dẫn tệp tin vào clipboard
        StringSelection stringSelection = new StringSelection(folderPath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);   //keypress đè phím giống keydown
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(1000);

        //Sao chép đường dẫn tệp tin vào clipboard
        stringSelection = new StringSelection(fileString);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.buttonXacNhan)).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath(Base_CNN.btnBuocTiepTheo)).click();
        Thread.sleep(1000);


        WebElement dropdownElement = driver.findElement(By.xpath(Base_CNN.inputLoaiHinhThucKiemTra));
        dropdownElement.click();

        // Tạo một đối tượng Select từ dropdown element

        //Thông tin hồ sơ

        Actions actions = new Actions(driver);
        actions.keyDown("2").keyUp("2").keyDown("c").keyUp("c").build().perform();
        actions.keyDown(Keys.ENTER).perform();
        actions.keyUp(Keys.ENTER).perform();
        Thread.sleep(1000);


        //Thông tin file đính kèm
        driver.findElement(By.xpath(Base_CNN.inputHopDongMuaBan)).click();
        driver.findElement(By.xpath(Base_CNN.inputHopDongMuaBan)).sendKeys("MF314700-1");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputHopDongMuaBanNgay)).click();
        driver.findElement(By.xpath(Base_CNN.inputHopDongMuaBanNgay)).sendKeys("01/04/2024");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputHoaDonMuaBan)).click();
        driver.findElement(By.xpath(Base_CNN.inputHoaDonMuaBan)).sendKeys("3FMX0342");

        driver.findElement(By.xpath(Base_CNN.inputHoaDonMuaBanNgay)).click();
        driver.findElement(By.xpath(Base_CNN.inputHoaDonMuaBanNgay)).sendKeys("02/04/2024");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputPhieuDongGoi)).click();
        driver.findElement(By.xpath(Base_CNN.inputPhieuDongGoi)).sendKeys("5AMX0124");

        driver.findElement(By.xpath(Base_CNN.inputPhieuDongGoiNgay)).click();
        driver.findElement(By.xpath(Base_CNN.inputPhieuDongGoiNgay)).sendKeys("03/04/2024");
        Thread.sleep(1000);


        //Bên bán hàng
        driver.findElement(By.xpath(Base_CNN.inputTenBenBan)).click();
        driver.findElement(By.xpath(Base_CNN.inputTenBenBan)).sendKeys("NUACID NUTRITION CO., LTD vs2");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputNuoc)).click();
        Actions actions1 = new Actions(driver);
        actions1.keyDown("V").keyDown("i").keyDown("e").keyDown("t").keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
//        actions.keyDown(Keys.ENTER).perform();
//        actions.keyUp(Keys.ENTER).perform();
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputDiaChiBenBan)).click();
        driver.findElement(By.xpath(Base_CNN.inputDiaChiBenBan)).sendKeys("No.3 Guangyi road, Guangzhou-Quingyuam Industrial park, Shijao town Qingcheng District, Qingyuan city, Guangdong China");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputDienThoaiBenBan)).click();
        driver.findElement(By.xpath(Base_CNN.inputDienThoaiBenBan)).sendKeys("0973056888");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputFaxBenBan)).click();
        driver.findElement(By.xpath(Base_CNN.inputFaxBenBan)).sendKeys("999999999");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputNoiXuatHang)).click();
        driver.findElement(By.xpath(Base_CNN.inputNoiXuatHang)).sendKeys("Cảng Hàng Châu");
        Thread.sleep(1000);

        //Bên mua hàng
        driver.findElement(By.xpath(Base_CNN.inputFaxBenMua)).click();
        driver.findElement(By.xpath(Base_CNN.inputFaxBenMua)).sendKeys("66668888");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputNoiNhanHang)).click();
        driver.findElement(By.xpath(Base_CNN.inputNoiNhanHang)).sendKeys("Cảng Hải Phòng Việt Nam");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputTGNhapKhauDuKienTu)).click();
        driver.findElement(By.xpath(Base_CNN.inputTGNhapKhauDuKienTu)).sendKeys("04/04/2024");
        Thread.sleep(1000);


        driver.findElement(By.xpath(Base_CNN.inputTGNhapKhauDuKienDen)).click();
        driver.findElement(By.xpath(Base_CNN.inputTGNhapKhauDuKienDen)).sendKeys("04/05/2024");
        Thread.sleep(1000);

        //Thông tin lấy mẫu kiểm tra
        driver.findElement(By.xpath(Base_CNN.inputDiaDiem)).click();
        driver.findElement(By.xpath(Base_CNN.inputDiaDiem)).sendKeys("Cảng Hải Phòng Việt Nam");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputNgayDangKyLayMauTu)).click();
        driver.findElement(By.xpath(Base_CNN.inputNgayDangKyLayMauTu)).sendKeys("01/20/2024");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputNgayDangKyLayMauDen)).click();
        driver.findElement(By.xpath(Base_CNN.inputNgayDangKyLayMauDen)).sendKeys("02/04/2024");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputDiaDiemDangKy)).click();
        driver.findElement(By.xpath(Base_CNN.inputDiaDiemDangKy)).sendKeys("Cảng Hải Phòng Việt Nam");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputNguoiLienHe)).click();
        driver.findElement(By.xpath(Base_CNN.inputNguoiLienHe)).sendKeys("Lê Thị Nhung");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputSoDienThoai)).click();
        driver.findElement(By.xpath(Base_CNN.inputSoDienThoai)).sendKeys("0989888777");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputDiaChi)).click();
        driver.findElement(By.xpath(Base_CNN.inputDiaChi)).sendKeys("Hải Dương");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputEmail)).click();
        driver.findElement(By.xpath(Base_CNN.inputEmail)).sendKeys("nhung123@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputTenNguoiKy)).click();
        driver.findElement(By.xpath(Base_CNN.inputTenNguoiKy)).sendKeys("Đinh Đức Thiện");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputChucVuKy)).click();
        driver.findElement(By.xpath(Base_CNN.inputChucVuKy)).sendKeys("Phó giám đốc cục chăn nuôi tỉnh Hải Dương");
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.inputThongTinNoiKy)).click();

        Actions actions3 = new Actions(driver);
        actions3.keyDown("H").keyDown("a").build().perform();
        actions3.keyDown(Keys.ENTER).perform();
        actions3.keyUp(Keys.ENTER).perform();
        Thread.sleep(1000);

        //Thêm tacn
        driver.findElement(By.xpath(Base_CNN.buttonBuocTiepTheo)).click();
        Thread.sleep(1000);

        //Thêm tacn1
        driver.findElement(By.xpath(Base_CNN.buttonThemTACN)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.buttonTimKiemMaTACN_DVC)).click();
        Thread.sleep(1000);

        //Kiểm tra check box đã được check hay chưa
        Boolean isSelected = driver.findElement(By.xpath(Base_CNN.checkBoxChonTACN1)).isSelected();

//Nếu chưa được check thì click vào ô check box đó
        if (isSelected == false) {
            driver.findElement(By.xpath(Base_CNN.checkBoxChonTACN1)).click();
        }

        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.buttonChonTACN)).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath(Base_CNN.inputNhomTACN)).click();
        Thread.sleep(1);
        Actions actionsNhom = new Actions(driver);
        actionsNhom.keyDown("T").keyDown("h").keyDown("ứ").keyDown("c").keyDown(" ").keyDown("ă").keyDown("n").keyDown(" ").keyDown("t").keyDown("r").keyDown("u").keyDown("y").keyDown("ề").keyDown("n").keyDown(" ").keyDown("t").keyDown("h").keyDown("ố").keyDown("n").keyDown("g").build().perform();
        actionsNhom.keyDown(Keys.ENTER).perform();
        actionsNhom.keyUp(Keys.ENTER).perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath(Base_CNN.inputPhanNhomTACN)).click();
        Actions actionsPhanNhom = new Actions(driver);
        actionsPhanNhom.keyDown("T").keyDown("A").keyDown("C").keyDown("N").keyDown(" ").keyDown("k").keyDown("h").keyDown("á").keyDown("c").build().perform();
        actionsPhanNhom.keyDown(Keys.ENTER).perform();
        actionsPhanNhom.keyUp(Keys.ENTER).perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath(Base_CNN.inputLoaiTACN)).click();
        Actions actionsLoai = new Actions(driver);
        actionsLoai.keyDown("U").keyDown("r").keyDown("ê").build().perform();
        actionsLoai.keyDown(Keys.ENTER).perform();
        actionsLoai.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputPhanLoaiTACN)).click();
        Actions actionsPhanLoai = new Actions(driver);
        actionsPhanLoai.keyDown("U").keyDown("r").keyUp("e").build().perform();
        actionsPhanLoai.keyDown(Keys.ENTER).perform();
        actionsPhanLoai.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputQuyChuanKyThuat)).click();
        Actions actionsQCKT = new Actions(driver);
        actionsQCKT.keyDown("Q").keyDown("C").keyDown("V").build().perform();
        actionsQCKT.keyDown(Keys.ENTER).perform();
        actionsQCKT.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.xoaChiTieuCL)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputKhoiLuong)).click();
        driver.findElement(By.xpath(Base_CNN.inputKhoiLuong)).sendKeys("100");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputDVT_KhoiLuong)).click();
        Actions actionsDVT_KL = new Actions(driver);
        actionsDVT_KL.keyDown("T").keyDown("ấ").keyDown("n").build().perform();
        actionsDVT_KL.keyDown(Keys.ENTER).perform();
        actionsDVT_KL.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputKhoiLuong_Tan)).click();
        driver.findElement(By.xpath(Base_CNN.inputKhoiLuong_Tan)).sendKeys("50");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputSoLuong)).click();
        driver.findElement(By.xpath(Base_CNN.inputSoLuong)).sendKeys("1500");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputDVT_SoLuong)).click();
        Actions actionsDVT_SL = new Actions(driver);
        actionsDVT_SL.keyDown("T").keyDown("ấ").keyDown("n").build().perform();
        actionsDVT_SL.keyDown(Keys.ENTER).perform();
        actionsDVT_SL.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.buttonXacNhan_SL_KL)).click();

        driver.findElement(By.xpath(Base_CNN.inputGiaTriTACN)).click();
        driver.findElement(By.xpath(Base_CNN.inputGiaTriTACN)).sendKeys("999");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputUSD)).click();
        driver.findElement(By.xpath(Base_CNN.inputUSD)).sendKeys("90");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.buttonThem_Sua)).click();
        Thread.sleep(4000);


        //Thêm tacn2
        driver.findElement(By.xpath(Base_CNN.buttonThemTACN)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.buttonTimKiemMaTACN_DVC)).click();
        Thread.sleep(1000);

        //Kiểm tra check box đã được check hay chưa
        Boolean isSelected1 = driver.findElement(By.xpath(Base_CNN.checkBoxChonTACN2)).isSelected();

        //Nếu chưa được check thì click vào ô check box đó
        if (isSelected1 == false) {
            driver.findElement(By.xpath(Base_CNN.checkBoxChonTACN2)).click();
        }

        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.buttonChonTACN)).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath(Base_CNN.inputNhomTACN)).click();
        Thread.sleep(1);
        Actions actionsNhom1 = new Actions(driver);
        actionsNhom1.keyDown("T").keyDown("h").keyDown("ứ").keyDown("c").keyDown(" ").keyDown("ă").keyDown("n").keyDown(" ").keyDown("t").keyDown("r").keyDown("u").keyDown("y").keyDown("ề").keyDown("n").keyDown(" ").keyDown("t").keyDown("h").keyDown("ố").keyDown("n").keyDown("g").build().perform();
        actionsNhom1.keyDown(Keys.ENTER).perform();
        actionsNhom1.keyUp(Keys.ENTER).perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath(Base_CNN.inputPhanNhomTACN)).click();
        Actions actionsPhanNhom1 = new Actions(driver);
        actionsPhanNhom1.keyDown("T").keyDown("A").keyDown("C").keyDown("N").keyDown(" ").keyDown("c").keyDown("ó").build().perform();
        actionsPhanNhom1.keyDown(Keys.ENTER).perform();
        actionsPhanNhom1.keyUp(Keys.ENTER).perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath(Base_CNN.inputLoaiTACN)).click();
        Actions actionsLoai1 = new Actions(driver);
        actionsLoai1.keyDown("K").keyDown("h").keyDown("ô").build().perform();
        actionsLoai1.keyDown(Keys.ENTER).perform();
        actionsLoai1.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputPhanLoaiTACN)).click();
        Actions actionsPhanLoai1 = new Actions(driver);
        actionsPhanLoai1.keyDown("Đ").keyDown("ậ").keyDown("u").build().perform();
        actionsPhanLoai1.keyDown(Keys.ENTER).perform();
        actionsPhanLoai1.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputQuyChuanKyThuat)).click();
        Actions actionsQCKT1 = new Actions(driver);
        actionsQCKT1.keyDown("Q").keyDown("C").keyDown("V").build().perform();
        actionsQCKT1.keyDown(Keys.ENTER).perform();
        actionsQCKT1.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.xoaChiTieuCL)).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputKhoiLuong)).click();
        driver.findElement(By.xpath(Base_CNN.inputKhoiLuong)).sendKeys("555");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputDVT_KhoiLuong)).click();
        Actions actionsDVT_KL1 = new Actions(driver);
        actionsDVT_KL1.keyDown("T").keyDown("ấ").keyDown("n").build().perform();
        actionsDVT_KL1.keyDown(Keys.ENTER).perform();
        actionsDVT_KL1.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputKhoiLuong_Tan)).click();
        driver.findElement(By.xpath(Base_CNN.inputKhoiLuong_Tan)).sendKeys("100");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputSoLuong)).click();
        driver.findElement(By.xpath(Base_CNN.inputSoLuong)).sendKeys("45");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputDVT_SoLuong)).click();
        Actions actionsDVT_SL1 = new Actions(driver);
        actionsDVT_SL1.keyDown("T").keyDown("ấ").keyDown("n").build().perform();
        actionsDVT_SL1.keyDown(Keys.ENTER).perform();
        actionsDVT_SL1.keyUp(Keys.ENTER).perform();
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.buttonXacNhan_SL_KL)).click();

        driver.findElement(By.xpath(Base_CNN.inputGiaTriTACN)).click();
        driver.findElement(By.xpath(Base_CNN.inputGiaTriTACN)).sendKeys("888");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.inputUSD)).click();
        driver.findElement(By.xpath(Base_CNN.inputUSD)).sendKeys("66");
        Thread.sleep(2000);

        driver.findElement(By.xpath(Base_CNN.buttonThem_Sua)).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath(Base_CNN.buttonLuu)).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath(Base_CNN.buttonCo)).click();
        Thread.sleep(3000);
        Thread.sleep(3000);
        Thread.sleep(3000);

        driver.get("http://10.10.10.90:3001/dangkykiemtra");
        Thread.sleep(3000);

        //driver.findElement(By.xpath(Base_CNN.chiTietHoSo)).click();
        driver.findElement(By.xpath(Base_CNN.btnBuocTiepTheoFile)).click();
        driver.findElement(By.xpath(Base_CNN.btnBuocTiepTheoChiTiet)).click();
        driver.findElement(By.xpath(Base_CNN.btnGui)).click();

        driver.quit();  //đóng brower


    }

}
