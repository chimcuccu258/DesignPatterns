package Behavioral.Strategy.DuckExample;

public class MainDuck {
  public static void main(String[] args) {
    Duck duck = new VitQuay();
    duck.setFlyBehavior(new FlyWithWings());
    duck.setQuackBehavior(new SQuack());
    duck.display();
  }
}
