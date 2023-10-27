package Structural.Decorator.B1_1;
/*
 * @created 27/10/2023 - 20:23
 * @project designPatterns
 * @author TaosDev
 */

public class BieuThucDecorator extends BieuThuc {
   BieuThuc bieuThuc;

   public BieuThucDecorator(BieuThuc bieuThuc) {
      this.bieuThuc = bieuThuc;
   }

   @Override
   public String bieuThuc() {
      return bieuThuc.bieuThuc();
   }

   @Override
   public float giaTri() {
      return bieuThuc.giaTri();
   }
}
