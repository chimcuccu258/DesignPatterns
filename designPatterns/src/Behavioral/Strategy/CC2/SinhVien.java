package Behavioral.Strategy.CC2;

import java.util.Date;

public class SinhVien {
   String hoTen;
   Date ngaySinh;
   float diemTB;

   public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
      this.hoTen = hoTen;
      this.ngaySinh = ngaySinh;
      this.diemTB = diemTB;
   }

   @Override
   public String toString() {
      return "SinhVien{" +
              "hoTen='" + hoTen + '\'' +
              ", ngaySinh=" + ngaySinh +
              ", diemTB=" + diemTB +
              '}';
   }

   public String getHoTen() {
      return hoTen;
   }

   public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
   }

   public Date getNgaySinh() {
      return ngaySinh;
   }

   public void setNgaySinh(Date ngaySinh) {
      this.ngaySinh = ngaySinh;
   }

   public float getDiemTB() {
      return diemTB;
   }

   public void setDiemTB(float diemTB) {
      this.diemTB = diemTB;
   }
}
