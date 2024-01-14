package Behavioral.ChainOfResponsibility.ATM;
/*
 * @created 08/12/2023 - 08:54
 * @project designPatterns
 * @author TaosDev
 */

public class ATM_MenhGia implements ATM {
   ATM keTiep;
   int menhGia;

   public ATM_MenhGia(int menhGia) {
      this.menhGia = menhGia;
   }
   @Override
   public void rutTien(int soTien) {
      int soTo = soTien/menhGia;
      int tienDu = soTien%menhGia;
      if (soTo > 0) {
         System.out.println("So to " + menhGia + " la: " + soTo);
      }
      if (tienDu > 0)
         keTiep.rutTien(tienDu);
   }

   @Override
   public ATM thietLapMenhGiaKeTiep(ATM menhGiaKeTiep) {
      keTiep = menhGiaKeTiep;
      return keTiep;
   }
}
