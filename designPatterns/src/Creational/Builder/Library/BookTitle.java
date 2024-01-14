package Creational.Builder.Library;
/*
 * @created 05/01/2024 - 19:08
 * @project designPatterns
 * @author TaosDev
 */

public class BookTitle {
   String tuaDe,tacGia;
   int soTrang;

   @Override
   public String toString() {
      return "tuaDe='" + tuaDe + '\'' +
              "\ntacGia='" + tacGia + '\'' +
              "\nsoTrang=" + soTrang ;
   }


   public BookTitle(String tuaDe, String tacGia, int soTrang) {
      this.tuaDe = tuaDe;
      this.tacGia = tacGia;
      this.soTrang = soTrang;
   }
}
