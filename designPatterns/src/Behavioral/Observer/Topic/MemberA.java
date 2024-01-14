package Behavioral.Observer.Topic;
/*
 * @created 05/01/2024 - 18:54
 * @project designPatterns
 * @author TaosDev
 */

public class MemberA extends Member {
   public MemberA(Topic topic) {
      super(topic);
   }

   @Override
   public void news(TinTuc tinTuc) {
      System.out.println("Member A received messages");
      System.out.println("--------------news--------------");
      print(tinTuc);
   }

   @Override
   public void update(TinTuc tinTuc) {
      System.out.println("Member A received messages");
      System.out.println("--------------update------------");
      print(tinTuc);
   }
   private void print(TinTuc tinTuc){
      System.out.println("\tID news: "+tinTuc.getId());
      System.out.println("\tContent: "+tinTuc.getNoiDung());
   }

}
