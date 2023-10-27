package Structural.decorator.bieuThuc;

public class BieuThucDonGian extends BieuThuc {
  float toanHang;
  public BieuThucDonGian(float toanHang) {
    this.toanHang = toanHang;
  }
  @Override
  public float giaTri() {
    return toanHang;
  }
  @Override
  public String bieuThuc() {
    return toanHang + " ";
  }
}
