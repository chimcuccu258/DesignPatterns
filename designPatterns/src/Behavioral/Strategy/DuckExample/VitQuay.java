package Behavioral.Strategy.DuckExample;

public class VitQuay extends Duck{

  @Override
  public void display() {
    performFly();
    performSQuack();
    performDance();
    swim();
  }


}
