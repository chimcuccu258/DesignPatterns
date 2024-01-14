package Structural.Decorator.Tokenize;
/*
 * @created 17/11/2023 - 08:10
 * @project designPatterns
 * @author TaosDev
 */

public class TachTu implements ITokennize {
   String s;
   public TachTu(String s) {
      this.s = s;
   }

   @Override
   public String[] tokenize() {
      return s.split(" ");
   }
}
