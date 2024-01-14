package Behavioral.TemplateMethod.SortCollection;
/*
 * @created 22/12/2023 - 08:02
 * @project designPatterns
 * @author TaosDev
 */

public class SortProductByName extends SortCollection<Product> {
   @Override
   protected int myCompare(Product t1, Product t2) {
      return t1.getName().compareTo(t2.getName());
   }
}
