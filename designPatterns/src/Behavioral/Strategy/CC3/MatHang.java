package Behavioral.Strategy.CC3;
/*
 * @created 05/01/2024 - 18:59
 * @project designPatterns
 * @author TaosDev
 */

public class MatHang {
   String tenMH;
   int soLuong;
   double donGia;


   public MatHang(String tenMH, int soLuong, double donGia) {
      this.tenMH = tenMH;
      this.soLuong = soLuong;
      this.donGia = donGia;
   }

   public String getTenMH() {
      return tenMH;
   }

   public void setTenMH(String tenMH) {
      this.tenMH = tenMH;
   }

   public int getSoLuong() {
      return soLuong;
   }

   public void setSoLuong(int soLuong) {
      this.soLuong = soLuong;
   }

   public double getDonGia() {
      return donGia;
   }

   public void setDonGia(double donGia) {
      this.donGia = donGia;
   }

   double tongGia() {
      return donGia * soLuong;
   }
}
