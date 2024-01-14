package Behavioral.Observer.CA2;

public class Main {
   public static void main(String[] args) {
      MyButton button1 = new MyButton();
      Activity activity1 = new Activity(button1);

      button1.click();
      activity1.huyDangKy();
      button1.click();
   }
}
