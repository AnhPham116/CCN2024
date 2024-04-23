package com.anhtest.Bai5_Locator;

public class Base_CNN {
    public static String headerLogin = "//a[@href='/dangkykiemtra']//div[@class='p-4 md:p-5']";
    public static String inputUsername = "//input[@placeholder='Tên đăng nhập']";
    public static String inputPassword = "//input[@placeholder='Mật khẩu']";
    public static String buttonLogin = "//button[contains(text(),'Đăng nhập')]";
    public static String linkForgotPassword = "//a[contains(text(),'Quên mật khẩu?')]";
    public static String register = "(//a[@class='text-blue text-blue-400 hover:text-blue-500']";

    //Vào trang đăng ký kiểm tra
    public static String dangKiKiemTra = "//a[@href='/dangkykiemtra']//div[@class='p-4 md:p-5']";
    public static String searchMaHS = "//input[@id='input-label-mahoso']" ;
    public static String searchSoGDK = "//input[@id='input-label-sogiay_dangky']";

    public static String dropdownLoaiHS = "//body/div[contains(@class,'px-12 py-12')]/div/div/div[2]";
    //public static String searchLoaiHS =

    //Trang thêm file
    public static String  chonFile = "//div[@role='presentation']";
    public static String buttonXacNhan = "//button[contains(text(),'Xác nhận')]";
    public static String btnBuocTiepTheo = "//button[@type='button'][contains(text(),'Bước tiếp theo')]" ;


