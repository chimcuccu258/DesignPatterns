package Behavioral.ChainOfResponsibility.CB2_F88;

public class NhanVienF88 implements IXuLyKhoanVay{
  IXuLyKhoanVay capCaoHon;
  String ten, chucVu;

  int hanMucVay;

  public NhanVienF88(String ten, String chucVu, int hanMucVay) {
    this.ten = ten;
    this.chucVu = chucVu;
    this.hanMucVay = hanMucVay;
  }

  @Override
  public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xuLyKhoanVay) {
    capCaoHon = xuLyKhoanVay;
    return  xuLyKhoanVay;
  }
  @Override
  public String xuLyVay(int tienVay) {
    if(tienVay <=hanMucVay)
      return chucVu + " " + "Xu ly khoan vay" ;
    else
      return capCaoHon.xuLyVay(tienVay);
  }
}
