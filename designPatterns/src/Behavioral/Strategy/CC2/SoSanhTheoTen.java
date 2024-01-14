package Behavioral.Strategy.CC2;
/*
 * @created 05/01/2024 - 19:01
 * @project designPatterns
 * @author TaosDev
 */

public class SoSanhTheoTen implements ISoSanh<SinhVien>{
   @Override
   public int soSanh(SinhVien o1, SinhVien o2) {
      return o1.getHoTen().compareTo(o2.getHoTen());
   }
}
