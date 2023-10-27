package Behavioral.template_method.CD2.entity;

public class Main {
   public static void main(String[] args) {
      EntityDB<SinhVien> qlsv = new SinhVienDB();
      qlsv.add(new SinhVien(1, "Nguyen Van A", "01/01/1999", "Ha Noi"));
      qlsv.add(new SinhVien(2, "Nguyen Van B", "02/02/1999", "Ha Noi"));
      qlsv.add(new SinhVien(3, "Nguyen Van C", "03/03/1999", "Ha Noi"));
      qlsv.printInfo();
   }
}
