package Structural.Decorator.Tokenize;
/*
 * @created 24/11/2023 - 07:42
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
   List<String> boDau = new ArrayList<>(Arrays.asList("và", "là", "mà", "thì", "hoặc"));

   public LoaiBoTuDung(ITokennize source) {
      super(source);
   }

   @Override
   public String[] tokenize() {
      List<String> tus = Arrays.asList(super.tokenize());
      List<String> tuMois = new ArrayList<>();
      for(String s: tus)
      {
         if(!boDau.contains(s.toLowerCase()))
            tuMois.add(s);
      }
      return tuMois.toArray(new String[0]);
   }
}
