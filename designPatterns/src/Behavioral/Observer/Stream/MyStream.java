package Behavioral.Observer.Stream;
/*
 * @created 01/12/2023 - 07:21
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
   List<Listener> list = new ArrayList<>();

   public void addListener(Listener l) {
      list.add(l);
   }

   public void addEvent(T t) {
      for (Listener l : list)
         l.listen(t);
   }

   public static interface Listener<T> {
      void listen(T t);
   }
}
