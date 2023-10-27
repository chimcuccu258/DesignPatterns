package Creational.Singleton.A3;
/*
 * @created 27/10/2023 - 23:22
 * @project designPatterns
 * @author TaosDev
 */

public class Rectangle extends Shape{
   @Override
   public String draw() {
//      return null;
      setBrush("Ink brush");
      setFrame("Rectangle");
      setPaper("A3");
      return getBrush() + " - " + getPaper() + " - " + getFrame();
   }
}
