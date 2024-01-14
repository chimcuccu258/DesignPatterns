package Structural.Decorator.B3;
/*
 * @created 24/11/2023 - 07:53
 * @project designPatterns
 * @author TaosDev
 */

public class Button extends WidgetDecorator{
   public Button(Widget child) {
      super(child);
   }

   @Override
   public void show() {
      System.out.println("<Button>");
      child.show();
      System.out.println("</Button>");
   }
}
