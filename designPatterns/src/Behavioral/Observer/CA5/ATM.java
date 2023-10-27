package Behavioral.Observer.CA5;

public class ATM {
  I_RutTien taiKhoan;
  public void attach(I_RutTien taiKhoan) {
    this.taiKhoan = taiKhoan;
  }

  public void detach(I_RutTien taiKhoan) {
    if (this.taiKhoan == taiKhoan)
      this.taiKhoan = null;
  }

  private boolean kiemTraTienRut(int soTien) {
//    if (taiKhoan.kiemTraSoDu(soTien) == true)
//      return true;
//    return false ;
    return taiKhoan.kiemTraSoDu(soTien);
  }

  public void rutTien(int soTien) {
//    if (taiKhoan != null ) {
//      if (kiemTraTienRut(soTien) == true)
//        taiKhoan.nhanThongBao(soTien,true);
//      else taiKhoan.nhanThongBao(soTien,false);
//    }
//    else
//      System.out.println("Khong co the trong may");
    if (taiKhoan != null ) {
      taiKhoan.nhanThongBao(soTien, kiemTraTienRut(soTien));
    }
    else
      System.out.println("Khong co the trong may");
  }

  public interface I_RutTien {
    boolean kiemTraSoDu(int tienRut);
    void nhanThongBao(int tienRut, boolean thanhCong);
  }
}
