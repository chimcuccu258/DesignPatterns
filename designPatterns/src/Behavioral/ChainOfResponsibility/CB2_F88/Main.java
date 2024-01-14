package Behavioral.ChainOfResponsibility.CB2_F88;

public class Main {
  public static void main(String[] args) {
    IXuLyKhoanVay gacCong=new NhanVienF88("A","Gác cổng",100);
    IXuLyKhoanVay giuXe=new NhanVienF88("B","Giữ xe",200);
    IXuLyKhoanVay thuKy=new NhanVienF88("C","Thư ký",800);
    IXuLyKhoanVay giamDoc=new GiamDocF88("D",1000);
    gacCong.capCaoHon(giuXe).capCaoHon(thuKy).capCaoHon(giamDoc);
    System.out.println(gacCong.xuLyVay(150));

  }
}
