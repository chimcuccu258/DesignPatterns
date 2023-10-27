package Review.J4;

public class XeNgoaiThanh extends ChuyenXe{
  public String getNoiDen() {
    return noiDen;
  }

  public void setNoiDen(String noiDen) {
    this.noiDen = noiDen;
  }

  public Integer getSoNgayDi() {
    return soNgayDi;
  }

  public void setSoNgayDi(Integer soNgayDi) {
    this.soNgayDi = soNgayDi;
  }

  private String noiDen;

  @Override
  public String toString() {
    return super.toString()+ "ChuyenNgoaiThanh [noiDen=" + noiDen + ", soNgayDiDuoc="+ soNgayDi + "]";
  }

  private Integer soNgayDi;
  public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, Double doanhThu, String noiDen, Integer soNgayDi) {
    super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
    this.noiDen = noiDen;
    this.soNgayDi = soNgayDi;
  }
}
