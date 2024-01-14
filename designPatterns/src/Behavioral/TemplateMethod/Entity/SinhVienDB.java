package Behavioral.TemplateMethod.Entity;

public class SinhVienDB extends EntityDB<SinhVien>{
   @Override
   protected int getKey(SinhVien sv) {
      return sv.getId();
   }
}
