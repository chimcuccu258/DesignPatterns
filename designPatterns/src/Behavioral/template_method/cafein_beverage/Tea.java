package Behavioral.template_method.cafein_beverage;

public class Tea extends CaffeinBeverage{
  @Override
  public void brew() {
    System.out.println("Ngam tui loc tra");
  }

  @Override
  public void addComdiment() {
    System.out.println("Cho sua vao");
  }
}
