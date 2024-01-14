package Structural.Decorator.B3;
/*
 * @created 24/11/2023 - 07:49
 * @project designPatterns
 * @author TaosDev
 */

public abstract class WidgetDecorator extends Widget{
   Widget child;

   public WidgetDecorator(Widget child) {
      this.child = child;
   }
}
