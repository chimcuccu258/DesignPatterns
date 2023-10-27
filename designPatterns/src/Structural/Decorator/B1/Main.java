package Structural.Decorator.B1;
/*
 * @created 27/10/2023 - 20:31
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      BieuThuc bieuThuc = new BieuThucDonGian(6);
      bieuThuc = new Cong(bieuThuc, 9); // 6 + 9
      bieuThuc = new Nhan(bieuThuc, 8); // (6 + 9) * 8
      bieuThuc = new Cong(bieuThuc, 5); // ((6 + 9) * 8) + 5
      System.out.println(bieuThuc.bieuThuc() + " = " + bieuThuc.giaTri());
   }
}
