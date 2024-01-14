package Structural.Decorator.B3;
/*
 * @created 24/11/2023 - 07:51
 * @project designPatterns
 * @author TaosDev
 */

public class Center extends WidgetDecorator {
   public Center(Widget child) {
      super(child);
   }

   @Override
   public void show() {
      System.out.println("<center>");
      child.show();
      System.out.println("</center>");
   }
}
