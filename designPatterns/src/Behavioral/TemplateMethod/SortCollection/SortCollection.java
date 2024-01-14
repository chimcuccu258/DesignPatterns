package Behavioral.TemplateMethod.SortCollection;
/*
 * @created 22/12/2023 - 07:48
 * @project designPatterns
 * @author TaosDev
 */

import java.util.Comparator;
import java.util.List;

public abstract class SortCollection<T> {
   abstract protected int myCompare(T t1,T t2);
   public void sort(List<T> list){
      list.sort(new Comparator<T>() {
         @Override
         public int compare(T o1, T o2) {
            return myCompare(o1,o2);
         }
      });
   }
}
