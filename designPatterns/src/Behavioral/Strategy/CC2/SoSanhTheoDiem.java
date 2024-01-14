package Behavioral.Strategy.CC2;

public class SoSanhTheoDiem implements ISoSanh<SinhVien>{
   @Override
   public int soSanh(SinhVien o1, SinhVien o2) {
      if (o1.getDiemTB() < o2.getDiemTB()) {
         return -1;
      } else if (o1.getDiemTB() > o2.getDiemTB()) {
         return 1;
      } else {
         return 0;
      }
   }
}
