package Structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage{
  Beverage beverage;
  public CondimentDecorator(Beverage beverage) {
    this.beverage = beverage;
  }
  @Override
  public String getDescription() {
    return beverage.getDescription();
  }

}
