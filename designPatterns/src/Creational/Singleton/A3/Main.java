package Creational.Singleton.A3;
/*
 * @created 27/10/2023 - 23:26
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      ShapeFactory shapeFactory = ShapeFactory.getInstance();
      Shape s = shapeFactory.createShape(ShapeType.Circle);
      System.out.println(s.draw());
      Shape s1 = shapeFactory.createShape(ShapeType.Rectangle);
      System.out.println(s1.draw());
      Shape s2 = shapeFactory.createShape(ShapeType.Triangle);
      System.out.println(s2.draw());

   }
}
