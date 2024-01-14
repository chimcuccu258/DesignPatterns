package Behavioral.TemplateMethod.Entity;

import java.util.ArrayList;
import java.util.List;


public class EntityDB<T extends MyObject> {
   List<T> list = new ArrayList<>();
   public boolean add(T t){
      for(T o:list)
         if(getKey(o)==getKey(t))
         {
            return false;
         }
      list.add(t);
      return true;
   }
   public int update(T t){
      int count=0;
      for(int i=0;i<list.size();i++)
         if(getKey(list.get(i))==getKey(t)){
            list.set(i,t);
            count++;
            return count;
         }
      return count;
   }
   public int delete(T t){
      int count=0;
      for(int i=0;i<list.size();i++)
         if(getKey(list.get(i))==getKey(t)){
            list.remove(i);
            count++;
            return count;
         }
      return count;
   }
   public int deleteById(int id){
      for(int i=0;i<list.size();i++)
         if(getKey(list.get(i))==id){
            list.remove(i);
            return 1;
         }
      return 0;
   }
   public T findById(int id){
      for (T t : list) {
         if (getKey(t) == id) {
            return t;
         }
      }
      return null;
   }
   public void print(){
      for(T t:list){
         System.out.println(t.toString());
      }
   }

   protected int getKey(T t){
      return t.getId();
   }
}
