package Creational.Singleton.A3;
/*
 * @created 27/10/2023 - 23:23
 * @project designPatterns
 * @author TaosDev
 */

public class Circle extends Shape{
   @Override
   public String draw() {
//      return null;
      setBrush("Pencil");
      setFrame("Circle");
      setPaper("A4");
      return getBrush() + " - " + getPaper() + " - " + getFrame();
   }
}
