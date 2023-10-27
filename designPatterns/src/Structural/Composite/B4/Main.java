package Structural.Composite.B4;

public class Main {
  public static void main(String[] args) {
    KeHoachHocTap khoaHoc = new KeHoachChung("Khoá 63");
    KeHoachHocTap hocKy1 = new KeHoachChung("Học kỳ 1");
    KeHoachHocTap hocKy2 = new KeHoachChung("Học kỳ 2");

    khoaHoc.add(hocKy1);
    khoaHoc.add(hocKy2);

    MonHoc mon1 = new MonHoc("Lập trình hướng đối tượng", 1000000, 3);
    MonHoc mon2 = new MonHoc("Quản lý dự án phần mềm", 1000000, 3);
    MonHoc mon3 = new MonHoc("Thiết kế Web", 1000000, 3);
    MonHoc mon4 = new MonHoc("Phân tích thiết kế", 1200000, 4);

    hocKy1.add(mon1);
    hocKy1.add(mon2);
    hocKy2.add(mon3);
    hocKy2.add(mon4);
    hocKy1.remove(mon1);

    System.out.println(khoaHoc.name);
    System.out.println("Tong so TC (ca khoa): " + khoaHoc.getSoTC() + "\nHoc phi (ca khoa): " + khoaHoc.getHocPhi());
    System.out.println("Tong so TC (hoc ky 1): " + hocKy1.getSoTC() + "\nHoc phi (hoc ky 1): " + hocKy1.getHocPhi());
    System.out.println("Tong so TC (hoc ky 2): " + hocKy2.getSoTC() + "\nHoc phi (hoc ky 2): " + hocKy2.getHocPhi());
    System.out.println("Tong so TC (mon 1): " + mon1.getSoTC() + "\nHoc phi (mon 1): " + mon1.getHocPhi());
  }
}
