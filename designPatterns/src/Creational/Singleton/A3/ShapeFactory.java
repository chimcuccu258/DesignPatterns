package Creational.Singleton.A3;

public class ShapeFactory {
   private static ShapeFactory instance;
   private ShapeFactory() {
   }
   public static ShapeFactory getInstance() {
      if (instance == null)
         instance = new ShapeFactory();
      return instance;
   }
   public Shape createShape(ShapeType shapeType) {
      switch (shapeType) {
         case CIRCLE:
            return new Circle();
         case RECTANGLE:
            return new Rectangle();
         case SQUARE:
            return new Triangle();
         default:
            return null;
      }
   }
}
