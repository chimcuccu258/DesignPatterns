package Behavioral.Observer.Topic;
/*
 * @created 05/01/2024 - 18:55
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class Topic {
   List<IReceiveTopic> observers = new ArrayList<>();
   List<TinTuc> tinTucs = new ArrayList<>();

   public void attach(IReceiveTopic observer) {
      if (!observers.contains(observer))
         observers.add(observer);
   }

   public void detach(IReceiveTopic observer) {
      if (observers.contains(observer))
         observers.remove(observer);
   }

   public void createTinTuc(TinTuc tinTuc) {
      tinTucs.add(tinTuc);
      for (IReceiveTopic observer : observers) {
         observer.news(tinTuc);
      }
   }

   public void updateTinTuc(TinTuc tinTuc) {
      for (TinTuc t : tinTucs) {
         if (t.getId() == tinTuc.getId()) {
            t.setNoiDung(tinTuc.getNoiDung());
            for (IReceiveTopic observer : observers) {
               observer.update(tinTuc);
            }
            break;
         }
      }
   }

}
