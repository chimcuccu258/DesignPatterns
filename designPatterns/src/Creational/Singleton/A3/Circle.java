package Creational.Singleton.A3;

public class Circle extends Shape {
   private static Circle circle;

   public Circle() {

   }

   public Circle(String brush, String paper, String frame) {
      super(brush, paper, frame);
   }

   public String draw() {
      return "Circle";
   }

   public static Circle create() {
      if (circle == null) {
         circle = new Circle();
      }
      return circle;
   }
}
