package Behavioral.TemplateMethod.CD2.entity;

public class SinhVien {
   int maSV;
    String tenSV, ngaySinh, queQuan;

   public SinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
      this.maSV = maSV;
      this.tenSV = tenSV;
      this.ngaySinh = ngaySinh;
      this.queQuan = queQuan;
   }

   @Override
   public String toString() {
      return  "maSV= " + maSV +
              ", tenSV= " + tenSV +
              ", ngaySinh= " + ngaySinh +
              ", queQuan= " + queQuan;
   }
}
