package Structural.Decorator.B2;
/*
 * @created 27/10/2023 - 23:43
 * @project designPatterns
 * @author TaosDev
 */

import java.util.List;

public class DeleteTuDung extends DeleteDecorator{
   String tuDung;

   public DeleteTuDung(AbstractChuoi abstractChuoi, String tuDung) {
      super(abstractChuoi);
      this.tuDung = tuDung;
   }

   @Override
   public List<String> Tokenize() {
      List<String> temp = super.Tokenize();
      for (int i = 0; i < temp.size(); i++) {
         if (temp.get(i).contains(tuDung)) {
            temp.set(i, temp.get(i).replaceAll("[" + tuDung + "]", ""));
         }
      }
      return temp;
   }
}
