package Behavioral.Observer.TiGia;

public class NhaDauTuA implements TiGia.I_TheoDoiTiGia{
  TiGia tiGia;

  public NhaDauTuA(TiGia tiGia) {
    this.tiGia = tiGia;
    tiGia.attach(this);
  }

  public void huyDangKy() {
    tiGia.detach(this);
  }

  @Override
  public void capNhat(float delta) {
    if (delta > 0)
      System.out.println("Nhà đầu tư A: Bán ra");
    else
      System.out.println("Nhà đầu tư A: Mua vào");
  }
}
