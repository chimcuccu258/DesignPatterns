package Behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      Iterator iterator = list.iterator();
      while (iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
}
