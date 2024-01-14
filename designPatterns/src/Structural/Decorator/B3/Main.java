package Structural.Decorator.B3;
/*
 * @created 24/11/2023 - 07:51
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      Text text = new Text("ABC");
      Widget center = new Center(text);
      Widget button = new Button(center);
      button.show();
   }
}
