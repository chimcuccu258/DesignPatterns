package Behavioral.TemplateMethod.Entity;

public class SinhVien extends MyObject {
   private String tenSV;
   private String ngaySinh;
   private String queQuan;

   public SinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
      super(maSV);
      this.tenSV = tenSV;
      this.ngaySinh = ngaySinh;
      this.queQuan = queQuan;
   }

   @Override
   public String toString() {
      return "maSV = " + super.getId() +
              "\ntenSV = " + tenSV +
              "\nngaySinh = " + ngaySinh  +
              "\nqueQuan = " + queQuan ;
   }
}
