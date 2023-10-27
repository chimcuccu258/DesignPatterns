package Creational.Singleton.A3;

public class Main {
   public static void main(String[] args) {
      ShapeFactory shape = new ShapeFactory();

      Shape circle = shape.createShape(ShapeType.CIRCLE);
      circle.setBrush("circle setBrush");
      circle.setFrame("circle setFrame");
      circle.setPaper("circle setPaper");
      System.out.println(circle.toString());

      Shape rectangle = shape.createShape(ShapeType.RECTANGLE);
      rectangle.setBrush("rectangle setBrush");
      rectangle.setFrame("rectangle setFrame");
      rectangle.setPaper("rectangle setPaper");
      System.out.println(rectangle.toString());

      Shape triangle = shape.createShape(ShapeType.TRIANGLE);
      triangle.setBrush("triangle setBrush");
      triangle.setFrame("triangle setFrame");
      triangle.setPaper("triangle setPaper");
      System.out.println(triangle.toString());
   }
}
