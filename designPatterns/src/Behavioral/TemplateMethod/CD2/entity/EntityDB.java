package Behavioral.TemplateMethod.CD2.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class EntityDB<T> {
   List<T> list = new ArrayList<>();

   protected abstract int getKey(T t);

   public boolean add(T t) {
      for (T o : list)
         if (getKey(o) == getKey(t))
            return false;
      list.add(t);
      return true;
   }

   public int update(T t) {
      for (int i = 0; i < list.size(); i++)
         if (getKey(list.get(i)) == getKey(t)) {
            list.set(i, t);
            return 1;
         }
      return 0;
   }

   public void delete(T t) {
      for (T o : list)
         if (getKey(o) == getKey(t)) {
            list.remove(o);
            break;
         }
   }

   public int deleteByKey(int id) {
      for (T o : list)
         if (getKey(o) == id) {
            list.remove(o);
            return 1;
         }
      return 0;
   }

   public T findByID(int id) {
      for (T t : list)
         if (getKey(t) == id)
            return t;
      return null;
   }

   public void printInfo() {
      for (T t : list)
         System.out.println(t);
   }
}
