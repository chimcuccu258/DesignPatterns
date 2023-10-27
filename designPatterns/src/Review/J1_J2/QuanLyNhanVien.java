package Review.J1_J2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy {
  List<NhanVien> danhSachNV = new ArrayList<>();

  @Override
  public void them(NhanVien nv) {
    danhSachNV.add(nv);
  }

  @Override
  public void inDS() {
    for (NhanVien nv : danhSachNV) {
      System.out.println("Name: " + nv.getName());
      System.out.println("Age: " + nv.getAge());
      System.out.println("Address: " + nv.getAddress());
      System.out.println("Salary: " + nv.getSalary());
      System.out.println("Working time: " + nv.getWorkingTime());
      System.out.println("Reward: " + nv.tinhThuong());
      System.out.print("\n");
    }
  }
}
