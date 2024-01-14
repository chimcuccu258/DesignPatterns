package Structural.Decorator.Tokenize;
/*
 * @created 17/11/2023 - 08:21
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
   ArrayList<String> dauCau = new ArrayList<>(Arrays.asList(",", ".", ";", "'", "?", "!"));
   public LoaiBoDauCau(ITokennize source) {
      super(source);
   }

   @Override
   public String[] tokenize() {
      String[] st = super.tokenize();

      for (int i = 0; i < st.length; i++) {
         if (st[i].length() > 0) {
            String dau = st[i].substring(st[i].length() - 1);
            if (dauCau.contains(dau)) {
               st[i] = st[i].substring(0, st[i].length() - 1);
            }
         }
      }
      return st;
   }
}
