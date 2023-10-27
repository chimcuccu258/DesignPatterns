package Structural.Decorator.B1;
/*
 * @created 27/10/2023 - 21:48
 * @project designPatterns
 * @author TaosDev
 */

public class Chia extends BieuThucDecorator{
   private int toanHang;
   public Chia(BieuThuc bieuThuc, int toanHang) {
      super(bieuThuc);
      this.toanHang = toanHang;
   }

   @Override
   public String bieuThuc() {
//      return super.bieuThuc() + "/ " + toanHang;
      return "(" + bieuThuc.bieuThuc() + ") / " + toanHang;
   }

   @Override
   public float giaTri() {
      return bieuThuc.giaTri() / toanHang;
   }
}
