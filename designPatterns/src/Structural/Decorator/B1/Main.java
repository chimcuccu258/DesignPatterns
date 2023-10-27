package Structural.Decorator.B1;

public class Main {
   public static void main(String[] args) {
      BieuThucDonGian bieuThucDonGian = new BieuThucDonGian(5);
      System.out.println(bieuThucDonGian.bieuThuc() + "=" + bieuThucDonGian.giaTri());
   }
}
