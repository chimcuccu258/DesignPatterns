package Behavioral.TemplateMethod.SortCollection;
/*
 * @created 05/01/2024 - 19:06
 * @project designPatterns
 * @author TaosDev
 */

public class SortProductByPrice extends SortCollection<Product>{
   @Override
   protected int myCompare(Product t1, Product t2) {
      if (t1.getPrice()> t2.getPrice()) {
         return -1;
      } else if (t1.getPrice() < t2.getPrice()) {
         return 1;
      } else {
         return 0;
      }
   }
}
