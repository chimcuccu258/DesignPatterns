package Creational.Factory.A3;
/*
 * @created 17/11/2023 - 07:39
 * @project designPatterns
 * @author TaosDev
 */

public class Triangle extends Shape{
   @Override
   public String draw() {
      setBrush("Pencil");
      setFrame("Triangle");
      setPaper("A4");
      return getBrush() + " - " + getPaper() + " - " + getFrame();
   }
}
