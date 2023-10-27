package Structural.Decorator.B2;
/*
 * @created 27/10/2023 - 23:45
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      AbstractChuoi chuoi = new Chuoi("Tokenize là, quá? trình, tách một, chuỗi thành các từ.");
      chuoi = new DeleteDauCau(chuoi, "?");
      chuoi = new DeleteTuDung(chuoi, "là");
      for (String str : chuoi.Tokenize()) {
         System.out.println(str);
      }
   }
}
