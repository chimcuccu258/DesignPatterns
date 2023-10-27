package Creational.Singleton.A3;

public class Rectangle extends Shape {
   public static Rectangle rectangle;

   public Rectangle(String brush, String paper, String frame) {
      super(brush, paper, frame);
   }

   public Rectangle() {
   }

   @Override
   public String draw() {
      return "Rectangle";
   }

   public static Rectangle create() {
      if (rectangle == null) {
         rectangle = new Rectangle();
      }
      return rectangle;
   }
}
