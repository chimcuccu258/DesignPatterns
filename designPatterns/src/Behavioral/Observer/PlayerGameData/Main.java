package Behavioral.Observer.PlayerGameData;
/*
 * @created 05/01/2024 - 18:49
 * @project designPatterns
 * @author TaosDev
 */

public class Main {
   public static void main(String[] args) {
      PlayerData playerData = new PlayerData();

      Dashboard dashboard = new Dashboard();
      playerData.attach(dashboard);
      System.out.println("Notify 1");
      playerData.setThoiGian(120);
      System.out.println("Notify 2");
      playerData.setCountdown(5);
      System.out.println("Notify 3");
      playerData.setGrade(200);
      System.out.println("Notify 4");
      playerData.setThoiGian(90);
      System.out.println("Notify 5");
      playerData.setCountdown(4);
      System.out.println("Notify 6");
      playerData.setGrade(250);
   }
}
