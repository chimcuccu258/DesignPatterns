package Structural.Decorator.beverage;

public class Milk extends CondimentDecorator{
  public Milk(Beverage beverage) {
    super(beverage);
  }

  @Override
  public int cost() {
    return 4 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return super.getDescription() + "+ Sữa ông Thọ ";
  }
}
