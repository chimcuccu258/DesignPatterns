package Behavioral.Iterator.CE2;
/*
 * @created 05/01/2024 - 19:18
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainIterator {
   public static void inDS(Iterator<MonHoc> iterator) {
      while (iterator.hasNext()) {
         MonHoc monHoc = iterator.next();
         System.out.println(monHoc.tenMonHoc + " - " + monHoc.soTC);
      }
   }
   public static void inDS2(Iterator<MonHoc> iterator, Consumer<MonHoc> consumer) {
      while (iterator.hasNext()) {
         MonHoc monHoc = iterator.next();
         consumer.accept(monHoc);
      }
   }
   public static void inDS3(Iterator<MonHoc> iterator, Consumer<MonHoc> consumer){
      while (iterator.hasNext()) {
         iterator.forEachRemaining(consumer);
      }
   }
   public static void main(String[] args) {
      List<MonHoc> list = new ArrayList<>();
      list.add(new MonHoc("Môn học 1",3,500));
      list.add(new MonHoc("Môn học 2",3,100));
      list.add(new MonHoc("Môn học 3",3,100));
      list.add(new MonHoc("Môn học 4",3,100));
      Iterator<MonHoc> iterator =list.iterator();
      inDS(iterator);
      inDS2(iterator, new Consumer<MonHoc>() {
         @Override
         public void accept(MonHoc monHoc) {
            System.out.println("Ten mon hoc: "+monHoc.getTenMonHoc());
            System.out.println("So TC: "+monHoc.getSoTC()+"\n");
         }
      });
      inDS3(iterator, new Consumer<MonHoc>() {
         @Override
         public void accept(MonHoc monHoc) {
            System.out.println("Ten mon hoc: "+monHoc.getTenMonHoc());
            System.out.println("So TC: "+monHoc.getSoTC()+"\n");
         }
      });

       /* ArrayCollection63 collection63 = new ArrayCollection63();
        Iz\+terator63 iterator63 = collection63.createIterator();
        whil e (!iterator63.isDone()){
            System.out.println(iterator63.next());
        }*/
   }
}
