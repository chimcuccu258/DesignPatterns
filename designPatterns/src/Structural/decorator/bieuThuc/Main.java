package Structural.decorator.bieuThuc;

public class Main {
  public static void main(String[] args) {
    BieuThucDonGian bieuThucDonGian = new BieuThucDonGian(5);
    System.out.println(bieuThucDonGian.bieuThuc() + "=" + bieuThucDonGian.giaTri());

  }
}
