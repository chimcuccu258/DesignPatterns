package Behavioral.Observer.Topic;
/*
 * @created 05/01/2024 - 18:54
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class MemberB extends Member {
   private final List<TinTuc> receivedTinTucs = new ArrayList<>();

   public MemberB(Topic topic) {
      super(topic);
   }

   @Override
   public void news(TinTuc tinTuc) {
      receivedTinTucs.add(tinTuc);
      System.out.println("Member B received messages:");
      for (int i = 0; i < receivedTinTucs.size(); i++) {
         System.out.println((i + 1) + ": " + receivedTinTucs.get(i).getNoiDung());
         print(receivedTinTucs.get(i));
      }

   }

   @Override
   public void update(TinTuc tinTuc) {
      System.out.println("Member B received messages:");
      System.out.println("Update news: ");
      for (TinTuc receivedTinTuc : receivedTinTucs) {
         if (receivedTinTuc.getId() == tinTuc.getId())
            receivedTinTuc.setNoiDung(tinTuc.getNoiDung());
         print(receivedTinTuc);
      }
   }
   private void print(TinTuc tinTuc){
      System.out.println("\tID news: "+tinTuc.getId());
      System.out.println("\tContent: "+tinTuc.getNoiDung());
   }
}
