package Behavioral.Observer.CA3;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia{
  TiGia tiGia;

  public NhaDauTuB(TiGia tiGia) {
    this.tiGia = tiGia;
    tiGia.attach(this);
  }

  public void huyDangKy() {
    tiGia.detach(this);
  }

  @Override
  public void capNhat(float delta) {
    if (delta < 0)
      System.out.println("Nhà đầu tư B: Bán ra");
    else
      System.out.println("Nhà đầu tư B: Mua vào");
  }
}
