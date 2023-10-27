package Review.J4;

import java.util.ArrayList;

public class QuanLyChuyenXe {
  private ArrayList<ChuyenXe> dsCX = new ArrayList<>();

  public void themCX(ChuyenXe chuyenXe) {
    dsCX.add(chuyenXe);
  }

  public void xuatDanhSachCX() {
    for (ChuyenXe chuyenXe : dsCX) {
      System.out.println(chuyenXe);
    }
  }

  Double doanhThuNoiThanh() {
    Double doanhThuNoiThanh = 0.0;
    for (ChuyenXe chuyenXe : dsCX) {
      if (chuyenXe instanceof XeNoiThanh) {
        doanhThuNoiThanh += chuyenXe.getDoanhThu();
      }
    }
    return doanhThuNoiThanh;
  }

  Double doanhThuNgoaiThanh() {
    Double doanhThuNgThanh = 0.0;
    for (ChuyenXe chuyenXe : dsCX) {
      if (chuyenXe instanceof XeNgoaiThanh) {
        doanhThuNgThanh += chuyenXe.getDoanhThu();
      }
    }
    return doanhThuNgThanh;
  }

  Double tongDoanhThu() {
    Double tongDT = 0.0;
    for (ChuyenXe chuyenXe : dsCX) {
      tongDT += chuyenXe.getDoanhThu();
    }
    return tongDT;
  }

}