    //Vào trang thêm mới
    public static String buttonThemMoi = "//button[contains(text(),'Thêm mới')]";
    public static String inputLoaiHinhThucKiemTra = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]" ;


    //Thông tin file đính kèm
    public static String inputHopDongMuaBan = "//input[@id='hopdong_muaban_so']";
    public static String inputHoaDonMuaBan = "//input[@id='hoadon_muaban_so']";
    public static String inputPhieuDongGoi = "//input[@id='phieu_donggoi_so']";
    public static String inputHopDongMuaBanNgay = "//input[@id='hopdong_muaban_ngay']";
    public static String inputHoaDonMuaBanNgay = "//input[@id='hoadon_muaban_ngay']";
    public static String inputPhieuDongGoiNgay = "//input[@id='phieu_donggoi_ngay']";



    //Bên bán hàng
    public static String inputTenBenBan = "//input[@id='benban_ten']" ;
    public static String inputNuoc = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]" ;
    public static String inputDiaChiBenBan = "//input[@id='benban_diachi']";
    public static String inputDienThoaiBenBan = "//input[@id='benban_dienthoai']";
    public static String inputFaxBenBan = "//input[@id='benban_fax']";
    public static String inputNoiXuatHang = "//input[@id='benban_noixuathang']" ;

    //Bên mua hàng
    public static String inputDienThoaiBenMua = "//input[@id='benmua_dienthoai']" ;
    public static String inputFaxBenMua = "//input[@id='benmua_fax']";
    public static String inputNoiNhanHang = "//input[@id='benmua_noinhanhang']" ;
    public static String inputTGNhapKhauDuKienTu = "//input[@id='benmua_thoigian_nhapkhau_tu']" ;
    public static String inputTGNhapKhauDuKienDen = "//input[@name='benmua_thoigian_nhapkhau_den']";

    //Thông tin lấy mẫu kiểm tra
    public static String inputDiaDiem = "//input[@id='kiemtra_diadiemtapket']";
    public static String inputNgayDangKyLayMauTu = "//input[@id='kiemtra_ngaydangky_laymau_tu']";
    public static String inputNgayDangKyLayMauDen = "//input[@name='kiemtra_ngaydangky_laymau_den']";
    public static String inputDiaDiemDangKy = "//input[@id='kiemtra_diadiemdangky']";

    //Thông tin liên hệ
    public static String inputNguoiLienHe = "//input[@id='lienhe_ten']" ;
    public static String inputSoDienThoai = "//input[@id='lienhe_sodienthoai']";
    public static String inputDiaChi = "//input[@id='lienhe_diachi']";
    public static String inputEmail = "//input[@id='lienhe_email']" ;

    //Thông tin ký hồ sơ
    public static String inputTenNguoiKy = "//input[@id='thongtinky_ten']";
    public static String inputChucVuKy = "//input[@id='thongtinky_chucvu']" ;
    public static String inputThongTinNoiKy = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[8]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]";
    //Button

    //Button"Bước tiếp theo"
    public static String buttonBuocTiepTheo = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[9]/button[2]";
    public static String buttonBuocTruoc = "//body/div[@class='px-12 py-12']/div/div/div[@class='mt-10']/div/div/form[@class='p-4 h-full bg-gray-50 border border-gray-200 rounded-xl']/div[1]/button[2]";

    public static String btnBuocTiepTheoFile = "(//button[@type='button'][contains(text(),'Bước tiếp theo')])[2]";

    public static String btnBuocTiepTheoChiTiet = "//div[contains(@class,'my-3 flex flex-end justify-between')]//button[@type='submit'][contains(text(),'Bước tiếp theo')]";

    //Chi tiết hồ sơ
    public static String chiTietHoSo = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > a:nth-child(1)";
    public static String btnGui= "//button[contains(text(),'Gửi hồ sơ')]";
    //Thêm thức ăn chăn nuôi
    public static String buttonThemTACN = "//button[contains(@class,'inline-flex flex-shrink-0 justify-center items-center text-white border border-white hover:bg-blue-700 hover:text-white focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm p-1.5 text-center me-2 dark:border-blue-500 dark:text-blue-500 dark:hover:text-white dark:focus:ring-blue-800 dark:hover:bg-blue-500 disabled:hidden')]//*[name()='svg']";
    public static String titileDSTACN = "//p[contains(text(),'Danh sách thức ăn chăn nuôi')]" ;

    public static String buttonTimKiemMaTACN_DVC = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/button[1]";
    public static String checkBoxChonTACN1 = "//input[@id='28880']";

    public static String checkBoxChonTACN2 = "//input[@id='13813']";
    public static String buttonChonTACN = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[3]";



    public static String inputTenTACN = "//input[@id='tacn_ten']";
    public static String inputNhomTACN = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]";
    public static String inputPhanNhomTACN = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]";
    public static String inputLoaiTACN = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]";
    public static String inputPhanLoaiTACN = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]";


    //Chọn TACN
    public static String buttonMaTACN_DVC = "//button[contains(text(),'Tìm kiếm Mã TACN')]";
   // public static String clickTACN = "//input[@id='21648']";4

    //Chọn Quy chuẩn kỹ thuật
    public static String inputQuyChuanKyThuat = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[2]";

    //Xóa chỉ tiêu chất lượng
    public static String xoaChiTieuCL = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[6]/div[1]/div[1]/button[2]";

    //Chọn Số hiệu tiêu chuânr cơ sơ
    public static String inputSoHieuTCCS = "//input[@id='tacn_sohieu_tieuchuan']";

    //Thông tin số lượng, khối lương
    public static String inputKhoiLuong = "//input[@id='sl_cl0khoiluong']";
    public static String inputDVT_KhoiLuong = "//select[@id='sl_cl0donvi_khoiluong_id']";
    public static String inputKhoiLuong_Tan = "//input[@id='sl_cl0khoiluong_tan']";
    public static String inputSoLuong = "//input[@id='sl_cl0soluong']";
    public static String inputDVT_SoLuong = "//select[@id='sl_cl0donvi_soluong_id']";
    public static String buttonXacNhan_SL_KL = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/button[1]/*[name()='svg'][1]";

    //Giá trị thức ăn chăn nuôi
    public static String inputGiaTriTACN = "//input[@id='tacn_giatri']";
    public static String inputUSD = "//input[@id='tacn_giatri_usd']";

    //ButtonThem/Sua
    public static String buttonThem_Sua = "//button[contains(text(),'Thêm / Sửa')]";
    public static String buttonThoat_TACN = "//div[contains(@class,'flex justify-center w-full')]//button[contains(@type,'button')][normalize-space()='Thoát']";

    //Button Lưu
    public static String buttonLuu = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]";

    //Button Có
    public static String buttonCo = "(//button[@type='button'][normalize-space()='Có'])[3]";

}
