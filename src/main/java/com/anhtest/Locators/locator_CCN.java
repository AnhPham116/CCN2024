package com.anhtest.Locators;

public class locator_CCN {

    public static String headerLogin1 = "//h3[contains(text(),'Đăng nhập hệ thống')]";
    public static String headerLogin2 = "//p[@class='text-gray-500 text-sm text-wrap']";
    public static String inputUsername = "//input[@placeholder='Tên đăng nhập']";
    public static String inputPassword = "//input[@placeholder='Mật khẩu']";
    public static String buttonLogin = "//button[contains(text(),'Đăng nhập')]";
    public static String linkForgotPassword = "//a[contains(text(),'Quên mật khẩu?')]";
    public static String linkDangKy = "//a[@class='text-blue text-blue-400 hover:text-blue-500']";

    public static String alertMessage = "//div[@role='alert']";

    public static String alertMessageVoHieuHoa = "//div[contains(text(),'Đăng nhập thất bại quá 5 lần, tài khoản đã bị vô h')]";
    public static String alertMessageVoHieuHoa1 = "//div[contains(text(),'Tài khoản đã bị vô hiệu hóa')]";


    public static String errorTenDangNhap = "//p[contains(text(),'Tên đăng nhập không được bỏ trống.')]";

    public static String errorMatKhau= "//p[contains(text(),'Mật khẩu không được bỏ trống.')]";


    //Vào trang đăng ký kiểm tra
    public static String dangKiKiemTra = "//h3[contains(text(),'Đăng ký kiểm tra')]";
    public static String searchMaHS = "//input[@id='input-label-mahoso']" ;
    public static String searchSoGDK = "//input[@id='input-label-sogiay_dangky']";
    public static String maHoSo = "//input[@id='mahoso']";
    public static String firstSearch = "//a[normalize-space()='BNNPTNT252410000188']";

    public static String dropdownLoaiHS = "//body/div[contains(@class,'px-12 py-12')]/div/div/div[2]";
    //public static String searchLoaiHS =


    public static String  textThemMoiHS = "//h3[contains(text(),'Thêm mới hồ sơ')]";

    //Trang thêm file
    public static String  chonFile = "//div[@role='presentation']";
    public static String buttonXacNhan = "//button[contains(text(),'Xác nhận')]";
    public static String btnBuocTiepTheo = "//button[@type='button'][contains(text(),'Bước tiếp theo')]" ;
    public static String btnBuocTiepTheoFile = "//body/div[contains(@class,'px-12 py-12')]/div/div/div[contains(@class,'mt-10')]/div/div[contains(@class,'p-4 h-full bg-gray-50 border border-gray-200 rounded-lg')]/div[1]/button[1]" ;

    public static String fileLoi = "//div[contains(text(),'File 23LM611.pdf lỗi')]";
    public static String filesucess = "//div[contains(text(),'Đã phân loại tài liệu thành công')]";

