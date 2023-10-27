package Structural.Composite.B4;

public class MonHoc extends KeHoachHocTap{
  int hocPhi;
  int soTC;
  public MonHoc(String name, int hocPhi, int soTC) {
    super(name);
    this.hocPhi = hocPhi;
    this.soTC = soTC;
  }

  @Override
  public void add(KeHoachHocTap k) {

  }

  @Override
  public void remove(KeHoachHocTap k) {

  }

  @Override
  public int getHocPhi() {
    return soTC * hocPhi;
  }

  @Override
  public int getSoTC() {
    return soTC;
  }
}
