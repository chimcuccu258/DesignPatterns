package Structural.Decorator.B1_1;
/*
 * @created 27/10/2023 - 20:26
 * @project designPatterns
 * @author TaosDev
 */

public class Cong extends BieuThucDecorator{
   private float toanHang;
   public Cong(BieuThuc bieuThuc, float toanHang) {
      super(bieuThuc);
      this.toanHang = toanHang;
   }

   @Override
   public String bieuThuc() {
      return bieuThuc.bieuThuc() + " + " + toanHang;
   }

   @Override
   public float giaTri() {
      return bieuThuc.giaTri() + toanHang;
   }
}
