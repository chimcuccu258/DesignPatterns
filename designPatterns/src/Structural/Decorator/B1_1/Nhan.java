package Structural.Decorator.B1_1;
/*
 * @created 27/10/2023 - 21:46
 * @project designPatterns
 * @author TaosDev
 */

public class Nhan extends BieuThucDecorator{
   private int toanHang;

   public Nhan(BieuThuc bieuThuc, int toanHang) {
      super(bieuThuc);
      this.toanHang = toanHang;
   }

   @Override
   public String bieuThuc() {
      return super.bieuThuc() + "* " + toanHang;
   }

   @Override
   public float giaTri() {
      return super.giaTri() * toanHang;
   }
}
