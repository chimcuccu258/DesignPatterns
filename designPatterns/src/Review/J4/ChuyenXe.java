package Review.J4;

public class ChuyenXe {
  private String maSoChuyen;

  @Override
  public String toString() {
//    return super.toString();
    return "ChuyenXe [maSo=" + maSoChuyen + ", tenTaiXe=" + hoTenTaiXe + ", doanhThu=" + doanhThu + "]";
  }

  private String hoTenTaiXe;
  private String soXe;
  private Double doanhThu;

  public String getMaSoChuyen() {
    return maSoChuyen;
  }

  public void setMaSoChuyen(String maSoChuyen) {
    this.maSoChuyen = maSoChuyen;
  }

  public String getHoTenTaiXe() {
    return hoTenTaiXe;
  }

  public void setHoTenTaiXe(String hoTenTaiXe) {
    this.hoTenTaiXe = hoTenTaiXe;
  }

  public String getSoXe() {
    return soXe;
  }

  public void setSoXe(String soXe) {
    this.soXe = soXe;
  }

  public Double getDoanhThu() {
    return doanhThu;
  }

  public void setDoanhThu(Double doanhThu) {
    this.doanhThu = doanhThu;
  }

  public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, Double doanhThu) {
    this.maSoChuyen = maSoChuyen;
    this.hoTenTaiXe = hoTenTaiXe;
    this.soXe = soXe;
    this.doanhThu = doanhThu;
  }
}
