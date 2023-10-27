package Structural.Composite.B4;

public class Main {
  public static void main(String[] args) {
    KeHoachHocTap keHoachHocTap = new KeHoachChung("Khoá 63");
    KeHoachHocTap nam1 = new KeHoachChung("Năm 1");
    KeHoachHocTap nam2 = new KeHoachChung("Năm 2");
    KeHoachHocTap ky1 = new KeHoachChung("Kỳ 1");
    KeHoachHocTap ky2 = new KeHoachChung("Kỳ 2");
    KeHoachHocTap ky3 = new KeHoachChung("Kỳ 3");
    KeHoachHocTap ky4 = new KeHoachChung("Kỳ 4");
    KeHoachHocTap monHoc  = new MonHoc("Ky thuat lap trinh", 1000000, 3);
    KeHoachHocTap monHoc1  = new MonHoc("Quan ly du an phan mem", 1000000, 3);
    KeHoachHocTap monHoc2  = new MonHoc("Thiet ke Web", 1000000, 3);
    KeHoachHocTap monHoc3  = new MonHoc("Phan tich thiet ke", 1200000, 4);
    KeHoachHocTap monHoc4  = new MonHoc("Database Management", 1200000, 4);
    KeHoachHocTap monHoc5  = new MonHoc("Software Testing", 1200000, 4);
    KeHoachHocTap monHoc6  = new MonHoc("monhoc", 1200000, 4);
    KeHoachHocTap monHoc7  = new MonHoc("monhoc1", 1200000, 4);
    keHoachHocTap.add(nam1);
    keHoachHocTap.add(nam2);
    nam1.add(ky1);
    ky1.add(monHoc);
    ky1.add(monHoc1);
    nam1.add(ky2);
    ky2.add(monHoc2);
    ky2.add(monHoc3);
    nam2.add(ky3);
    ky3.add(monHoc4);
    ky3.add(monHoc5);
    nam2.add(ky4);
    ky4.add(monHoc6);
    ky4.add(monHoc7);
    System.out.println(keHoachHocTap.name);
    System.out.println(ky1.getHocPhi() + "\t" + ky1.getSoTC());
    System.out.println(ky2.getHocPhi() + "\t" + ky2.getSoTC());
    System.out.println(ky3.getHocPhi() + "\t" + ky3.getSoTC());
    System.out.println(ky4.getHocPhi() + "\t" + ky4.getSoTC());
  }
}
