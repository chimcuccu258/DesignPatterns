package Behavioral.ChainOfResponsibility.ATM;
/*
 * @created 08/12/2023 - 09:00
 * @project designPatterns
 * @author TaosDev
 */

public class MainATM {
   public static void main(String[] args) {
      ATM_MenhGia m500 = new ATM_MenhGia(500);
      ATM_MenhGia m200 = new ATM_MenhGia(200);
      ATM_MenhGia m100 = new ATM_MenhGia(100);
      ATM_MenhGia m50 = new ATM_MenhGia(50);
      ATM_MenhGia m20 = new ATM_MenhGia(20);
      ATM_MenhGia m10 = new ATM_MenhGia(10);
      ATM_MenhGia m5 = new ATM_MenhGia(5);
      ATM_MenhGia m2 = new ATM_MenhGia(2);
      ATM_MenhGia m1 = new ATM_MenhGia(1);
      m500.thietLapMenhGiaKeTiep(m200)
              .thietLapMenhGiaKeTiep(m100)
              .thietLapMenhGiaKeTiep(m50)
              .thietLapMenhGiaKeTiep(m20)
              .thietLapMenhGiaKeTiep(m10)
              .thietLapMenhGiaKeTiep(m5)
              .thietLapMenhGiaKeTiep(m2)
              .thietLapMenhGiaKeTiep(m1);


      ATM_Factory atm_factory = new ATM_Factory();
      atm_factory.taoATM_MenhGia(500).rutTien(1234);
   }
}
