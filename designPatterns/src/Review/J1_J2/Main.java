package Review.J1_J2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    NhanVien nhanVien = new NhanVien();
    QuanLyNhanVien qLy = new QuanLyNhanVien();

    NhanVien nv1 = new NhanVien("Taos",20,"Nha Trang",2000.0, 200);
    qLy.them(nv1);
    NhanVien nv2 = new NhanVien("Alo", 25, "Hanoi", 2500.0, 180);
    qLy.them(nv2);
    NhanVien nv3 = new NhanVien("Bob", 30, "Da Nang", 2200.0, 220);
    qLy.them(nv3);
    NhanVien nv4 = new NhanVien("Halo", 28, "Ho Chi Minh City", 2800.0, 160);
    qLy.them(nv4);

    qLy.inDS();
  }
}
