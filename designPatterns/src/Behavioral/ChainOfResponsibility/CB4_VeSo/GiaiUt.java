package Behavioral.ChainOfResponsibility.CB4_VeSo;

public class GiaiUt implements IDoVeSo{
  String tenGiai;
  String[] soTrungThuong;

  public GiaiUt(String tenGiai, String[] soTrungThuong) {
    this.tenGiai = tenGiai;
    this.soTrungThuong = soTrungThuong;
  }

  @Override
  public IDoVeSo giaiKeTiep(IDoVeSo keTiep) {
    return null;
  }

  @Override
  public String doVeSo(String veSo) {
    for (String s: soTrungThuong) {
      if (veSo.endsWith(s))
        return "Ban da trung " + tenGiai;
    }
    return "Chuc ban may man lan sau";
  }
}
