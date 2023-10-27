package Structural.Decorator.Beverage;

public class HouseBlend extends Beverage{
  public HouseBlend(String description) {
    this.description = description;
  }

  @Override
  public int cost() {
    return 10;
  }
}
