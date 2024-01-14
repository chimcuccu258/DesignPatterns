package Behavioral.Observer.Topic;
/*
 * @created 08/12/2023 - 08:15
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      Topic topic = new Topic();
      Member nhaDauTuA = new MemberA(topic);
      Member nhaDauTuB = new MemberB(topic);

      topic.createTinTuc(new TinTuc(1, "Tin tức số 1"));
      topic.createTinTuc(new TinTuc(2, "Tin tức số 2"));
      //nhaDauTuA.huyDangKy();
      System.out.println("~~~~~~~~~~~~~~~~UPDATE~~~~~~~~~~~~~~~");
      topic.updateTinTuc(new TinTuc(1, "Tin tức số 1 đã được cập nhật"));
   }
}
