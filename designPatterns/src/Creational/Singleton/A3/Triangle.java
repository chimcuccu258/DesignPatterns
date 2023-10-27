package Creational.Singleton.A3;

public class Triangle extends Shape {
   private static Triangle triangle;

   public Triangle(String brush, String paper, String frame) {
      super(brush, paper, frame);
   }

   public Triangle() {

   }

   public String draw() {
      return "Triangle";
   }

   public static Triangle create() {
      if (triangle == null) {
         triangle = new Triangle();
      }
      return triangle;
   }
}
