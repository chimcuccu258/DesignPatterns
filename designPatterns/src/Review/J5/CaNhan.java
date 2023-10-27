package Review.J5;

public class CaNhan {
  String hoTen;
  Integer tuoi;
  String diaChi;
  String soDienThoai;

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public Integer getTuoi() {
    return tuoi;
  }

  public void setTuoi(Integer tuoi) {
    this.tuoi = tuoi;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getSoDienThoai() {
    return soDienThoai;
  }

  public void setSoDienThoai(String soDienThoai) {
    this.soDienThoai = soDienThoai;
  }

  @Override
  public String toString() {
    return super.toString() + "Ho ten: " + hoTen + ", tuoi: " + tuoi + ", dia chi: " + diaChi + ", so dien thoai: " + soDienThoai;
  }

}
