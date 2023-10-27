package Creational.Singleton.A3;

public class Circle extends Shape {
   @Override
   public String draw() {
      setBrush("Brush");
      setFrame("Circle Frame");
      setPaper("A3");
      return getBrush() + " " + getFrame() + " " + getPaper();
   }
}
