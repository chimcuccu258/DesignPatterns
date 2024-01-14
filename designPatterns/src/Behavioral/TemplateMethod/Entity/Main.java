package Behavioral.TemplateMethod.Entity;

public class Main {
   public static void main(String[] args) {
      EntityDB<SinhVien> sv = new EntityDB<>();
      sv.add(new SinhVien(1, "Nguyen Van A", "01/01/2000", "Hanoi"));
      sv.add(new SinhVien(2, "Tran Thi B", "02/02/2001", "Hue"));
      sv.add(new SinhVien(3, "Le Van C", "03/03/2002", "Danang"));
      sv.add(new SinhVien(4, "Pham Thi D", "04/04/1999", "Saigon"));
      sv.add(new SinhVien(5, "Hoang Van E", "05/05/1998", "Vinh"));
      sv.update(new SinhVien(5, "Hoang Van F", "05/05/1998", "Vinh"));

      sv.print();

      System.out.println("Danh sach mon hoc");
      EntityDB<MonHoc> mh= new EntityDB<>();
      mh.add(new MonHoc(1, "Toán", 3, "Nguyen Van X"));
      mh.add(new MonHoc(2, "Văn", 2, "Tran Thi Y"));
      mh.add(new MonHoc(3, "Lý", 4, "Le Van Z"));
      mh.add(new MonHoc(4, "Hóa", 4, "Pham Van W"));
      mh.add( new MonHoc(5, "Sử", 3, "Hoang Van M"));
      mh.print();
   }
}
