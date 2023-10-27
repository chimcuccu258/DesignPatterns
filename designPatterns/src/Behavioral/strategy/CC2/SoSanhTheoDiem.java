package Behavioral.strategy.CC2;

public class SoSanhTheoDiem implements ISoSanh<SinhVien> {
   @Override
   public int soSanh(SinhVien t1, SinhVien t2) {
      if (t1.diemTB > t2.diemTB) {
         return 1;
      } else if (t1.diemTB < t2.diemTB) {
         return -1;
      } else {
         return 0;
      }
   }
}
