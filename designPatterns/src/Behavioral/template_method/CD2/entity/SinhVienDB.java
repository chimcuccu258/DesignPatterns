package Behavioral.template_method.CD2.entity;

public class SinhVienDB extends EntityDB<SinhVien> {
   @Override
   protected int getKey(SinhVien sinhVien) {
      return sinhVien.maSV;
   }
}
