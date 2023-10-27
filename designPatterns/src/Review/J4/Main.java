package Review.J4;

public class Main {
  public static void main(String[] args) {
    QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();

    XeNoiThanh xeNT1 = new XeNoiThanh("NT1", "Nguyen Van A", "Xe01", 10.0, 1, 50);
    XeNoiThanh xeNT2 = new XeNoiThanh("NT2", "Nguyen Van B", "Xe02", 12.0, 2, 60);
    XeNoiThanh xeNT3 = new XeNoiThanh("NT3", "Nguyen Van C", "Xe03", 15.0, 3, 70);

    XeNgoaiThanh xeNgT1 = new XeNgoaiThanh("NGT1", "Nguyen Van X", "Xe04", 20.0, "Hue", 2);
    XeNgoaiThanh xeNgT2 = new XeNgoaiThanh("NGT2", "Nguyen Van Y", "Xe05", 18.0, "Da Nang", 3);
    XeNgoaiThanh xeNgT3 = new XeNgoaiThanh("NGT3", "Nguyen Van Z", "Xe06", 25.0, "Nha Trang", 4);

    quanLyChuyenXe.themCX(xeNT1);
    quanLyChuyenXe.themCX(xeNT2);
    quanLyChuyenXe.themCX(xeNT3);
    quanLyChuyenXe.themCX(xeNgT1);
    quanLyChuyenXe.themCX(xeNgT2);
    quanLyChuyenXe.themCX(xeNgT3);

    quanLyChuyenXe.xuatDanhSachCX();
    System.out.println("Tổng doanh thu của xe ngoại thành: " + quanLyChuyenXe.doanhThuNgoaiThanh());
    System.out.println("Tổng doanh thu của xe nội thành: " + quanLyChuyenXe.doanhThuNoiThanh());
    System.out.println("Tổng doanh thu của cả hai loại xe: " + quanLyChuyenXe.tongDoanhThu());
  }
}
