package Review.J4;

public class XeNoiThanh extends ChuyenXe{
  public Integer getSoTuyen() {
    return soTuyen;
  }

  public void setSoTuyen(Integer soTuyen) {
    this.soTuyen = soTuyen;
  }

  public Integer getSoKM() {
    return soKM;
  }

  public void setSoKM(Integer soKM) {
    this.soKM = soKM;
  }

  @Override
  public String toString() {
    return super.toString() + "ChuyenNoiThanh [soTuyen=" + soTuyen + ", soKM=" + soKM + "]";
  }

  private Integer soTuyen;
  private Integer soKM;
  public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, Double doanhThu, Integer soTuyen, Integer soKM) {
    super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    this.soTuyen = soTuyen;
    this.soKM = soKM;
  }
}
