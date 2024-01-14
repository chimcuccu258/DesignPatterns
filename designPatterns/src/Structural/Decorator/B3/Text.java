package Structural.Decorator.B3;
/*
 * @created 24/11/2023 - 07:52
 * @project designPatterns
 * @author TaosDev
 */

public class Text extends Widget{
   String content;

   public Text(String content) {
      this.content = content;
   }

   @Override
   public void show() {
      System.out.println(content);
   }
}
