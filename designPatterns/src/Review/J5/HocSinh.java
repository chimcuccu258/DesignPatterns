package Review.J5;

public class HocSinh {
  String lop;
  String nangKhieu;

  public String getLop() {
    return lop;
  }

  public void setLop(String lop) {
    this.lop = lop;
  }

  public String getNangKhieu() {
    return nangKhieu;
  }

  public void setNangKhieu(String nangKhieu) {
    this.nangKhieu = nangKhieu;
  }

  @Override
  public String toString() {
    return super.toString() + "Lop: " + lop + ", nang khieu: " + nangKhieu;
  }

}
