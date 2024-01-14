package Behavioral.TemplateMethod.CD1;
/*
 * @created 05/01/2024 - 18:07
 * @project designPatterns
 * @author TaosDev
 */

public class MatHang {
   private String tenMH;
   private int soLuong;
   private float donGia;

   public MatHang(String tenMH, int soLuong, float donGia) {
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

   public void setDonGia(float donGia) {
      this.donGia = donGia;
   }
   @Override
   public String toString() {
      return tenMH + " - Số lượng: " + soLuong + ", Đơn giá: " + donGia + ", Thành tiền: " + (soLuong * donGia);
   }
}
