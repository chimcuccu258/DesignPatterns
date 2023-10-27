package Creational.Singleton.A3;

public class Main {
   public static void main(String[] args) {
      ShapeFactory shapeFactory = ShapeFactory.getInstance();
      Shape shape1 = shapeFactory.createShape(ShapeType.CIRCLE);
      System.out.println(shape1.draw());
   }
}
