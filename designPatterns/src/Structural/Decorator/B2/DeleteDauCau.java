package Structural.Decorator.B2;
/*
 * @created 27/10/2023 - 23:42
 * @project designPatterns
 * @author TaosDev
 */

import java.util.List;

public class DeleteDauCau extends DeleteDecorator{
   String dau;

   public DeleteDauCau(AbstractChuoi abstractChuoi, String dau) {
      super(abstractChuoi);
      this.dau = dau;
   }

   @Override
   public List<String> Tokenize() {
      List<String> tam = super.Tokenize();
      for (int i = 0; i < tam.size(); i++) {
         if (tam.get(i).contains(dau)) {
            tam.set(i, tam.get(i).replaceAll("[" + dau + "]", ""));
         }
      }
      return tam;
   }
}
