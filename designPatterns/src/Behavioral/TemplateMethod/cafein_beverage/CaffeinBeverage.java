package Behavioral.TemplateMethod.cafein_beverage;

public abstract class CaffeinBeverage {
  public abstract void brew();
  public abstract void addComdiment();
  public void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addComdiment();
  }
  public void boilWater() {
    System.out.println("Dun soi nuoc o 100 do C");
  }
  public void pourInCup() {
    System.out.println("Rot ra coc");
  }
}
