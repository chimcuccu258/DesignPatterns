package Behavioral.chain_of_responsibility.f88;

public class Main {
  public static void main(String[] args) {
    IXuLyKhoanVay gacCong = new NhanVienF88("ABC1", "Gac cong",10000000);
    IXuLyKhoanVay thuKy = new NhanVienF88("ABC2", "Thu ky",15000000);
    IXuLyKhoanVay truongPhong = new NhanVienF88("ABC3", "Truong phong",18000000);
    IXuLyKhoanVay giamDoc = new GiamDocF88("ABC4","Giam doc", 1000000000);
    gacCong.capCaoHon(thuKy)
            .capCaoHon(truongPhong)
            .capCaoHon(giamDoc);
    System.out.println(gacCong.xuLyVay(150000000));
  }
}
