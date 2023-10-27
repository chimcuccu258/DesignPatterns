package Behavioral.Strategy.DuckExample;

public abstract class Duck {
  IFlyBehavior flyBehavior;
  IQuackBehavior quackBehavior;
  IDanceBehavior danceBehavior;

  public void setFlyBehavior(IFlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(IQuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  void performFly() {
    System.out.println(flyBehavior.fly());
  }

  void performSQuack() {
    System.out.println(quackBehavior.quack());
  }

  void performDance() {
    System.out.println(danceBehavior.dance());
  }

  public void swim() {
    System.out.println("Vit biet boi");
  }

  public abstract void display();
}
