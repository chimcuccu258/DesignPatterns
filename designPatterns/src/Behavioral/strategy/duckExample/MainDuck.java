package Behavioral.strategy.duckExample;

public class MainDuck {
  public static void main(String[] args) {
    Duck duck = new vitQuay();
    duck.setFlyBehavior(new FlyWithWings());
    duck.setQuackBehavior(new SQuack());
    duck.display();
  }
}
