package Structural.Decorator.B1_1;
/*
 * @created 27/10/2023 - 20:21
 * @project designPatterns
 * @author TaosDev
 */

public class BieuThucDonGian extends BieuThuc{
   private float toanHang;

   public BieuThucDonGian(float toanHang) {
      this.toanHang = toanHang;
   }

   public float giaTri() {
      return toanHang;
   }
   public String bieuThuc() {
//      return toanHang + " ";
      return "" + toanHang;
   }
}