    //Vào trang thêm mới
    public static String buttonThemMoi = "//button[contains(text(),'Thêm mới')]";
    public static String inputLoaiHinhThucKiemTra = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]" ;

    //locator tab đơn đăng ký
    public static String txtThongTinHS = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/p[1]";
    public static String txtMaHS = "//body/div[contains(@class,'px-12 py-12')]/div/div/div[contains(@class,'mt-10')]/div/div/form[contains(@class,'p-4 h-full bg-gray-50 border border-gray-200 rounded-xl')]/div[1]";
    public static String txtTrangThaiHS = "//label[contains(text(),'Trạng thái hồ sơ')]";
    public static String txtNgayTao = "//label[contains(text(),'Ngày tạo')]";
    public static String txtLoaiHTKT = "//label[contains(text(),'Loại hình thức kiểm tra')]";
    public static String txtMaHSThayThe = "//label[contains(text(),'Mã hồ sơ được thay thế')]";
    public static String txtGĐK = "//label[contains(text(),'Số giấy đăng ký được thay thế')]";
    public static String txtTepGĐK = "//label[contains(text(),'Chọn tệp giấy đăng ký được thay thế')]";
    public static String txtGhiChu = "//p[contains(@class,'text-sm font-medium mt-4')]";

    public static String loaiBatBuocChon = "//p[contains(text(),'Thông tin bắt buộc chọn')]";
    public static String hopDongBatBuoc = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/div[1]/p[1]";


    //Thông tin file đính kèm
    public static String inputHopDongMuaBan = "//input[@id='hopdong_muaban_so']";
    public static String inputHoaDonMuaBan = "//input[@id='hoadon_muaban_so']";
    public static String inputPhieuDongGoi = "//input[@id='phieu_donggoi_so']";
    public static String inputHopDongMuaBanNgay = "//input[@id='hopdong_muaban_ngay']";
    public static String inputHoaDonMuaBanNgay = "//input[@id='hoadon_muaban_ngay']";
    public static String inputPhieuDongGoiNgay = "//input[@id='phieu_donggoi_ngay']";

    public static String txtThongTinFile = "//p[contains(text(),'Thông tin file đính kèm')]";
    public static String txtHopDongMBSo = "//label[contains(text(),'Hợp đồng mua bán số')]";

    public static String txtHopDongMBNgay = "//label[contains(text(),'Hợp đồng mua bán ngày')]";
    public static String txtHoaDonMBSo = "//label[contains(text(),'Hóa đơn mua bán số')]";
    public static String txtHoaDonMBNgay = "//label[contains(text(),'Hóa đơn mua bán ngày')]";
    public static String txtPhieuDongGoiSo = "//label[contains(text(),'Phiếu đóng gói số')]";
    public static String txtPhieuDongGoiNgay = "//label[contains(text(),'Phiếu đóng gói ngày')]";


    //Bên bán hàng

    public static String txtBenBanHang = "//p[normalize-space()='Bên bán hàng']";
    public static String txtTenBBH = "//label[@for='benban_ten']";
    public static String txtNuocBenBanHang = "//label[contains(text(),'Nước')]";
    public static String txtDiaChiBenBanHang = "//label[@for='benban_diachi']";
    public static String txtDienThoaiBenBanHang = "//label[@for='benban_dienthoai']";
    public static String txtFaxBenBanHang = "//label[@for='benban_fax']";
    public static String txtNoiXuatHangBenBanHang = "//label[contains(text(),'Nơi xuất hàng')]";
    public static String inputTenBenBan = "//input[@id='benban_ten']" ;
    public static String inputNuoc = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]" ;
    public static String inputDiaChiBenBan = "//input[@id='benban_diachi']";
    public static String inputDienThoaiBenBan = "//input[@id='benban_dienthoai']";
    public static String inputFaxBenBan = "//input[@id='benban_fax']";
    public static String inputNoiXuatHang = "//input[@id='benban_noixuathang']" ;

    public static String msgTenBB = "//p[contains(text(),'Tối đa 255 ký tự')]";
    public static String msgDiaChiBB = "//p[contains(text(),'Tối đa 255 kí tự')]";
    public static String msgDienThoaiBB = "//p[contains(text(),'Số điện thoại không hợp lệ')]";
    public static String msgNoiXuatHangBB = "//p[contains(text(),'Tối đa 255 ký tự')]";
    public static String msgDiaDiemTapKet = "//p[contains(text(),'Tối đa 255 kí tự')]";
    public static String msgemail = "//p[contains(text(),'Sai định dạng email')]";


    //Bên mua hàng
    public static String txtBenMuaHang = "//p[normalize-space()='Bên mua hàng']";
    public static String txtTenBenMuaHang = "//label[contains(@for,'benmua_ten')]";
    public static String txtDienThoaiBenMuaHang = "//label[@for='benmua_dienthoai']";
    public static String txtDiaChiBenMuaHang = "//label[@for='benmua_diachi']";
    public static String txtFaxBenMuaHang = "//label[@for='benmua_fax']";
    public static String txtNoiNhanHangBenMuaHang = "//label[contains(text(),'Nơi nhận hàng')]";
    public static String txtTGNhapKhauBenMuaHang = "//label[contains(text(),'Thời gian nhập khẩu dự kiến')]";
    public static String inputDienThoaiBenMua = "//input[@id='benmua_dienthoai']" ;
    public static String inputFaxBenMua = "//input[@id='benmua_fax']";
    public static String inputNoiNhanHang = "//input[@id='benmua_noinhanhang']" ;
    public static String inputTGNhapKhauDuKienTu = "//input[@id='benmua_thoigian_nhapkhau_tu']" ;
    public static String inputTGNhapKhauDuKienDen = "//input[@name='benmua_thoigian_nhapkhau_den']";

    //Thông tin lấy mẫu kiểm tra
    public static String txtThongTinLayMau = "//p[contains(text(),'Thông tin lấy mẫu kiểm tra')]";
    public static String txtDiaiemTapKet = "//label[contains(text(),'Địa điểm tập kết hàng')]";
    public static String txtNgayDKLayMau = "//label[contains(text(),'Ngày đăng ký lấy mẫu kiểm tra')]";
    public static String txtDiaDiemLayMau = "//label[contains(text(),'Địa điểm đăng ký lấy mẫu kiểm tra')]";

    public static String inputDiaDiem = "//input[@id='kiemtra_diadiemtapket']";
    public static String inputNgayDangKyLayMauTu = "//input[@id='kiemtra_ngaydangky_laymau_tu']";
    public static String inputNgayDangKyLayMauDen = "//input[@name='kiemtra_ngaydangky_laymau_den']";
    public static String inputDiaDiemDangKy = "//input[@id='kiemtra_diadiemdangky']";

    //Thông tin liên hệ
    public static String txtTTLienHe = "  //p[contains(text(),'Thông tin liên hệ')]" ;
    public static String txtNguoiLienHe = "//label[contains(text(),'Người liên hệ')]" ;
    public static String txtSDTNguoiLienHe = "//label[contains(text(),'Số điện thoại')]" ;
    public static String txtDiaChiNguoiLienHe = "//label[@for='lienhe_diachi']" ;

    public static String txtEmailNguoiLienHe = " //label[normalize-space()='Email']" ;

    public static String inputNguoiLienHe = "//input[@id='lienhe_ten']" ;
    public static String inputSoDienThoai = "//input[@id='lienhe_sodienthoai']";
    public static String inputDiaChi = "//input[@id='lienhe_diachi']";
    public static String inputEmail = "//input[@id='lienhe_email']" ;

    //Thông tin ký hồ sơ
    public static String txtThongtinKyHS = "//p[contains(text(),'Thông tin ký hồ sơ (cá nhân, tổ chức)')]";
    public static String txtTenNguoiKy = "//label[contains(text(),'Tên người ký')]";
    public static String txtChucVuNguoiKy = "//label[contains(text(),'Chức vụ ký')]";
    public static String txtNoiKy = "//label[contains(text(),'Thông tin nơi ký')]";

    public static String inputTenNguoiKy = "//input[@id='thongtinky_ten']";
    public static String inputChucVuKy = "//input[@id='thongtinky_chucvu']" ;
    public static String inputThongTinNoiKy = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[8]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]";
    //Button

    //Button"Bước tiếp theo"
    public static String buttonBuocTiepTheo = "//body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[9]/button[2]";
    public static String buttonBuocTruoc = "//body/div[@class='px-12 py-12']/div/div/div[@class='mt-10']/div/div/form[@class='p-4 h-full bg-gray-50 border border-gray-200 rounded-xl']/div[1]/button[2]";

    public static String btnBuocTiepTheo1 = "(//button[@type='button'][contains(text(),'Bước tiếp theo')])[2]";

    public static String btnBuocTiepTheoChiTiet = "//div[contains(@class,'my-3 flex flex-end justify-between')]//button[@type='submit'][contains(text(),'Bước tiếp theo')]";

    //Chi tiết hồ sơ
    public static String chiTietHoSo = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > table:nth-child(2) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > a:nth-child(1)";
    public static String btnGui= "//button[contains(text(),'Gửi hồ sơ')]";
    //Thêm thức ăn chăn nuôi
    public static String buttonThemTACN = "//button[contains(@class,'inline-flex flex-shrink-0 justify-center items-center text-white border border-white hover:bg-blue-700 hover:text-white focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm p-1.5 text-center me-2 dark:border-blue-500 dark:text-blue-500 dark:hover:text-white dark:focus:ring-blue-800 dark:hover:bg-blue-500 disabled:hidden')]//*[name()='svg']";
    public static String txtDSTACN = "//p[contains(text(),'Danh sách thức ăn chăn nuôi')]" ;
    public static String buttonLuu = "//button[@id='btn_taomoi']";

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
    public static String msgTenTA = "//div[@class='grid']//p[@class='text-red-500 text-sm mt-1'][contains(text(),'Thông tin bắt buộc nhập')]";

    public static String inputHangSX = "//input[@id='tacn_hangsanxuat']";
    public static String inputDangMau = "//input[@id='tacn_dang_mau']";
    public static String inputSoHieuTCCS = "//input[@id='tacn_sohieu_tieuchuan']";
    //public static String inputHangSX = "//input[@id='tacn_hangsanxuat']";

    public static String msgHangSX = "//p[contains(text(),'Tối đa 255 ký tự')]";
    public static String msgDangMau = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[10]/p[1]";
    public static String msgSoHieu = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[11]/p[1]";
    public static String buttonMaTACN_DVC = "//button[contains(text(),'Tìm kiếm Mã TACN')]";
    // public static String clickTACN = "//input[@id='21648']";4

    //Chọn Quy chuẩn kỹ thuật
    public static String inputQuyChuanKyThuat = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[2]";

    //Xóa chỉ tiêu chất lượng
    public static String xoaChiTieuCL = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[6]/div[1]/div[1]/button[2]";

    //Chọn Số hiệu tiêu chuânr cơ sơ
    //public static String inputSoHieuTCCS = "//input[@id='tacn_sohieu_tieuchuan']";

    //Thông tin số lượng, khối lương
    public static String inputKhoiLuong = "//input[@id='sl_cl0khoiluong']";
    public static String inputDVT_KhoiLuong = "//select[@id='sl_cl0donvi_khoiluong_id']";
    public static String inputKhoiLuong_Tan = "//input[@id='sl_cl0khoiluong_tan']";
    public static String inputSoLuong = "//input[@id='sl_cl0soluong']";
    public static String inputDVT_SoLuong = "//select[@id='sl_cl0donvi_soluong_id']";
    public static String buttonXacNhan_SL_KL = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[4]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/div[1]/button[1]/*[name()='svg'][1]";

    //Giá trị thức ăn chăn nuôi
    public static String inputGiaTriTACN = "//input[@id='tacn_giatri']";
    public static String msgGiaTriTACN = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[5]/div[2]/div[1]/div[1]/p[1]";
    public static String inputUSD = "//input[@id='tacn_giatri_usd']";

    public static String msgGiaTriUSD = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/div[5]/div[2]/div[1]/div[3]/p[1]";

    //ButtonThem/Sua
    public static String buttonThem_Sua = "//button[contains(text(),'Thêm / Sửa')]";
    public static String buttonThoat_TACN = "//div[contains(@class,'flex justify-center w-full')]//button[contains(@type,'button')][normalize-space()='Thoát']";

    //Button Lưu
    public static String buttonLuu1 = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/button[1]";

    //Button Có
    public static String buttonCo = "(//button[@type='button'][normalize-space()='Có'])[3]";
}
