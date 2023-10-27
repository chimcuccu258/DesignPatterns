package Structural.Decorator.B1_1;
/*
 * @created 27/10/2023 - 20:31
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
//      BieuThuc bieuThuc1 = new BieuThucDonGian(5);
//      bieuThuc1 = new Cong(bieuThuc1, 10);
//      System.out.println(bieuThuc1.bieuThuc() + " = " + bieuThuc1.giaTri());
//      System.out.println("---------------------");
//      BieuThuc bieuThuc2 = new BieuThucDonGian(5);
//      bieuThuc2 = new Tru(bieuThuc2, 2);
//      System.out.println(bieuThuc2.bieuThuc() + " = " + bieuThuc2.giaTri());
//      System.out.println("---------------------");
//      BieuThuc bieuThuc3 = new BieuThucDonGian(5);
//      bieuThuc3 = new Nhan(bieuThuc3, 2);
//      System.out.println(bieuThuc3.bieuThuc() + " = " + bieuThuc3.giaTri());
//      System.out.println("---------------------");
//      BieuThuc bieuThuc4 = new BieuThucDonGian(5);
//      bieuThuc4 = new Chia(bieuThuc4, 2);
//      System.out.println(bieuThuc4.bieuThuc() + " = " + bieuThuc4.giaTri());

      BieuThuc bieuThuc = new BieuThucDonGian(6);
//      bieuThuc = new Nhan(bieuThuc, 9);
//      bieuThuc = new Cong(bieuThuc, 8);
      bieuThuc = new Cong(bieuThuc, 9); // 6 + 9
      bieuThuc = new Nhan(bieuThuc, 8); // (6 + 9) * 8
      bieuThuc = new Cong(bieuThuc, 5); // ((6 + 9) * 8) + 5
      System.out.println(bieuThuc.bieuThuc() + " = " + bieuThuc.giaTri());
   }
}
