package Behavioral.TemplateMethod.CD2.entity;

public class SinhVienDB extends EntityDB<SinhVien> {
   @Override
   protected int getKey(SinhVien sinhVien) {
      return sinhVien.maSV;
   }
}
