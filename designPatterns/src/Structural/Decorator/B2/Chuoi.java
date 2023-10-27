package Structural.Decorator.B2;
/*
 * @created 27/10/2023 - 23:39
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class Chuoi extends AbstractChuoi {
   String chuoi;

   public Chuoi(String chuoi) {
      this.chuoi = chuoi;
   }

   @Override
   public List<String> Tokenize() {
//      return null;
      List<String> dsChuoi = new ArrayList<>();
      String[] tam = chuoi.split(" ");
      for (String s : tam) {
         dsChuoi.add(s);
      }
      return dsChuoi;
   }
}
