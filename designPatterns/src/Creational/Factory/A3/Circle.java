package Creational.Factory.A3;
/*
 * @created 17/11/2023 - 07:38
 * @project designPatterns
 * @author TaosDev
 */

public class Circle extends Shape{
   @Override
   public String draw() {
      setBrush("Pencil");
      setFrame("Circle");
      setPaper("A4");
      return getBrush() + " - " + getPaper() + " - " + getFrame();
   }
}
