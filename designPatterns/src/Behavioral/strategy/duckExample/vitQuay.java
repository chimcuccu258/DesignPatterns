package Behavioral.strategy.duckExample;

public class vitQuay extends Duck{

  @Override
  public void display() {
    performFly();
    performSQuack();
    performDance();
    swim();
  }


}
