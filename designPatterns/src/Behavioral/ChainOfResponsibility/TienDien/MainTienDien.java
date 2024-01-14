package Behavioral.ChainOfResponsibility.TienDien;
/*
 * @created 08/12/2023 - 09:42
 * @project designPatterns
 * @author TaosDev
 */

public class MainTienDien {
   public static void main(String[] args) {
      TinhTienDienBacThang b1 = new TienDienTheoBac(0, 50, 1806);
      TinhTienDienBacThang b2 = new TienDienTheoBac(51, 100, 1910);
      TinhTienDienBacThang b3 = new TienDienTheoBac(101, 200, 2014);
      TinhTienDienBacThang b4 = new TienDienTheoBac(201, 300, 2536);
      TinhTienDienBacThang b5 = new TienDienTheoBac(301, 400, 2834);
      TinhTienDienBacThang b6 = new TienDienTheoBac(401, 500, 2927);
      b1.bacKeTiep(b2)
              .bacKeTiep(b3)
              .bacKeTiep(b4)
              .bacKeTiep(b5)
              .bacKeTiep(b6);

      System.out.println(b1.tinhTienDien(500));
   }
}
