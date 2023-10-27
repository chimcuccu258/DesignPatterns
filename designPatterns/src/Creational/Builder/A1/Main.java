package Creational.Builder.A1;

public class Main {
   public static void main(String[] args) {
      HoaDon hoaDon = new HoaDon.Builder()
              .setHoaDonHeader("HD01", "01/01/2020", "Nguyen Van A")
              .addCTHD("San pham 1", 1, 1000, 0)
              .addCTHD("San pham 2", 2, 2000, 0)
              .build();

      HoaDon hoaDon1 = new HoaDon.Builder()
              .setHoaDonHeader("HD02", "01/01/2020", "Nguyen Van B")
              .addCTHD("San pham 1", 1, 1000, 0)
              .addCTHD("San pham 2", 2, 2000, 0)
              .build();

      System.out.println(hoaDon);
      System.out.println(hoaDon1);
   }
}
