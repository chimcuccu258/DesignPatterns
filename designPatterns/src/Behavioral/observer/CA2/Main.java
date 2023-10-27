package Behavioral.observer.CA2;

public class Main {
  public static void main(String[] args) {
    Button button = new Button();

    Activity activity1 = new Activity();
    System.out.println("Activity 1:");
    button.attach(activity1);
    button.click();
    button.click();
    button.click();

    Activity activity2 = new Activity();
    System.out.println("\nActivity 2:");
    button.attach(activity2);
    button.click();
  }
}
