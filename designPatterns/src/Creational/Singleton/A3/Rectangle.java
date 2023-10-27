package Creational.Singleton.A3;

public class Rectangle extends Shape {
   @Override
   public String draw() {
      setBrush("Brush");
      setFrame("Rectangle Frame");
      setPaper("A4");
      return getBrush() + " " + getFrame() + " " + getPaper();
   }
}
