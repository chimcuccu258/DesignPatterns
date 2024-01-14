package Creational.Factory.A3;
/*
 * @created 17/11/2023 - 07:34
 * @project designPatterns
 * @author TaosDev
 */

public class ShapeFactory {
   private static ShapeFactory instance;

   public ShapeFactory() {
   }
   public static ShapeFactory getInstance() {
      if (instance == null)
         instance = new ShapeFactory();
      return instance;
   }
   public Shape createShape(ShapeType shapeType)
   {
      switch (shapeType)
      {
         case Rectangle: return new Rectangle();
         case Circle: return new Circle();
         case Triangle: return new Triangle();
      }
      return null;
   }
}
