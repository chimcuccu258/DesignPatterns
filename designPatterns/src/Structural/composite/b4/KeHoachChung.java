package Structural.composite.b4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
  List<KeHoachHocTap> list = new ArrayList<>();

  public KeHoachChung(String name) {
    super(name);
  }

  @Override
  public void add(KeHoachHocTap k) {
    list.add(k);
  }

  @Override
  public void remove(KeHoachHocTap k) {
    list.remove(k);
  }

  @Override
  public int getHocPhi() {
    int tong = 0;
    for (KeHoachHocTap k: list)
      tong += k.getHocPhi();
    return tong;
  }

  @Override
  public int getSoTC() {
    int tongSoTC = 0;
    for (KeHoachHocTap k: list)
      tongSoTC += k.getSoTC();
    return tongSoTC;
  }
}
