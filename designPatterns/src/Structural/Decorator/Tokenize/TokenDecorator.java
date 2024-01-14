package Structural.Decorator.Tokenize;
/*
 * @created 17/11/2023 - 08:18
 * @project designPatterns
 * @author TaosDev
 */

public class TokenDecorator implements ITokennize {
   ITokennize source;

   public TokenDecorator(ITokennize source) {
      this.source = source;
   }

   @Override
   public String[] tokenize() {
      return source.tokenize();
   }
}
