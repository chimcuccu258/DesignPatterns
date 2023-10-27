package Behavioral.ChainOfResponsibility.CB2_F88;

public class GiamDocF88 implements IXuLyKhoanVay{
  String ten, chucVu;
  int hanMucVay;

  public GiamDocF88(String ten, String chucVu, int hanMucVay) {
    this.ten = ten;
    this.chucVu = chucVu;
    this.hanMucVay = hanMucVay;
  }

  @Override
  public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay iXuLyKhoanVay) {
    return null;
  }

  @Override
  public String xuLyVay(int tienVay) {
    if(tienVay <=hanMucVay)
      return chucVu + " " + "Xu ly khoan vay" ;
    else
      return "Ra ngan hang vay";
  }
}
