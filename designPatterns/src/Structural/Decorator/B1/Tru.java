package Structural.Decorator.B1;
/*
 * @created 27/10/2023 - 20:35
 * @project designPatterns
 * @author TaosDev
 */

public class Tru extends BieuThucDecorator{
   private float toanHang;
   public Tru(BieuThuc bieuThuc, float toanHang) {
      super(bieuThuc);
      this.toanHang = toanHang;
   }

   @Override
   public String bieuThuc() {
      return bieuThuc.bieuThuc() + " - " + toanHang;
   }

   @Override
   public float giaTri() {
      return bieuThuc.giaTri() - toanHang;
   }
}
