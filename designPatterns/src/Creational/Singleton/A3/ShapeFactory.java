package Creational.Singleton.A3;
/*
 * @created 27/10/2023 - 23:24
 * @project designPatterns
 * @author TaosDev
 */

public class ShapeFactory {
   private static ShapeFactory instance;

   private ShapeFactory()
   {

   }
   public static ShapeFactory getInstance()
   {
      if (instance == null)
         instance = new ShapeFactory();
      return instance;
   }
   public Shape createShape(ShapeType shapeType)
   {

      switch(shapeType)
      {
         case Rectangle: return new Rectangle();

         case Circle: return new Circle();

          case Triangle: return new Triangle();
      }
      return null;
   }
}
