package Behavioral.Observer.Topic;
/*
 * @created 05/01/2024 - 18:54
 * @project designPatterns
 * @author TaosDev
 */

public abstract class Member implements IReceiveTopic{
   Topic topic;

   public Member(Topic topic) {
      this.topic = topic;
      topic.attach(this);
   }
   public void huyDangKy(){
      topic.detach(this);
   }
}
