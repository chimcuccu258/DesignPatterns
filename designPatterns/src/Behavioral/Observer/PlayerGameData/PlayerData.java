package Behavioral.Observer.PlayerGameData;
/*
 * @created 01/12/2023 - 09:11
 * @project designPatterns
 * @author TaosDev
 */

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
   private long thoiGian;
   private int countdown;
   private int grade;
   private int level; // Thuộc tính mới
   private int bonusReward; // Thuộc tính mới
   private List<IPlayerData> IPlayerData = new ArrayList<>();

   public void setThoiGian(long thoiGian) {
      this.thoiGian = thoiGian;
      notifyAllObservers();
   }

   public void setCountdown(int countdown) {
      this.countdown = countdown;
      notifyAllObservers();
   }

   public void setGrade(int grade) {
      this.grade = grade;
      notifyAllObservers();
   }

   // new
   public void setLevel(int level) {
      this.level = level;
      notifyAllObservers();
   }

   //new
   public void setBonusReward(int bonusReward) {
      this.bonusReward = bonusReward;
      notifyAllObservers();
   }

   public void attach(IPlayerData IPlayerData) {
      this.IPlayerData.add(IPlayerData);
   }

   public void detach(IPlayerData IPlayerData) {
      this.IPlayerData.remove(IPlayerData);
   }

   private void notifyAllObservers() {
      for (IPlayerData IPlayerData : this.IPlayerData) {
         IPlayerData.update(thoiGian, countdown, grade);
      }
   }
}
