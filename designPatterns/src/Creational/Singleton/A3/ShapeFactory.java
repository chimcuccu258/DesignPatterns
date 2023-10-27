package Creational.Singleton.A3;

public class ShapeFactory {
   public Shape createShape(ShapeType shapeType) {
      Shape shape;
      switch (shapeType) {
         case CIRCLE:
            shape = Circle.create();
            break;
         case RECTANGLE:
            shape = Rectangle.create();
            break;
         case TRIANGLE:
            shape = Triangle.create();
            break;
         default:
            shape = null;
      }
      return shape;
   }
}
