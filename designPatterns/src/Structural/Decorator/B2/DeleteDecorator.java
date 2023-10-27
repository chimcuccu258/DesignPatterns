package Structural.Decorator.B2;
/*
 * @created 27/10/2023 - 23:41
 * @project designPatterns
 * @author TaosDev
 */

import java.util.List;

public class DeleteDecorator extends AbstractChuoi {
   AbstractChuoi abstractChuoi;

   public DeleteDecorator(AbstractChuoi abstractChuoi) {
      this.abstractChuoi = abstractChuoi;
   }

   @Override
   public List<String> Tokenize() {
      return abstractChuoi.Tokenize();
   }
}
