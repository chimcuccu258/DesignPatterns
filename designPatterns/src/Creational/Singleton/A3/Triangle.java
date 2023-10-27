package Creational.Singleton.A3;

public class Triangle extends Shape{
   @Override
   public String draw() {
      setBrush("Brush");
      setFrame("Triangle Frame");
      setPaper("A5");
      return getBrush() + " " + getFrame() + " " + getPaper();
   }
}
