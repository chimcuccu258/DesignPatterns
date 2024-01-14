package Creational.Factory.A3;
/*
 * @created 17/11/2023 - 07:42
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      ShapeFactory shapeFactory = ShapeFactory.getInstance();
      Shape s = shapeFactory.createShape(ShapeType.Circle);
      System.out.println(s.draw());
   }
}
